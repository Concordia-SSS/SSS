/**
 */
package reservationsystem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import reservationsystem.Airport;
import reservationsystem.Attendant;
import reservationsystem.Booking;
import reservationsystem.City;
import reservationsystem.Crew;
import reservationsystem.GeneralFlight;
import reservationsystem.Passenger;
import reservationsystem.PaymentInfo;
import reservationsystem.Person;
import reservationsystem.Pilot;
import reservationsystem.Plane;
import reservationsystem.ReservationsystemFactory;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.Seat;
import reservationsystem.SpecificFlight;
import reservationsystem.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationsystemPackageImpl extends EPackageImpl implements ReservationsystemPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass crewEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass passengerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pilotEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attendantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bookingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalFlightEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass specificFlightEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass planeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass airportEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass paymentInfoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass seatEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType userTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see reservationsystem.ReservationsystemPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ReservationsystemPackageImpl() {
        super(eNS_URI, ReservationsystemFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ReservationsystemPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ReservationsystemPackage init() {
        if (isInited) return (ReservationsystemPackage)EPackage.Registry.INSTANCE.getEPackage(ReservationsystemPackage.eNS_URI);

        // Obtain or create and register package
        ReservationsystemPackageImpl theReservationsystemPackage = (ReservationsystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReservationsystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReservationsystemPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theReservationsystemPackage.createPackageContents();

        // Initialize created meta-data
        theReservationsystemPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theReservationsystemPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ReservationsystemPackage.eNS_URI, theReservationsystemPackage);
        return theReservationsystemPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerson() {
        return personEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Name() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Addr() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Phone() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Citizenship() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Residence() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_MiddleName() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_FamilyName() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_BirthDate() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Id() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_PassportId() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Email() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPerson_Gender() {
        return (EAttribute)personEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUser() {
        return userEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUser_BelongsTo() {
        return (EReference)userEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUser_UserType() {
        return (EAttribute)userEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUser_UserName() {
        return (EAttribute)userEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUser_Md5Pwd() {
        return (EAttribute)userEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCrew() {
        return crewEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCrew_Leader() {
        return (EReference)crewEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCrew_SpecificFlight() {
        return (EReference)crewEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCrew_EmployeeId() {
        return (EAttribute)crewEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getCrew__SetLeader() {
        return crewEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPassenger() {
        return passengerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPassenger_Passenger() {
        return (EReference)passengerEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPassenger_Booking() {
        return (EReference)passengerEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPassenger_SpecialNeeds() {
        return (EAttribute)passengerEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPassenger_FoodPref() {
        return (EAttribute)passengerEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPilot() {
        return pilotEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPilot_CertificationId() {
        return (EAttribute)pilotEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPilot_Experience() {
        return (EAttribute)pilotEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttendant() {
        return attendantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBooking() {
        return bookingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBooking_PaymentInfo() {
        return (EReference)bookingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBooking_Passenger() {
        return (EReference)bookingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBooking_SpecificFlight() {
        return (EReference)bookingEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooking_BookNo() {
        return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooking_BookingStatus() {
        return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBooking_Seats() {
        return (EReference)bookingEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBooking_BaggageInfo() {
        return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralFlight() {
        return generalFlightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeneralFlight_SpecificFlight() {
        return (EReference)generalFlightEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeneralFlight_From() {
        return (EReference)generalFlightEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralFlight_FlightNo() {
        return (EAttribute)generalFlightEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralFlight_DepartureTime() {
        return (EAttribute)generalFlightEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGeneralFlight_To() {
        return (EReference)generalFlightEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralFlight_ArrivalTime() {
        return (EAttribute)generalFlightEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpecificFlight() {
        return specificFlightEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecificFlight_GeneralFlight() {
        return (EReference)specificFlightEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecificFlight_Plane() {
        return (EReference)specificFlightEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecificFlight_Crew() {
        return (EReference)specificFlightEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpecificFlight_Booking() {
        return (EReference)specificFlightEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecificFlight_Id() {
        return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecificFlight_Date() {
        return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecificFlight_RealDepTime() {
        return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecificFlight_RealArriTime() {
        return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSpecificFlight_Status() {
        return (EAttribute)specificFlightEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSpecificFlight__AssignPilot__int() {
        return specificFlightEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getSpecificFlight__AssignAttd__int() {
        return specificFlightEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPlane() {
        return planeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPlane_SpecificFlight() {
        return (EReference)planeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlane_Id() {
        return (EAttribute)planeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlane_Model() {
        return (EAttribute)planeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlane_CrewNum() {
        return (EAttribute)planeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPlane_Capacity() {
        return (EAttribute)planeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPlane_Seats() {
        return (EReference)planeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAirport() {
        return airportEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAirport_City() {
        return (EReference)airportEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAirport_Id() {
        return (EAttribute)airportEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAirport_Name() {
        return (EAttribute)airportEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAirport_Abbr() {
        return (EAttribute)airportEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCity() {
        return cityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCity_Airport() {
        return (EReference)cityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCity_Id() {
        return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCity_Name() {
        return (EAttribute)cityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCity_Abbr() {
        return (EAttribute)cityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPaymentInfo() {
        return paymentInfoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_Id() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_CreateTime() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_Status() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_PayTime() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_Type() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_CardNo() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_CardOwner() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPaymentInfo_CardAddr() {
        return (EAttribute)paymentInfoEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSeat() {
        return seatEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSeat_No() {
        return (EAttribute)seatEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSeat_Type() {
        return (EAttribute)seatEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSeat_IsExit() {
        return (EAttribute)seatEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSeat_Plane() {
        return (EReference)seatEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSeat_Book() {
        return (EReference)seatEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUserType() {
        return userTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservationsystemFactory getReservationsystemFactory() {
        return (ReservationsystemFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        personEClass = createEClass(PERSON);
        createEAttribute(personEClass, PERSON__NAME);
        createEAttribute(personEClass, PERSON__ADDR);
        createEAttribute(personEClass, PERSON__PHONE);
        createEAttribute(personEClass, PERSON__CITIZENSHIP);
        createEAttribute(personEClass, PERSON__RESIDENCE);
        createEAttribute(personEClass, PERSON__MIDDLE_NAME);
        createEAttribute(personEClass, PERSON__FAMILY_NAME);
        createEAttribute(personEClass, PERSON__BIRTH_DATE);
        createEAttribute(personEClass, PERSON__ID);
        createEAttribute(personEClass, PERSON__PASSPORT_ID);
        createEAttribute(personEClass, PERSON__EMAIL);
        createEAttribute(personEClass, PERSON__GENDER);

        userEClass = createEClass(USER);
        createEReference(userEClass, USER__BELONGS_TO);
        createEAttribute(userEClass, USER__USER_TYPE);
        createEAttribute(userEClass, USER__USER_NAME);
        createEAttribute(userEClass, USER__MD5_PWD);

        crewEClass = createEClass(CREW);
        createEReference(crewEClass, CREW__LEADER);
        createEReference(crewEClass, CREW__SPECIFIC_FLIGHT);
        createEAttribute(crewEClass, CREW__EMPLOYEE_ID);
        createEOperation(crewEClass, CREW___SET_LEADER);

        passengerEClass = createEClass(PASSENGER);
        createEReference(passengerEClass, PASSENGER__PASSENGER);
        createEReference(passengerEClass, PASSENGER__BOOKING);
        createEAttribute(passengerEClass, PASSENGER__SPECIAL_NEEDS);
        createEAttribute(passengerEClass, PASSENGER__FOOD_PREF);

        pilotEClass = createEClass(PILOT);
        createEAttribute(pilotEClass, PILOT__CERTIFICATION_ID);
        createEAttribute(pilotEClass, PILOT__EXPERIENCE);

        attendantEClass = createEClass(ATTENDANT);

        bookingEClass = createEClass(BOOKING);
        createEReference(bookingEClass, BOOKING__PAYMENT_INFO);
        createEReference(bookingEClass, BOOKING__PASSENGER);
        createEReference(bookingEClass, BOOKING__SPECIFIC_FLIGHT);
        createEAttribute(bookingEClass, BOOKING__BOOK_NO);
        createEAttribute(bookingEClass, BOOKING__BOOKING_STATUS);
        createEReference(bookingEClass, BOOKING__SEATS);
        createEAttribute(bookingEClass, BOOKING__BAGGAGE_INFO);

        generalFlightEClass = createEClass(GENERAL_FLIGHT);
        createEReference(generalFlightEClass, GENERAL_FLIGHT__SPECIFIC_FLIGHT);
        createEReference(generalFlightEClass, GENERAL_FLIGHT__FROM);
        createEAttribute(generalFlightEClass, GENERAL_FLIGHT__FLIGHT_NO);
        createEAttribute(generalFlightEClass, GENERAL_FLIGHT__DEPARTURE_TIME);
        createEReference(generalFlightEClass, GENERAL_FLIGHT__TO);
        createEAttribute(generalFlightEClass, GENERAL_FLIGHT__ARRIVAL_TIME);

        specificFlightEClass = createEClass(SPECIFIC_FLIGHT);
        createEReference(specificFlightEClass, SPECIFIC_FLIGHT__GENERAL_FLIGHT);
        createEReference(specificFlightEClass, SPECIFIC_FLIGHT__PLANE);
        createEReference(specificFlightEClass, SPECIFIC_FLIGHT__CREW);
        createEReference(specificFlightEClass, SPECIFIC_FLIGHT__BOOKING);
        createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__ID);
        createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__DATE);
        createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__REAL_DEP_TIME);
        createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__REAL_ARRI_TIME);
        createEAttribute(specificFlightEClass, SPECIFIC_FLIGHT__STATUS);
        createEOperation(specificFlightEClass, SPECIFIC_FLIGHT___ASSIGN_PILOT__INT);
        createEOperation(specificFlightEClass, SPECIFIC_FLIGHT___ASSIGN_ATTD__INT);

        planeEClass = createEClass(PLANE);
        createEReference(planeEClass, PLANE__SPECIFIC_FLIGHT);
        createEAttribute(planeEClass, PLANE__ID);
        createEAttribute(planeEClass, PLANE__MODEL);
        createEAttribute(planeEClass, PLANE__CREW_NUM);
        createEAttribute(planeEClass, PLANE__CAPACITY);
        createEReference(planeEClass, PLANE__SEATS);

        airportEClass = createEClass(AIRPORT);
        createEReference(airportEClass, AIRPORT__CITY);
        createEAttribute(airportEClass, AIRPORT__ID);
        createEAttribute(airportEClass, AIRPORT__NAME);
        createEAttribute(airportEClass, AIRPORT__ABBR);

        cityEClass = createEClass(CITY);
        createEReference(cityEClass, CITY__AIRPORT);
        createEAttribute(cityEClass, CITY__ID);
        createEAttribute(cityEClass, CITY__NAME);
        createEAttribute(cityEClass, CITY__ABBR);

        paymentInfoEClass = createEClass(PAYMENT_INFO);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__ID);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__CREATE_TIME);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__STATUS);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__PAY_TIME);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__TYPE);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__CARD_NO);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__CARD_OWNER);
        createEAttribute(paymentInfoEClass, PAYMENT_INFO__CARD_ADDR);

        seatEClass = createEClass(SEAT);
        createEAttribute(seatEClass, SEAT__NO);
        createEAttribute(seatEClass, SEAT__TYPE);
        createEAttribute(seatEClass, SEAT__IS_EXIT);
        createEReference(seatEClass, SEAT__PLANE);
        createEReference(seatEClass, SEAT__BOOK);

        // Create data types
        userTypeEDataType = createEDataType(USER_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        crewEClass.getESuperTypes().add(this.getPerson());
        passengerEClass.getESuperTypes().add(this.getPerson());
        pilotEClass.getESuperTypes().add(this.getCrew());
        attendantEClass.getESuperTypes().add(this.getCrew());
        paymentInfoEClass.getESuperTypes().add(this.getBooking());

        // Initialize classes, features, and operations; add parameters
        initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Citizenship(), ecorePackage.getEString(), "citizenship", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Residence(), ecorePackage.getEString(), "residence", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_MiddleName(), ecorePackage.getEString(), "middleName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_FamilyName(), ecorePackage.getEString(), "FamilyName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_BirthDate(), ecorePackage.getEDate(), "birthDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_PassportId(), ecorePackage.getEString(), "passportId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Email(), ecorePackage.getEString(), "email", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPerson_Gender(), ecorePackage.getEInt(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUser_BelongsTo(), this.getPerson(), null, "belongsTo", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUser_UserType(), this.getUserType(), "userType", "", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUser_Md5Pwd(), ecorePackage.getEString(), "md5Pwd", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(crewEClass, Crew.class, "Crew", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCrew_Leader(), this.getCrew(), null, "Leader", null, 1, 1, Crew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCrew_SpecificFlight(), this.getSpecificFlight(), this.getSpecificFlight_Crew(), "specificFlight", null, 0, -1, Crew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCrew_EmployeeId(), ecorePackage.getEString(), "employeeId", null, 0, 1, Crew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getCrew__SetLeader(), null, "setLeader", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPassenger_Passenger(), this.getBooking(), null, "passenger", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPassenger_Booking(), this.getBooking(), this.getBooking_Passenger(), "booking", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPassenger_SpecialNeeds(), ecorePackage.getEString(), "specialNeeds", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPassenger_FoodPref(), ecorePackage.getEString(), "foodPref", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(pilotEClass, Pilot.class, "Pilot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPilot_CertificationId(), ecorePackage.getEString(), "certificationId", null, 0, 1, Pilot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPilot_Experience(), ecorePackage.getEInt(), "experience", null, 0, 1, Pilot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attendantEClass, Attendant.class, "Attendant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBooking_PaymentInfo(), this.getPaymentInfo(), null, "paymentInfo", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBooking_Passenger(), this.getPassenger(), this.getPassenger_Booking(), "passenger", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBooking_SpecificFlight(), this.getSpecificFlight(), this.getSpecificFlight_Booking(), "specificFlight", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBooking_BookNo(), ecorePackage.getEString(), "bookNo", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBooking_BookingStatus(), ecorePackage.getEInt(), "bookingStatus", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBooking_Seats(), this.getSeat(), this.getSeat_Book(), "seats", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBooking_BaggageInfo(), ecorePackage.getEString(), "baggageInfo", null, 0, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(generalFlightEClass, GeneralFlight.class, "GeneralFlight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGeneralFlight_SpecificFlight(), this.getSpecificFlight(), this.getSpecificFlight_GeneralFlight(), "specificFlight", null, 1, -1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGeneralFlight_From(), this.getAirport(), null, "from", null, 1, 1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneralFlight_FlightNo(), ecorePackage.getEString(), "flightNo", null, 0, 1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneralFlight_DepartureTime(), ecorePackage.getEString(), "departureTime", null, 0, 1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGeneralFlight_To(), this.getAirport(), null, "to", null, 1, 1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneralFlight_ArrivalTime(), ecorePackage.getEString(), "arrivalTime", null, 0, 1, GeneralFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(specificFlightEClass, SpecificFlight.class, "SpecificFlight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSpecificFlight_GeneralFlight(), this.getGeneralFlight(), this.getGeneralFlight_SpecificFlight(), "generalFlight", null, 1, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecificFlight_Plane(), this.getPlane(), this.getPlane_SpecificFlight(), "plane", null, 1, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecificFlight_Crew(), this.getCrew(), this.getCrew_SpecificFlight(), "crew", null, 1, -1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecificFlight_Booking(), this.getBooking(), this.getBooking_SpecificFlight(), "booking", null, 0, -1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecificFlight_Id(), ecorePackage.getEInt(), "id", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecificFlight_Date(), ecorePackage.getEDate(), "date", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecificFlight_RealDepTime(), ecorePackage.getEDate(), "realDepTime", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecificFlight_RealArriTime(), ecorePackage.getEDate(), "realArriTime", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecificFlight_Status(), ecorePackage.getEInt(), "status", null, 0, 1, SpecificFlight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getSpecificFlight__AssignPilot__int(), null, "assignPilot", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEInt(), "personId", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSpecificFlight__AssignAttd__int(), null, "assignAttd", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEInt(), "personId", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(planeEClass, Plane.class, "Plane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPlane_SpecificFlight(), this.getSpecificFlight(), this.getSpecificFlight_Plane(), "specificFlight", null, 0, -1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlane_Id(), ecorePackage.getEString(), "id", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlane_Model(), ecorePackage.getEString(), "model", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlane_CrewNum(), ecorePackage.getEInt(), "crewNum", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlane_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlane_Seats(), this.getSeat(), this.getSeat_Plane(), "seats", null, 1, -1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(airportEClass, Airport.class, "Airport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAirport_City(), this.getCity(), this.getCity_Airport(), "city", null, 1, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAirport_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAirport_Name(), ecorePackage.getEString(), "name", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAirport_Abbr(), ecorePackage.getEString(), "abbr", null, 0, 1, Airport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCity_Airport(), this.getAirport(), this.getAirport_City(), "airport", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCity_Id(), ecorePackage.getEInt(), "id", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCity_Abbr(), ecorePackage.getEString(), "abbr", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(paymentInfoEClass, PaymentInfo.class, "PaymentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPaymentInfo_Id(), ecorePackage.getEString(), "id", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_CreateTime(), ecorePackage.getEDate(), "createTime", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_Status(), ecorePackage.getEInt(), "status", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_PayTime(), ecorePackage.getEDate(), "payTime", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_Type(), ecorePackage.getEInt(), "type", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_CardNo(), ecorePackage.getEString(), "cardNo", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_CardOwner(), ecorePackage.getEString(), "cardOwner", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPaymentInfo_CardAddr(), ecorePackage.getEString(), "cardAddr", null, 0, 1, PaymentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSeat_No(), ecorePackage.getEString(), "no", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSeat_Type(), ecorePackage.getEInt(), "type", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSeat_IsExit(), ecorePackage.getEBoolean(), "isExit", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSeat_Plane(), this.getPlane(), this.getPlane_Seats(), "plane", null, 1, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSeat_Book(), this.getBooking(), this.getBooking_Seats(), "book", null, 1, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(userTypeEDataType, Object.class, "UserType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ReservationsystemPackageImpl
