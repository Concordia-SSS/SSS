package reservationsystem.client;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jline.ArgumentCompletor;
import jline.ConsoleReader;
import jline.SimpleCompletor;
import reservationsystem.Seat;
import reservationsystem.impl.AirportImpl;
import reservationsystem.impl.BookingImpl;
import reservationsystem.impl.GeneralFlightImpl;
import reservationsystem.impl.PassengerImpl;
import reservationsystem.impl.PersonImpl;
import reservationsystem.impl.ReservationsystemFactoryImpl;
import reservationsystem.impl.SeatImpl;
import reservationsystem.impl.SpecificFlightImpl;
import reservationsystem.GeneralFlight;
import reservationsystem.impl.CrewImpl;
import reservationsystem.impl.UserImpl;
import reservationsystem.util.ReservationsystemAdapterFactory;

@SuppressWarnings("deprecation")
public class ConcordiaAirlineClient {
	private static PrintWriter out;
	private static ConsoleReader reader;
	private static String username;
	private static Character mask = '*';
	private static UserImpl loginUser;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public enum RealUserType {
		OPERATOR(1), USER(2);
		private int value;

		private RealUserType(int value) {
			this.value = value;
		}
	};

	// TODO: Define maps here as a database.
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
		AirportImpl tmp1 = new AirportImpl();
		tmp1.setAbbr("YUL");
		tmp1.setName("Montreal");
		airports.put(tmp1.getAbbr(), tmp1);
		tmp1 = new AirportImpl();
		tmp1.setAbbr("JFK");
		tmp1.setName("New York");
		airports.put(tmp1.getAbbr(), tmp1);
	}

	private static final Map<String, GeneralFlightImpl> generalFlights;
	static {
		generalFlights = new HashMap<String, GeneralFlightImpl>();
		GeneralFlightImpl tmp11 = new GeneralFlightImpl();
		tmp11.setFlightNo("CA001");
		tmp11.setArrivalTime("1130");
		tmp11.setDepartureTime("1000");
		tmp11.setFrom(airports.get("YUL"));
		tmp11.setTo(airports.get("JFK"));
		generalFlights.put(tmp11.getFlightNo(), tmp11);
	}

	private static final Map<String, CrewImpl> crews;
	static {
		crews = new HashMap<String, CrewImpl>();
		CrewImpl tmp = (CrewImpl) ReservationsystemFactoryImpl.init()
				.createPilot();
		tmp.setEmployeeId("007");
		tmp.setName("Nanda");
		tmp.setMiddleName("Li");
		tmp.setFamilyName("Jun");
		tmp.setResidence("Canada");
		tmp.setAddr("7141 Sherbrooke St.");
		tmp.setEmail("deng.lijun@encs.concordia.ca");
		tmp.setGender(0);
		tmp.setBirthDate(null);
		// tmp.setId(0);
		tmp.setPassportId(null);
		tmp.setPhone(null);
		tmp.setCitizenship("Canadian");
		crews.put(tmp.getEmployeeId(), tmp);
	}

	private static final Map<String, PassengerImpl> passengers;
	static {
		passengers = new HashMap<String, PassengerImpl>();
		PassengerImpl tmp = new PassengerImpl();
		// tmp.setId(0);
		// tmp.setEmployeeId("007");
		tmp.setName("Nanda");
		tmp.setMiddleName("Li");
		tmp.setFamilyName("Jun");
		tmp.setResidence("Canada");
		tmp.setAddr("7141 Sherbrooke St.");
		tmp.setEmail("deng.lijun@encs.concordia.ca");
		tmp.setGender(0);
		tmp.setBirthDate(null);
		// tmp.setId(0);
		tmp.setPassportId(null);
		tmp.setPhone(null);
		tmp.setCitizenship("Canadian");
		passengers.put(tmp.getName(), tmp);
	}

	public static void main(String[] args) throws IOException {

		reader = new ConsoleReader();
		reader.setBellEnabled(false);
		reader.setDebug(new PrintWriter(new FileWriter("writer.debug", true)));

		List completors = new LinkedList();

		completors.add(new SimpleCompletor(ConcordiaAirlineClient.class
				.getResourceAsStream("comp.txt")));

		reader.addCompletor(new ArgumentCompletor(completors));

		String line;
		out = new PrintWriter(System.out);

		printWelcomePage();
		if (!userLogin()) {
			return;
		}

		printCommandHelp();

		while ((line = reader.readLine("ConcordiaAirline> ")) != null) {
			try {

				if (line.equalsIgnoreCase("quit")
						|| line.equalsIgnoreCase("exit")) {
					break;
				}
				if (line.equals("")) {
					continue;
				}

				// TODO: implement different functionalities here
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
					if (line.equalsIgnoreCase("list general flights")) {
						listGeneralFlight();
					} else if (line.equalsIgnoreCase("create booking")) {
						processBooking();
					} else if (line.equalsIgnoreCase("list bookings")) {
						listBookings();
					} else if (line.equalsIgnoreCase("list crew")) {
						listCrew();
					} else if (line.equalsIgnoreCase("create crew")) {
						createCrew();
					} else if (line.equalsIgnoreCase("list passenger")) {
						listPassenger();
					} else if (line.equalsIgnoreCase("create passenger")) {
						createPassenger();
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
			out.println("From: " + gflight.getFrom().getAbbr() + "("
					+ gflight.getFrom().getName() + ")");
			out.println("To  : " + gflight.getTo().getAbbr() + "("
					+ gflight.getTo().getName() + ")");
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
		if (tmp != null && !tmp.equals("")) {

			GeneralFlightImpl gflight = generalFlights.get(tmp);
			if (gflight != null) {
				out.println("The flight No. " + tmp + " already exsit!");
				out.flush();
				return;
			}
			gflight = new GeneralFlightImpl();
			gflight.setFlightNo(tmp);
			tmp = reader.readLine("Enter the airport code of departure: ");
			if (tmp != null && !tmp.equals("")) {
				AirportImpl ap = airports.get(tmp);
				if (ap == null) {
					out.println("The airport " + tmp + " doesn't exsit!");
					out.flush();
					return;
				}
				gflight.setFrom(ap);

				tmp = reader
						.readLine("Enter the airport code of destination: ");
				if (tmp != null && !tmp.equals("")) {
					AirportImpl apDest = airports.get(tmp);
					if (apDest == null) {
						out.println("The airport " + tmp + " doesn't exsit!");
						out.flush();
						return;
					}
					gflight.setTo(apDest);
					tmp = reader.readLine("Enter the departure time: ");
					if (tmp != null && !tmp.equals("")) {
						gflight.setDepartureTime(tmp);

						tmp = reader.readLine("Enter the arrival time: ");
						if (tmp != null && !tmp.equals("")) {
							gflight.setArrivalTime(tmp);
							generalFlights.put(gflight.getFlightNo(), gflight);
							out.println("Add general flight success!");
							out.flush();
							return;
						}
					}

				}

			}
		}
		out.println("error! quit!");
		out.flush();
		return;

	}

	private static void listCrew() throws Exception {
		for (CrewImpl crew : crews.values()) {
			out.println("EmployeeID " + crew.getEmployeeId());
			out.println("Name " + crew.getName());
			out.println("Middle Name " + crew.getMiddleName());
			out.println("Family Name " + crew.getFamilyName());
			out.println("Residence " + crew.getResidence());
			out.println("Address " + crew.getAddr());
			out.println("e-mail " + crew.getEmail());
			out.println("Gender" + crew.getGender());
			out.println("Birth Date" + crew.getBirthDate());
			out.println("ID" + crew.getId());
			out.println("Passport number " + crew.getPassportId());
			out.println("Phone Number" + crew.getPhone());
			out.println("Citizenship " + crew.getCitizenship());
			out.println("");
		}
		out.flush();
		return;

	}

	private static void createCrew() throws Exception {
		if (loginUser.getUserType() != RealUserType.USER.value) {
			out.println("illegal command for your user type!");
			out.flush();
			return;
		}
		String tmp = reader.readLine("EmployeeID: ");
		if (tmp != null && !tmp.equals("")) {
			CrewImpl crew = crews.get(tmp);

			if (crew != null) {
				out.println("The EmployeeID. " + tmp + " already exsit!");
				out.flush();
				return;
			}
			crew = (CrewImpl) ReservationsystemFactoryImpl.init().createPilot();

			tmp = reader.readLine("Enter Crew First Name: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setName(tmp);
			}

			tmp = reader.readLine("Enter Crew Middle Name: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setMiddleName(tmp);
			}

			tmp = reader.readLine("Enter Crew Family Name: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setFamilyName(tmp);
			}

			tmp = reader.readLine("Enter Residence: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setResidence(tmp);
			}

			tmp = reader.readLine("Enter address: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setAddr(tmp);
			}
			tmp = reader.readLine("Enter e-mail: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setEmail(tmp);
			}

			tmp = reader.readLine("Enter Phone: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setPhone(tmp);
			}

			tmp = reader.readLine("Enter Citizenship: ");
			if (tmp != null && !tmp.equals("")) {
				crew.setCitizenship(tmp);
			}

			crews.put(crew.getEmployeeId(), crew);
			out.println("Add Crew success!");
			out.flush();
			return;

		}
		out.println("error! quit!");
		out.flush();
		return;
	}

	private static void printWelcomePage() {
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
					if (usersMap.get(username) != null
							&& usersMap.get(username).getMd5Pwd()
									.equals(password)) {
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

	// Ashis Starts Working From Here for Booking

	private static void printCommandHelp() {
		out.println("|*****************************|");
		out.println("|------- Command Help --------|");
		out.println("|*****************************|");
		out.println("| Command | Param | Usage     |");
		out.println("|-----------------------------|");
		out.println("| exit - exit from application|");
		out.println("| quit - exit from application|");
		out.println("| list general flights        |");
		out.println("| create booking              |");
		out.println("| list bookings               |");
		out.println("| list crew                   |");
		out.println("| create crew                 |");
		out.println("| list passenger              |");
		out.println("| create passenger            |");
		out.println("|_____________________________|");
		out.println("| press tab to autocomplete   |");
		out.println("|_____________________________|");
		out.println("|*****************************|");
		out.println("|---- End Command Help -------|");
		out.println("|*****************************|");
		out.flush();

	}

	private static final Map<String, SpecificFlightImpl> specificFlights;
	static {
		specificFlights = new HashMap<String, SpecificFlightImpl>();

		SpecificFlightImpl tmp = (SpecificFlightImpl) ReservationsystemFactoryImpl
				.init().createSpecificFlight();
		tmp.setId(specificFlights.size() + 1);
		tmp.setGeneralFlight(generalFlights.get("CA001"));
		tmp.setDate(new Date(2013, 12, 25));
		specificFlights.put(Integer.toString(tmp.getId()), tmp);
		tmp = (SpecificFlightImpl) ReservationsystemFactoryImpl.init()
				.createSpecificFlight();
		tmp.setId(specificFlights.size() + 1);
		tmp.setGeneralFlight(generalFlights.get("CA001"));
		tmp.setDate(new Date(2013, 12, 26));
	}

	private static final Map<String, BookingImpl> bookings;
	static {
		bookings = new HashMap<String, BookingImpl>();

	}

	private static final Map<String, PassengerImpl> passengerList;
	static {
		passengerList = new HashMap<String, PassengerImpl>();

		createPassenger("Eugenio", "Wenz", "Toronto", new Date(1972, 12, 4),
				"Canada");
		createPassenger("Milo", "Deakins", "Montreal", new Date(1982, 4, 1),
				"Canada");
		createPassenger("Randy", "Taub", "Ottawa", new Date(1979, 2, 9),
				"Canada");
		createPassenger("Roy", "Boyles", "Montreal", new Date(1978, 3, 5),
				"Canada");
		/*
		 * createPassenger("Brooks", "Platz", "Toronto", new Date(1983, 6, 5),
		 * "Canada"); createPassenger("Damian", "Batres", "Montreal", new
		 * Date(1982, 8, 8), "Canada"); createPassenger("Dave", "Heras",
		 * "Toronto", new Date(1980, 8, 5), "Canada");
		 * createPassenger("Wilfred", "Knupp", "Ottawa", new Date(1972, 1, 10),
		 * "Canada");
		 */

	}

	private static PassengerImpl createPassenger(String firstName,
			String familyName, String address, Date birthDate,
			String citizenship) {
		PassengerImpl tmpPassenger;
		tmpPassenger = (PassengerImpl) ReservationsystemFactoryImpl.init()
				.createPassenger();

		tmpPassenger.setName(firstName);
		tmpPassenger.setFamilyName(familyName);
		tmpPassenger.setAddr(address);
		tmpPassenger.setBirthDate(birthDate);
		tmpPassenger.setCitizenship(citizenship);
		tmpPassenger.setId(passengerList.size() + 1);
		passengerList.put(Integer.toString(tmpPassenger.getId()), tmpPassenger);
		return tmpPassenger;
	}

	private static void processBooking() {
		BookingImpl tmpBooking = (BookingImpl) ReservationsystemFactoryImpl
				.init().createBooking();
		// list flights
		for (SpecificFlightImpl s : specificFlights.values()) {
			out.print(s.getId());
			out.print(" Flight NO (" + s.getGeneralFlight().getFlightNo()
					+ ") ");
			out.print(" From (" + s.getGeneralFlight().getFrom().getName()
					+ ") ");
			out.print(" To (" + s.getGeneralFlight().getTo().getName() + ") ");
			out.print(" " + sdf.format(s.getDate()));
			out.println();
			out.flush();
		}
		// Select Flight by ID
		try {
			String tmpReader = reader.readLine("Enter filght Id to select: ");
			if (tmpReader != null && !tmpReader.equals("")) {

				SpecificFlightImpl sflight = specificFlights.get(tmpReader);
				if (sflight != null) {
					tmpBooking.setSpecificFlight(sflight);
					out.println("The flight No. " + tmpReader + " is selected!");
					out.flush();
				}
			}
		} catch (IOException e) {
			out.println("exception: " + e.getMessage());
			out.flush();
		}

		// list passenger
		for (PassengerImpl p : passengerList.values()) {
			out.print(p.getId());
			out.print(" Name: " + p.getName() + " " + p.getFamilyName());
			out.print(" Date of Birth " + sdf.format(p.getBirthDate()));
			out.print(" Address: " + p.getAddr());
			out.print(" Citizenship: " + p.getCitizenship());
			out.println();
			out.flush();
		}

		// select passenger

		try {
			String tmpReader = reader
					.readLine("Enter passenger Id to select: ");
			if (tmpReader != null && !tmpReader.equals("")) {

				PassengerImpl p = passengerList.get(tmpReader);
				if (p != null) {
					tmpBooking.setPassenger(p);
					out.println("The passenger No. " + tmpReader
							+ " is selected!");
					out.flush();
				}
			}
		} catch (IOException e) {
			out.println("exception: " + e.getMessage());
			out.flush();
		}

		// Select Seat

		try {
			String tmpReader = reader.readLine("Enter Seat No: ");
			if (tmpReader != null && !tmpReader.equals("")) {

				SeatImpl s = (SeatImpl) ReservationsystemFactoryImpl.init()
						.createSeat();
				s.setNo(tmpReader);
				s.setType(0);
				if (s != null) {

					tmpBooking.setSeat(s);
					out.println("The passenger No. " + tmpReader
							+ " is selected!");
					out.flush();
				}
			}
		} catch (IOException e) {
			out.println("exception: " + e.getMessage());
			out.flush();
		}
		// add payment
		// Assuming payment is not handled now

		// Save
		tmpBooking.setBookNo(Integer.toString(bookings.size() + 1));

		bookings.put(tmpBooking.getBookNo(), tmpBooking);

		out.println("Booking Saved..... ");
		// show booking

		listBookings();
		printCommandHelp();

	}

	private static void listBookings() {
		out.println("---- List of Bookings ------ ");

		for (BookingImpl b : bookings.values()) {
			out.print("Booking No: " + b.getBookNo());
			out.print(" Name: " + b.getPassenger().getFamilyName() + ", "
					+ b.getPassenger().getName());
			out.print(" Flight No: "
					+ b.getSpecificFlight().getGeneralFlight().getFlightNo());
			out.print(" Seat No: " + b.getSeat().getNo());
			out.println();

		}
		out.println("---- List of Bookings End------ ");
		out.flush();
	}

	// Lincon's Code

	private static void listPassenger() throws Exception {
		for (PassengerImpl passenger : passengers.values()) {
			// out.println("EmployeeID  : " + passenger.getEmployeeId());
			out.println("Name        : " + passenger.getName());
			out.println("Middle Name : " + passenger.getMiddleName());
			out.println("Family Name : " + passenger.getFamilyName());
			out.println("Residence   : " + passenger.getResidence());
			out.println("Address     : " + passenger.getAddr());
			out.println("e-mail      : " + passenger.getEmail());
			out.println("Gender      : " + passenger.getGender());
			out.println("Birth Date  : " + passenger.getBirthDate());
			out.println("ID          : " + passenger.getId());
			out.println("Passport number : " + passenger.getPassportId());
			out.println("Phone Number    : " + passenger.getPhone());
			out.println("Citizenship     :" + passenger.getCitizenship());
			out.println("");
		}
		out.flush();
		return;

	}

	private static void createPassenger() throws Exception {
		if (loginUser.getUserType() != RealUserType.USER.value) {
			out.println("illegal command for your user type!");
			out.flush();
			return;
		}
		String tmp = reader.readLine("Enter Passenger ID: ");
		if (tmp != null && !tmp.equals("")) {
			PassengerImpl passenger = passengers.get(tmp);

			if (passenger != null) {
				out.println("The PassengerID. " + tmp + " already exsit!");
				out.flush();
				return;
			}
			int temp = Integer.parseInt(tmp);
			passenger = new PassengerImpl();
			passenger.setId(temp);

			tmp = reader.readLine("Enter Passenger First Name: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setName(tmp);
			}

			tmp = reader.readLine("Enter Passenger Middle Name: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setMiddleName(tmp);
			}

			tmp = reader.readLine("Enter Passenger Family Name: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setFamilyName(tmp);
			}

			tmp = reader.readLine("Enter Residence: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setResidence(tmp);
			}

			tmp = reader.readLine("Enter address: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setAddr(tmp);
			}
			tmp = reader.readLine("Enter e-mail: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setEmail(tmp);
			}

			tmp = reader.readLine("Enter Phone: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setPhone(tmp);
			}

			tmp = reader.readLine("Enter Citizenship: ");
			if (tmp != null && !tmp.equals("")) {
				passenger.setCitizenship(tmp);
			}
			temp = passenger.getId();
			tmp = Integer.toString(temp);
			passengers.put(tmp, passenger);
			out.println("Add Passenger successfuly!");
			out.flush();
			return;

		}
		out.println("error! quit!");
		out.flush();
		return;

	}

}
