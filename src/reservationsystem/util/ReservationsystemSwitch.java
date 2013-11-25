/**
 */
package reservationsystem.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import reservationsystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see reservationsystem.ReservationsystemPackage
 * @generated
 */
public class ReservationsystemSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ReservationsystemPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservationsystemSwitch() {
        if (modelPackage == null) {
            modelPackage = ReservationsystemPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ReservationsystemPackage.PERSON: {
                Person person = (Person)theEObject;
                T result = casePerson(person);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.USER: {
                User user = (User)theEObject;
                T result = caseUser(user);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.CREW: {
                Crew crew = (Crew)theEObject;
                T result = caseCrew(crew);
                if (result == null) result = casePerson(crew);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.PASSENGER: {
                Passenger passenger = (Passenger)theEObject;
                T result = casePassenger(passenger);
                if (result == null) result = casePerson(passenger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.PILOT: {
                Pilot pilot = (Pilot)theEObject;
                T result = casePilot(pilot);
                if (result == null) result = caseCrew(pilot);
                if (result == null) result = casePerson(pilot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.ATTENDANT: {
                Attendant attendant = (Attendant)theEObject;
                T result = caseAttendant(attendant);
                if (result == null) result = caseCrew(attendant);
                if (result == null) result = casePerson(attendant);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.BOOKING: {
                Booking booking = (Booking)theEObject;
                T result = caseBooking(booking);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.GENERAL_FLIGHT: {
                GeneralFlight generalFlight = (GeneralFlight)theEObject;
                T result = caseGeneralFlight(generalFlight);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.SPECIFIC_FLIGHT: {
                SpecificFlight specificFlight = (SpecificFlight)theEObject;
                T result = caseSpecificFlight(specificFlight);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.PLANE: {
                Plane plane = (Plane)theEObject;
                T result = casePlane(plane);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.AIRPORT: {
                Airport airport = (Airport)theEObject;
                T result = caseAirport(airport);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.CITY: {
                City city = (City)theEObject;
                T result = caseCity(city);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.PAYMENT_INFO: {
                PaymentInfo paymentInfo = (PaymentInfo)theEObject;
                T result = casePaymentInfo(paymentInfo);
                if (result == null) result = caseBooking(paymentInfo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ReservationsystemPackage.SEAT: {
                Seat seat = (Seat)theEObject;
                T result = caseSeat(seat);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Person</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePerson(Person object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>User</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>User</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUser(User object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Crew</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Crew</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCrew(Crew object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Passenger</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Passenger</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePassenger(Passenger object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pilot</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pilot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePilot(Pilot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attendant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attendant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttendant(Attendant object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooking(Booking object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>General Flight</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>General Flight</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneralFlight(GeneralFlight object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Specific Flight</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Specific Flight</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpecificFlight(SpecificFlight object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePlane(Plane object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Airport</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Airport</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAirport(Airport object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>City</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>City</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCity(City object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Payment Info</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Payment Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePaymentInfo(PaymentInfo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Seat</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Seat</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSeat(Seat object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ReservationsystemSwitch
