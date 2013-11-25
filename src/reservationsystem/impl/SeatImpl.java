/**
 */
package reservationsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reservationsystem.Booking;
import reservationsystem.Plane;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.Seat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.SeatImpl#getNo <em>No</em>}</li>
 *   <li>{@link reservationsystem.impl.SeatImpl#getType <em>Type</em>}</li>
 *   <li>{@link reservationsystem.impl.SeatImpl#isIsExit <em>Is Exit</em>}</li>
 *   <li>{@link reservationsystem.impl.SeatImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link reservationsystem.impl.SeatImpl#getBook <em>Book</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
    /**
     * The default value of the '{@link #getNo() <em>No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNo()
     * @generated
     * @ordered
     */
    protected static final String NO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNo() <em>No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNo()
     * @generated
     * @ordered
     */
    protected String no = NO_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final int TYPE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected int type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExit() <em>Is Exit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExit()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXIT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExit() <em>Is Exit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExit()
     * @generated
     * @ordered
     */
    protected boolean isExit = IS_EXIT_EDEFAULT;

    /**
     * The cached value of the '{@link #getPlane() <em>Plane</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlane()
     * @generated
     * @ordered
     */
    protected Plane plane;

    /**
     * The cached value of the '{@link #getBook() <em>Book</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBook()
     * @generated
     * @ordered
     */
    protected Booking book;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SeatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.SEAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNo() {
        return no;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNo(String newNo) {
        String oldNo = no;
        no = newNo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__NO, oldNo, no));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(int newType) {
        int oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExit() {
        return isExit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsExit(boolean newIsExit) {
        boolean oldIsExit = isExit;
        isExit = newIsExit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__IS_EXIT, oldIsExit, isExit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Plane getPlane() {
        if (plane != null && plane.eIsProxy()) {
            InternalEObject oldPlane = (InternalEObject)plane;
            plane = (Plane)eResolveProxy(oldPlane);
            if (plane != oldPlane) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.SEAT__PLANE, oldPlane, plane));
            }
        }
        return plane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Plane basicGetPlane() {
        return plane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlane(Plane newPlane, NotificationChain msgs) {
        Plane oldPlane = plane;
        plane = newPlane;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__PLANE, oldPlane, newPlane);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlane(Plane newPlane) {
        if (newPlane != plane) {
            NotificationChain msgs = null;
            if (plane != null)
                msgs = ((InternalEObject)plane).eInverseRemove(this, ReservationsystemPackage.PLANE__SEATS, Plane.class, msgs);
            if (newPlane != null)
                msgs = ((InternalEObject)newPlane).eInverseAdd(this, ReservationsystemPackage.PLANE__SEATS, Plane.class, msgs);
            msgs = basicSetPlane(newPlane, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__PLANE, newPlane, newPlane));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking getBook() {
        if (book != null && book.eIsProxy()) {
            InternalEObject oldBook = (InternalEObject)book;
            book = (Booking)eResolveProxy(oldBook);
            if (book != oldBook) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.SEAT__BOOK, oldBook, book));
            }
        }
        return book;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Booking basicGetBook() {
        return book;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBook(Booking newBook, NotificationChain msgs) {
        Booking oldBook = book;
        book = newBook;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__BOOK, oldBook, newBook);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBook(Booking newBook) {
        if (newBook != book) {
            NotificationChain msgs = null;
            if (book != null)
                msgs = ((InternalEObject)book).eInverseRemove(this, ReservationsystemPackage.BOOKING__SEATS, Booking.class, msgs);
            if (newBook != null)
                msgs = ((InternalEObject)newBook).eInverseAdd(this, ReservationsystemPackage.BOOKING__SEATS, Booking.class, msgs);
            msgs = basicSetBook(newBook, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SEAT__BOOK, newBook, newBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.SEAT__PLANE:
                if (plane != null)
                    msgs = ((InternalEObject)plane).eInverseRemove(this, ReservationsystemPackage.PLANE__SEATS, Plane.class, msgs);
                return basicSetPlane((Plane)otherEnd, msgs);
            case ReservationsystemPackage.SEAT__BOOK:
                if (book != null)
                    msgs = ((InternalEObject)book).eInverseRemove(this, ReservationsystemPackage.BOOKING__SEATS, Booking.class, msgs);
                return basicSetBook((Booking)otherEnd, msgs);
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
            case ReservationsystemPackage.SEAT__PLANE:
                return basicSetPlane(null, msgs);
            case ReservationsystemPackage.SEAT__BOOK:
                return basicSetBook(null, msgs);
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
            case ReservationsystemPackage.SEAT__NO:
                return getNo();
            case ReservationsystemPackage.SEAT__TYPE:
                return getType();
            case ReservationsystemPackage.SEAT__IS_EXIT:
                return isIsExit();
            case ReservationsystemPackage.SEAT__PLANE:
                if (resolve) return getPlane();
                return basicGetPlane();
            case ReservationsystemPackage.SEAT__BOOK:
                if (resolve) return getBook();
                return basicGetBook();
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
            case ReservationsystemPackage.SEAT__NO:
                setNo((String)newValue);
                return;
            case ReservationsystemPackage.SEAT__TYPE:
                setType((Integer)newValue);
                return;
            case ReservationsystemPackage.SEAT__IS_EXIT:
                setIsExit((Boolean)newValue);
                return;
            case ReservationsystemPackage.SEAT__PLANE:
                setPlane((Plane)newValue);
                return;
            case ReservationsystemPackage.SEAT__BOOK:
                setBook((Booking)newValue);
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
            case ReservationsystemPackage.SEAT__NO:
                setNo(NO_EDEFAULT);
                return;
            case ReservationsystemPackage.SEAT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ReservationsystemPackage.SEAT__IS_EXIT:
                setIsExit(IS_EXIT_EDEFAULT);
                return;
            case ReservationsystemPackage.SEAT__PLANE:
                setPlane((Plane)null);
                return;
            case ReservationsystemPackage.SEAT__BOOK:
                setBook((Booking)null);
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
            case ReservationsystemPackage.SEAT__NO:
                return NO_EDEFAULT == null ? no != null : !NO_EDEFAULT.equals(no);
            case ReservationsystemPackage.SEAT__TYPE:
                return type != TYPE_EDEFAULT;
            case ReservationsystemPackage.SEAT__IS_EXIT:
                return isExit != IS_EXIT_EDEFAULT;
            case ReservationsystemPackage.SEAT__PLANE:
                return plane != null;
            case ReservationsystemPackage.SEAT__BOOK:
                return book != null;
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
        result.append(" (no: ");
        result.append(no);
        result.append(", type: ");
        result.append(type);
        result.append(", isExit: ");
        result.append(isExit);
        result.append(')');
        return result.toString();
    }

} //SeatImpl
