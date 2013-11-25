/**
 */
package reservationsystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import reservationsystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationsystemFactoryImpl extends EFactoryImpl implements ReservationsystemFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ReservationsystemFactory init() {
        try {
            ReservationsystemFactory theReservationsystemFactory = (ReservationsystemFactory)EPackage.Registry.INSTANCE.getEFactory(ReservationsystemPackage.eNS_URI);
            if (theReservationsystemFactory != null) {
                return theReservationsystemFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ReservationsystemFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservationsystemFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ReservationsystemPackage.USER: return createUser();
            case ReservationsystemPackage.PASSENGER: return createPassenger();
            case ReservationsystemPackage.PILOT: return createPilot();
            case ReservationsystemPackage.ATTENDANT: return createAttendant();
            case ReservationsystemPackage.BOOKING: return createBooking();
            case ReservationsystemPackage.GENERAL_FLIGHT: return createGeneralFlight();
            case ReservationsystemPackage.SPECIFIC_FLIGHT: return createSpecificFlight();
            case ReservationsystemPackage.PLANE: return createPlane();
            case ReservationsystemPackage.AIRPORT: return createAirport();
            case ReservationsystemPackage.CITY: return createCity();
            case ReservationsystemPackage.PAYMENT_INFO: return createPaymentInfo();
            case ReservationsystemPackage.SEAT: return createSeat();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ReservationsystemPackage.USER_TYPE:
                return createUserTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ReservationsystemPackage.USER_TYPE:
                return convertUserTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public User createUser() {
        UserImpl user = new UserImpl();
        return user;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Passenger createPassenger() {
        PassengerImpl passenger = new PassengerImpl();
        return passenger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pilot createPilot() {
        PilotImpl pilot = new PilotImpl();
        return pilot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attendant createAttendant() {
        AttendantImpl attendant = new AttendantImpl();
        return attendant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking createBooking() {
        BookingImpl booking = new BookingImpl();
        return booking;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralFlight createGeneralFlight() {
        GeneralFlightImpl generalFlight = new GeneralFlightImpl();
        return generalFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecificFlight createSpecificFlight() {
        SpecificFlightImpl specificFlight = new SpecificFlightImpl();
        return specificFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Plane createPlane() {
        PlaneImpl plane = new PlaneImpl();
        return plane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Airport createAirport() {
        AirportImpl airport = new AirportImpl();
        return airport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City createCity() {
        CityImpl city = new CityImpl();
        return city;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PaymentInfo createPaymentInfo() {
        PaymentInfoImpl paymentInfo = new PaymentInfoImpl();
        return paymentInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Seat createSeat() {
        SeatImpl seat = new SeatImpl();
        return seat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createUserTypeFromString(EDataType eDataType, String initialValue) {
        return super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservationsystemPackage getReservationsystemPackage() {
        return (ReservationsystemPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ReservationsystemPackage getPackage() {
        return ReservationsystemPackage.eINSTANCE;
    }

} //ReservationsystemFactoryImpl
