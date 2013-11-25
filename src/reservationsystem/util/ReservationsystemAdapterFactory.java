/**
 */
package reservationsystem.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import reservationsystem.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see reservationsystem.ReservationsystemPackage
 * @generated
 */
public class ReservationsystemAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ReservationsystemPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservationsystemAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ReservationsystemPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReservationsystemSwitch<Adapter> modelSwitch =
        new ReservationsystemSwitch<Adapter>() {
            @Override
            public Adapter casePerson(Person object) {
                return createPersonAdapter();
            }
            @Override
            public Adapter caseUser(User object) {
                return createUserAdapter();
            }
            @Override
            public Adapter caseCrew(Crew object) {
                return createCrewAdapter();
            }
            @Override
            public Adapter casePassenger(Passenger object) {
                return createPassengerAdapter();
            }
            @Override
            public Adapter casePilot(Pilot object) {
                return createPilotAdapter();
            }
            @Override
            public Adapter caseAttendant(Attendant object) {
                return createAttendantAdapter();
            }
            @Override
            public Adapter caseBooking(Booking object) {
                return createBookingAdapter();
            }
            @Override
            public Adapter caseGeneralFlight(GeneralFlight object) {
                return createGeneralFlightAdapter();
            }
            @Override
            public Adapter caseSpecificFlight(SpecificFlight object) {
                return createSpecificFlightAdapter();
            }
            @Override
            public Adapter casePlane(Plane object) {
                return createPlaneAdapter();
            }
            @Override
            public Adapter caseAirport(Airport object) {
                return createAirportAdapter();
            }
            @Override
            public Adapter caseCity(City object) {
                return createCityAdapter();
            }
            @Override
            public Adapter casePaymentInfo(PaymentInfo object) {
                return createPaymentInfoAdapter();
            }
            @Override
            public Adapter caseSeat(Seat object) {
                return createSeatAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Person
     * @generated
     */
    public Adapter createPersonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.User <em>User</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.User
     * @generated
     */
    public Adapter createUserAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Crew <em>Crew</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Crew
     * @generated
     */
    public Adapter createCrewAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Passenger <em>Passenger</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Passenger
     * @generated
     */
    public Adapter createPassengerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Pilot <em>Pilot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Pilot
     * @generated
     */
    public Adapter createPilotAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Attendant <em>Attendant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Attendant
     * @generated
     */
    public Adapter createAttendantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Booking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Booking
     * @generated
     */
    public Adapter createBookingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.GeneralFlight <em>General Flight</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.GeneralFlight
     * @generated
     */
    public Adapter createGeneralFlightAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.SpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.SpecificFlight
     * @generated
     */
    public Adapter createSpecificFlightAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Plane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Plane
     * @generated
     */
    public Adapter createPlaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Airport <em>Airport</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Airport
     * @generated
     */
    public Adapter createAirportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.City <em>City</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.City
     * @generated
     */
    public Adapter createCityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.PaymentInfo <em>Payment Info</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.PaymentInfo
     * @generated
     */
    public Adapter createPaymentInfoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link reservationsystem.Seat <em>Seat</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see reservationsystem.Seat
     * @generated
     */
    public Adapter createSeatAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ReservationsystemAdapterFactory
