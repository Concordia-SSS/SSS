/**
 */
package reservationsystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reservationsystem.Booking;
import reservationsystem.Passenger;
import reservationsystem.PaymentInfo;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.Seat;
import reservationsystem.SpecificFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.BookingImpl#getPaymentInfo <em>Payment Info</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getBookNo <em>Book No</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getBookingStatus <em>Booking Status</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getSeats <em>Seats</em>}</li>
 *   <li>{@link reservationsystem.impl.BookingImpl#getBaggageInfo <em>Baggage Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
    /**
     * The cached value of the '{@link #getPaymentInfo() <em>Payment Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPaymentInfo()
     * @generated
     * @ordered
     */
    protected EList<PaymentInfo> paymentInfo;

    /**
     * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassenger()
     * @generated
     * @ordered
     */
    protected EList<Passenger> passenger;

    /**
     * The cached value of the '{@link #getSpecificFlight() <em>Specific Flight</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecificFlight()
     * @generated
     * @ordered
     */
    protected EList<SpecificFlight> specificFlight;

    /**
     * The default value of the '{@link #getBookNo() <em>Book No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBookNo()
     * @generated
     * @ordered
     */
    protected static final String BOOK_NO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBookNo() <em>Book No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBookNo()
     * @generated
     * @ordered
     */
    protected String bookNo = BOOK_NO_EDEFAULT;

    /**
     * The default value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBookingStatus()
     * @generated
     * @ordered
     */
    protected static final int BOOKING_STATUS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getBookingStatus() <em>Booking Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBookingStatus()
     * @generated
     * @ordered
     */
    protected int bookingStatus = BOOKING_STATUS_EDEFAULT;

    /**
     * The cached value of the '{@link #getSeats() <em>Seats</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeats()
     * @generated
     * @ordered
     */
    protected EList<Seat> seats;

    /**
     * The default value of the '{@link #getBaggageInfo() <em>Baggage Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaggageInfo()
     * @generated
     * @ordered
     */
    protected static final String BAGGAGE_INFO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaggageInfo() <em>Baggage Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaggageInfo()
     * @generated
     * @ordered
     */
    protected String baggageInfo = BAGGAGE_INFO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BookingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.BOOKING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PaymentInfo> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new EObjectResolvingEList<PaymentInfo>(PaymentInfo.class, this, ReservationsystemPackage.BOOKING__PAYMENT_INFO);
        }
        return paymentInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Passenger> getPassenger() {
        if (passenger == null) {
            passenger = new EObjectWithInverseResolvingEList<Passenger>(Passenger.class, this, ReservationsystemPackage.BOOKING__PASSENGER, ReservationsystemPackage.PASSENGER__BOOKING);
        }
        return passenger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpecificFlight> getSpecificFlight() {
        if (specificFlight == null) {
            specificFlight = new EObjectWithInverseResolvingEList.ManyInverse<SpecificFlight>(SpecificFlight.class, this, ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT, ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING);
        }
        return specificFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBookNo() {
        return bookNo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBookNo(String newBookNo) {
        String oldBookNo = bookNo;
        bookNo = newBookNo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.BOOKING__BOOK_NO, oldBookNo, bookNo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getBookingStatus() {
        return bookingStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBookingStatus(int newBookingStatus) {
        int oldBookingStatus = bookingStatus;
        bookingStatus = newBookingStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.BOOKING__BOOKING_STATUS, oldBookingStatus, bookingStatus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Seat> getSeats() {
        if (seats == null) {
            seats = new EObjectWithInverseResolvingEList<Seat>(Seat.class, this, ReservationsystemPackage.BOOKING__SEATS, ReservationsystemPackage.SEAT__BOOK);
        }
        return seats;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBaggageInfo() {
        return baggageInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBaggageInfo(String newBaggageInfo) {
        String oldBaggageInfo = baggageInfo;
        baggageInfo = newBaggageInfo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.BOOKING__BAGGAGE_INFO, oldBaggageInfo, baggageInfo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.BOOKING__PASSENGER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassenger()).basicAdd(otherEnd, msgs);
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificFlight()).basicAdd(otherEnd, msgs);
            case ReservationsystemPackage.BOOKING__SEATS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeats()).basicAdd(otherEnd, msgs);
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
            case ReservationsystemPackage.BOOKING__PASSENGER:
                return ((InternalEList<?>)getPassenger()).basicRemove(otherEnd, msgs);
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                return ((InternalEList<?>)getSpecificFlight()).basicRemove(otherEnd, msgs);
            case ReservationsystemPackage.BOOKING__SEATS:
                return ((InternalEList<?>)getSeats()).basicRemove(otherEnd, msgs);
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
            case ReservationsystemPackage.BOOKING__PAYMENT_INFO:
                return getPaymentInfo();
            case ReservationsystemPackage.BOOKING__PASSENGER:
                return getPassenger();
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                return getSpecificFlight();
            case ReservationsystemPackage.BOOKING__BOOK_NO:
                return getBookNo();
            case ReservationsystemPackage.BOOKING__BOOKING_STATUS:
                return getBookingStatus();
            case ReservationsystemPackage.BOOKING__SEATS:
                return getSeats();
            case ReservationsystemPackage.BOOKING__BAGGAGE_INFO:
                return getBaggageInfo();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ReservationsystemPackage.BOOKING__PAYMENT_INFO:
                getPaymentInfo().clear();
                getPaymentInfo().addAll((Collection<? extends PaymentInfo>)newValue);
                return;
            case ReservationsystemPackage.BOOKING__PASSENGER:
                getPassenger().clear();
                getPassenger().addAll((Collection<? extends Passenger>)newValue);
                return;
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                getSpecificFlight().addAll((Collection<? extends SpecificFlight>)newValue);
                return;
            case ReservationsystemPackage.BOOKING__BOOK_NO:
                setBookNo((String)newValue);
                return;
            case ReservationsystemPackage.BOOKING__BOOKING_STATUS:
                setBookingStatus((Integer)newValue);
                return;
            case ReservationsystemPackage.BOOKING__SEATS:
                getSeats().clear();
                getSeats().addAll((Collection<? extends Seat>)newValue);
                return;
            case ReservationsystemPackage.BOOKING__BAGGAGE_INFO:
                setBaggageInfo((String)newValue);
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
            case ReservationsystemPackage.BOOKING__PAYMENT_INFO:
                getPaymentInfo().clear();
                return;
            case ReservationsystemPackage.BOOKING__PASSENGER:
                getPassenger().clear();
                return;
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                return;
            case ReservationsystemPackage.BOOKING__BOOK_NO:
                setBookNo(BOOK_NO_EDEFAULT);
                return;
            case ReservationsystemPackage.BOOKING__BOOKING_STATUS:
                setBookingStatus(BOOKING_STATUS_EDEFAULT);
                return;
            case ReservationsystemPackage.BOOKING__SEATS:
                getSeats().clear();
                return;
            case ReservationsystemPackage.BOOKING__BAGGAGE_INFO:
                setBaggageInfo(BAGGAGE_INFO_EDEFAULT);
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
            case ReservationsystemPackage.BOOKING__PAYMENT_INFO:
                return paymentInfo != null && !paymentInfo.isEmpty();
            case ReservationsystemPackage.BOOKING__PASSENGER:
                return passenger != null && !passenger.isEmpty();
            case ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT:
                return specificFlight != null && !specificFlight.isEmpty();
            case ReservationsystemPackage.BOOKING__BOOK_NO:
                return BOOK_NO_EDEFAULT == null ? bookNo != null : !BOOK_NO_EDEFAULT.equals(bookNo);
            case ReservationsystemPackage.BOOKING__BOOKING_STATUS:
                return bookingStatus != BOOKING_STATUS_EDEFAULT;
            case ReservationsystemPackage.BOOKING__SEATS:
                return seats != null && !seats.isEmpty();
            case ReservationsystemPackage.BOOKING__BAGGAGE_INFO:
                return BAGGAGE_INFO_EDEFAULT == null ? baggageInfo != null : !BAGGAGE_INFO_EDEFAULT.equals(baggageInfo);
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
        result.append(" (bookNo: ");
        result.append(bookNo);
        result.append(", bookingStatus: ");
        result.append(bookingStatus);
        result.append(", baggageInfo: ");
        result.append(baggageInfo);
        result.append(')');
        return result.toString();
    }

} //BookingImpl
