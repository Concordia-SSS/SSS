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
import reservationsystem.impl.UserImpl;

public class ConcordiaAirlineClient {
    private static PrintWriter out;
    private static ConsoleReader reader;
    private static String username;
    private static Character mask = '*';

    public enum RealUserType {
        OPERATOR(1), USER(2);
        private int value;

        private RealUserType(int value) {
            this.value = value;
        }
    };

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
            out.println("======>\"" + line + "\"");
            out.flush();

            // implement different functionalities here
            if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit")) {
                break;
            }
        }

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
            return false;
        }
    }
}
