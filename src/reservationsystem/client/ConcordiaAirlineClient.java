package reservationsystem.client;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jline.ArgumentCompletor;
import jline.ConsoleReader;
import jline.SimpleCompletor;
import reservationsystem.impl.AirportImpl;
import reservationsystem.impl.GeneralFlightImpl;
import reservationsystem.impl.UserImpl;

public class ConcordiaAirlineClient {
    private static PrintWriter out;
    private static ConsoleReader reader;
    private static String username;
    private static Character mask = '*';
    private static UserImpl loginUser;

    public enum RealUserType {
        OPERATOR(1), USER(2);
        private int value;

        private RealUserType(int value) {
            this.value = value;
        }
    };

    // Define maps here as a database.
    private static final Map<String, UserImpl> usersMap;
    static {
        usersMap = new HashMap<String, UserImpl>();
        UserImpl tmp = new UserImpl();
        tmp.setUserName("root");
        tmp.setMd5Pwd("root");
        tmp.setUserType(RealUserType.OPERATOR.value);
        usersMap.put("root", tmp);
        tmp = new UserImpl();
        tmp.setUserName("xing");
        tmp.setMd5Pwd("wu");
        tmp.setUserType(RealUserType.USER.value);
        usersMap.put("xing", tmp);
    }

    private static final Map<String, AirportImpl> airports;
    static {
        airports = new HashMap<String, AirportImpl>();
        AirportImpl tmp = new AirportImpl();
        tmp.setAbbr("YUL");
        tmp.setName("Montreal");
        airports.put(tmp.getAbbr(), tmp);
        tmp = new AirportImpl();
        tmp.setAbbr("JFK");
        tmp.setName("New York");
        airports.put(tmp.getAbbr(), tmp);
    }

    private static final Map<String, GeneralFlightImpl> generalFlights;
    static {
        generalFlights = new HashMap<String, GeneralFlightImpl>();
        GeneralFlightImpl tmp = new GeneralFlightImpl();
        tmp.setFlightNo("CA001");
        tmp.setArrivalTime("1130");
        tmp.setDepartureTime("1000");
        tmp.setFrom(airports.get("YUL"));
        tmp.setTo(airports.get("JFK"));
        generalFlights.put(tmp.getFlightNo(), tmp);
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        reader = new ConsoleReader();
        reader.setBellEnabled(false);
        reader.setDebug(new PrintWriter(new FileWriter("writer.debug", true)));

        List completors = new LinkedList();

        completors.add(new SimpleCompletor(ConcordiaAirlineClient.class.getResourceAsStream("comp.txt")));

        reader.addCompletor(new ArgumentCompletor(completors));

        String line;
        out = new PrintWriter(System.out);

        printWelcomePage();
        if (!userLogin()) {
            return;
        }

        while ((line = reader.readLine("ConcordiaAirline> ")) != null) {
            try {
                if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit")) {
                    break;
                }
                if (line.equals("")) {
                    continue;
                }

                // implement different functionalities here
                if (loginUser.getUserType() == RealUserType.OPERATOR.value) {
                    if (line.equalsIgnoreCase("create general flight")) {
                        createGeneralFlight();
                    } else if (line.equalsIgnoreCase("list general flights")) {
                        listGeneralFlight();
                    } else {
                        out.println("No such command: \"" + line + "\"");
                        out.flush();
                    }

                } else if (loginUser.getUserType() == RealUserType.USER.value) {
                    if (line.equalsIgnoreCase("listFlight")) {

                    } else {
                        out.println("No such command: \"" + line + "\"");
                        out.flush();
                    }
                }
            } catch (Exception e) {
                out.println("exception: " + e.getMessage());
                out.flush();
            }
        }

    }

    private static void listGeneralFlight() throws Exception {
        for (GeneralFlightImpl gflight : generalFlights.values()) {
            out.println("==Flight " + gflight.getFlightNo() + "==");
            out.println("From: " + gflight.getFrom().getAbbr() + "(" + gflight.getFrom().getName() + ")");
            out.println("To  : " + gflight.getTo().getAbbr() + "(" + gflight.getTo().getName() + ")");
            out.println("Depart: " + gflight.getDepartureTime());
            out.println("Arrive: " + gflight.getArrivalTime());
            out.println("");
        }
        out.flush();
        return;

    }

    private static void createGeneralFlight() throws Exception {
        if (loginUser.getUserType() != RealUserType.OPERATOR.value) {
            out.println("illegal command for your user type!");
            out.flush();
            return;
        }
        String tmp = reader.readLine("Enter the filght No.: ");
        out.println("flight no. is " + tmp);
        out.flush();
        return;

    }

    private static void printWelcomePage() {
        // TODO Auto-generated method stub
        out.println("Welcome to Concordia Airline Reservation System!");
        out.println("Powered by SSS");
        out.flush();
    }

    private static boolean userLogin() {
        try {
            username = reader.readLine("Enter user name: ");
            if (username != null) {
                String password = reader.readLine("Enter password: ", mask);
                if (password != null) {
                    if (usersMap.get(username) != null && usersMap.get(username).getMd5Pwd().equals(password)) {
                        loginUser = usersMap.get(username);
                        out.println("Login Success.");
                        out.flush();
                        return true;
                    }
                }
            }
            out.println("Invalid UserName or Password.");
            out.flush();
            return false;
        } catch (IOException e) {
            out.println("exception: " + e.getMessage());
            out.flush();
            return false;
        }
    }
}
