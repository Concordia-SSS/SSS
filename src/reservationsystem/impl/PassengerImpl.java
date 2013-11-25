/**
 */
package reservationsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reservationsystem.Booking;
import reservationsystem.Passenger;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.PassengerImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link reservationsystem.impl.PassengerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link reservationsystem.impl.PassengerImpl#getSpecialNeeds <em>Special Needs</em>}</li>
 *   <li>{@link reservationsystem.impl.PassengerImpl#getFoodPref <em>Food Pref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerImpl extends PersonImpl implements Passenger {
    /**
     * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassenger()
     * @generated
     * @ordered
     */
    protected Booking passenger;

    /**
     * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooking()
     * @generated
     * @ordered
     */
    protected Booking booking;

    /**
     * The default value of the '{@link #getSpecialNeeds() <em>Special Needs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeeds()
     * @generated
     * @ordered
     */
    protected static final String SPECIAL_NEEDS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpecialNeeds() <em>Special Needs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialNeeds()
     * @generated
     * @ordered
     */
    protected String specialNeeds = SPECIAL_NEEDS_EDEFAULT;

    /**
     * The default value of the '{@link #getFoodPref() <em>Food Pref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFoodPref()
     * @generated
     * @ordered
     */
    protected static final String FOOD_PREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFoodPref() <em>Food Pref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFoodPref()
     * @generated
     * @ordered
     */
    protected String foodPref = FOOD_PREF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PassengerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.PASSENGER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking getPassenger() {
        if (passenger != null && passenger.eIsProxy()) {
            InternalEObject oldPassenger = (InternalEObject)passenger;
            passenger = (Booking)eResolveProxy(oldPassenger);
            if (passenger != oldPassenger) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.PASSENGER__PASSENGER, oldPassenger, passenger));
            }
        }
        return passenger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking basicGetPassenger() {
        return passenger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassenger(Booking newPassenger) {
        Booking oldPassenger = passenger;
        passenger = newPassenger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PASSENGER__PASSENGER, oldPassenger, passenger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking getBooking() {
        if (booking != null && booking.eIsProxy()) {
            InternalEObject oldBooking = (InternalEObject)booking;
            booking = (Booking)eResolveProxy(oldBooking);
            if (booking != oldBooking) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.PASSENGER__BOOKING, oldBooking, booking));
            }
        }
        return booking;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking basicGetBooking() {
        return booking;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBooking(Booking newBooking, NotificationChain msgs) {
        Booking oldBooking = booking;
        booking = newBooking;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PASSENGER__BOOKING, oldBooking, newBooking);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBooking(Booking newBooking) {
        if (newBooking != booking) {
            NotificationChain msgs = null;
            if (booking != null)
                msgs = ((InternalEObject)booking).eInverseRemove(this, ReservationsystemPackage.BOOKING__PASSENGER, Booking.class, msgs);
            if (newBooking != null)
                msgs = ((InternalEObject)newBooking).eInverseAdd(this, ReservationsystemPackage.BOOKING__PASSENGER, Booking.class, msgs);
            msgs = basicSetBooking(newBooking, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PASSENGER__BOOKING, newBooking, newBooking));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecialNeeds(String newSpecialNeeds) {
        String oldSpecialNeeds = specialNeeds;
        specialNeeds = newSpecialNeeds;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PASSENGER__SPECIAL_NEEDS, oldSpecialNeeds, specialNeeds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFoodPref() {
        return foodPref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFoodPref(String newFoodPref) {
        String oldFoodPref = foodPref;
        foodPref = newFoodPref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PASSENGER__FOOD_PREF, oldFoodPref, foodPref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__BOOKING:
                if (booking != null)
                    msgs = ((InternalEObject)booking).eInverseRemove(this, ReservationsystemPackage.BOOKING__PASSENGER, Booking.class, msgs);
                return basicSetBooking((Booking)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__BOOKING:
                return basicSetBooking(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__PASSENGER:
                if (resolve) return getPassenger();
                return basicGetPassenger();
            case ReservationsystemPackage.PASSENGER__BOOKING:
                if (resolve) return getBooking();
                return basicGetBooking();
            case ReservationsystemPackage.PASSENGER__SPECIAL_NEEDS:
                return getSpecialNeeds();
            case ReservationsystemPackage.PASSENGER__FOOD_PREF:
                return getFoodPref();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__PASSENGER:
                setPassenger((Booking)newValue);
                return;
            case ReservationsystemPackage.PASSENGER__BOOKING:
                setBooking((Booking)newValue);
                return;
            case ReservationsystemPackage.PASSENGER__SPECIAL_NEEDS:
                setSpecialNeeds((String)newValue);
                return;
            case ReservationsystemPackage.PASSENGER__FOOD_PREF:
                setFoodPref((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__PASSENGER:
                setPassenger((Booking)null);
                return;
            case ReservationsystemPackage.PASSENGER__BOOKING:
                setBooking((Booking)null);
                return;
            case ReservationsystemPackage.PASSENGER__SPECIAL_NEEDS:
                setSpecialNeeds(SPECIAL_NEEDS_EDEFAULT);
                return;
            case ReservationsystemPackage.PASSENGER__FOOD_PREF:
                setFoodPref(FOOD_PREF_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.PASSENGER__PASSENGER:
                return passenger != null;
            case ReservationsystemPackage.PASSENGER__BOOKING:
                return booking != null;
            case ReservationsystemPackage.PASSENGER__SPECIAL_NEEDS:
                return SPECIAL_NEEDS_EDEFAULT == null ? specialNeeds != null : !SPECIAL_NEEDS_EDEFAULT.equals(specialNeeds);
            case ReservationsystemPackage.PASSENGER__FOOD_PREF:
                return FOOD_PREF_EDEFAULT == null ? foodPref != null : !FOOD_PREF_EDEFAULT.equals(foodPref);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (specialNeeds: ");
        result.append(specialNeeds);
        result.append(", foodPref: ");
        result.append(foodPref);
        result.append(')');
        return result.toString();
    }

} //PassengerImpl
