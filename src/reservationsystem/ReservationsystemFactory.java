/**
 */
package reservationsystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see reservationsystem.ReservationsystemPackage
 * @generated
 */
public interface ReservationsystemFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReservationsystemFactory eINSTANCE = reservationsystem.impl.ReservationsystemFactoryImpl.init();

    /**
     * Returns a new object of class '<em>User</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User</em>'.
     * @generated
     */
    User createUser();

    /**
     * Returns a new object of class '<em>Passenger</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Passenger</em>'.
     * @generated
     */
    Passenger createPassenger();

    /**
     * Returns a new object of class '<em>Pilot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pilot</em>'.
     * @generated
     */
    Pilot createPilot();

    /**
     * Returns a new object of class '<em>Attendant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attendant</em>'.
     * @generated
     */
    Attendant createAttendant();

    /**
     * Returns a new object of class '<em>Booking</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Booking</em>'.
     * @generated
     */
    Booking createBooking();

    /**
     * Returns a new object of class '<em>General Flight</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Flight</em>'.
     * @generated
     */
    GeneralFlight createGeneralFlight();

    /**
     * Returns a new object of class '<em>Specific Flight</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Specific Flight</em>'.
     * @generated
     */
    SpecificFlight createSpecificFlight();

    /**
     * Returns a new object of class '<em>Plane</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Plane</em>'.
     * @generated
     */
    Plane createPlane();

    /**
     * Returns a new object of class '<em>Airport</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Airport</em>'.
     * @generated
     */
    Airport createAirport();

    /**
     * Returns a new object of class '<em>City</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>City</em>'.
     * @generated
     */
    City createCity();

    /**
     * Returns a new object of class '<em>Payment Info</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Payment Info</em>'.
     * @generated
     */
    PaymentInfo createPaymentInfo();

    /**
     * Returns a new object of class '<em>Seat</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Seat</em>'.
     * @generated
     */
    Seat createSeat();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ReservationsystemPackage getReservationsystemPackage();

} //ReservationsystemFactory
