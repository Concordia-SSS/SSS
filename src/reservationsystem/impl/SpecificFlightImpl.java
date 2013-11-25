/**
 */
package reservationsystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reservationsystem.Booking;
import reservationsystem.Crew;
import reservationsystem.GeneralFlight;
import reservationsystem.Plane;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.SpecificFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getGeneralFlight <em>General Flight</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getDate <em>Date</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getRealDepTime <em>Real Dep Time</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getRealArriTime <em>Real Arri Time</em>}</li>
 *   <li>{@link reservationsystem.impl.SpecificFlightImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificFlightImpl extends MinimalEObjectImpl.Container implements SpecificFlight {
    /**
     * The cached value of the '{@link #getGeneralFlight() <em>General Flight</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralFlight()
     * @generated
     * @ordered
     */
    protected GeneralFlight generalFlight;

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
     * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrew()
     * @generated
     * @ordered
     */
    protected EList<Crew> crew;

    /**
     * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooking()
     * @generated
     * @ordered
     */
    protected EList<Booking> booking;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getRealDepTime() <em>Real Dep Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealDepTime()
     * @generated
     * @ordered
     */
    protected static final Date REAL_DEP_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRealDepTime() <em>Real Dep Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealDepTime()
     * @generated
     * @ordered
     */
    protected Date realDepTime = REAL_DEP_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getRealArriTime() <em>Real Arri Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealArriTime()
     * @generated
     * @ordered
     */
    protected static final Date REAL_ARRI_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRealArriTime() <em>Real Arri Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealArriTime()
     * @generated
     * @ordered
     */
    protected Date realArriTime = REAL_ARRI_TIME_EDEFAULT;

    /**
     * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected static final int STATUS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected int status = STATUS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecificFlightImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.SPECIFIC_FLIGHT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralFlight getGeneralFlight() {
        if (generalFlight != null && generalFlight.eIsProxy()) {
            InternalEObject oldGeneralFlight = (InternalEObject)generalFlight;
            generalFlight = (GeneralFlight)eResolveProxy(oldGeneralFlight);
            if (generalFlight != oldGeneralFlight) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT, oldGeneralFlight, generalFlight));
            }
        }
        return generalFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralFlight basicGetGeneralFlight() {
        return generalFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralFlight(GeneralFlight newGeneralFlight, NotificationChain msgs) {
        GeneralFlight oldGeneralFlight = generalFlight;
        generalFlight = newGeneralFlight;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT, oldGeneralFlight, newGeneralFlight);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneralFlight(GeneralFlight newGeneralFlight) {
        if (newGeneralFlight != generalFlight) {
            NotificationChain msgs = null;
            if (generalFlight != null)
                msgs = ((InternalEObject)generalFlight).eInverseRemove(this, ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT, GeneralFlight.class, msgs);
            if (newGeneralFlight != null)
                msgs = ((InternalEObject)newGeneralFlight).eInverseAdd(this, ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT, GeneralFlight.class, msgs);
            msgs = basicSetGeneralFlight(newGeneralFlight, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT, newGeneralFlight, newGeneralFlight));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE, oldPlane, plane));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE, oldPlane, newPlane);
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
                msgs = ((InternalEObject)plane).eInverseRemove(this, ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT, Plane.class, msgs);
            if (newPlane != null)
                msgs = ((InternalEObject)newPlane).eInverseAdd(this, ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT, Plane.class, msgs);
            msgs = basicSetPlane(newPlane, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE, newPlane, newPlane));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Crew> getCrew() {
        if (crew == null) {
            crew = new EObjectWithInverseResolvingEList.ManyInverse<Crew>(Crew.class, this, ReservationsystemPackage.SPECIFIC_FLIGHT__CREW, ReservationsystemPackage.CREW__SPECIFIC_FLIGHT);
        }
        return crew;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Booking> getBooking() {
        if (booking == null) {
            booking = new EObjectWithInverseResolvingEList.ManyInverse<Booking>(Booking.class, this, ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING, ReservationsystemPackage.BOOKING__SPECIFIC_FLIGHT);
        }
        return booking;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getRealDepTime() {
        return realDepTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealDepTime(Date newRealDepTime) {
        Date oldRealDepTime = realDepTime;
        realDepTime = newRealDepTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_DEP_TIME, oldRealDepTime, realDepTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getRealArriTime() {
        return realArriTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealArriTime(Date newRealArriTime) {
        Date oldRealArriTime = realArriTime;
        realArriTime = newRealArriTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_ARRI_TIME, oldRealArriTime, realArriTime));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatus(int newStatus) {
        int oldStatus = status;
        status = newStatus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.SPECIFIC_FLIGHT__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void assignPilot(int personId) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void assignAttd(int personId) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                if (generalFlight != null)
                    msgs = ((InternalEObject)generalFlight).eInverseRemove(this, ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT, GeneralFlight.class, msgs);
                return basicSetGeneralFlight((GeneralFlight)otherEnd, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                if (plane != null)
                    msgs = ((InternalEObject)plane).eInverseRemove(this, ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT, Plane.class, msgs);
                return basicSetPlane((Plane)otherEnd, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrew()).basicAdd(otherEnd, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooking()).basicAdd(otherEnd, msgs);
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                return basicSetGeneralFlight(null, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                return basicSetPlane(null, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                return ((InternalEList<?>)getCrew()).basicRemove(otherEnd, msgs);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                return ((InternalEList<?>)getBooking()).basicRemove(otherEnd, msgs);
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                if (resolve) return getGeneralFlight();
                return basicGetGeneralFlight();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                if (resolve) return getPlane();
                return basicGetPlane();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                return getCrew();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                return getBooking();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__ID:
                return getId();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__DATE:
                return getDate();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_DEP_TIME:
                return getRealDepTime();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_ARRI_TIME:
                return getRealArriTime();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__STATUS:
                return getStatus();
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                setGeneralFlight((GeneralFlight)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                setPlane((Plane)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                getCrew().clear();
                getCrew().addAll((Collection<? extends Crew>)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                getBooking().clear();
                getBooking().addAll((Collection<? extends Booking>)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__ID:
                setId((Integer)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__DATE:
                setDate((Date)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_DEP_TIME:
                setRealDepTime((Date)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_ARRI_TIME:
                setRealArriTime((Date)newValue);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__STATUS:
                setStatus((Integer)newValue);
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                setGeneralFlight((GeneralFlight)null);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                setPlane((Plane)null);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                getCrew().clear();
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                getBooking().clear();
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_DEP_TIME:
                setRealDepTime(REAL_DEP_TIME_EDEFAULT);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_ARRI_TIME:
                setRealArriTime(REAL_ARRI_TIME_EDEFAULT);
                return;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__STATUS:
                setStatus(STATUS_EDEFAULT);
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
            case ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT:
                return generalFlight != null;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE:
                return plane != null;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__CREW:
                return crew != null && !crew.isEmpty();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__BOOKING:
                return booking != null && !booking.isEmpty();
            case ReservationsystemPackage.SPECIFIC_FLIGHT__ID:
                return id != ID_EDEFAULT;
            case ReservationsystemPackage.SPECIFIC_FLIGHT__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_DEP_TIME:
                return REAL_DEP_TIME_EDEFAULT == null ? realDepTime != null : !REAL_DEP_TIME_EDEFAULT.equals(realDepTime);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__REAL_ARRI_TIME:
                return REAL_ARRI_TIME_EDEFAULT == null ? realArriTime != null : !REAL_ARRI_TIME_EDEFAULT.equals(realArriTime);
            case ReservationsystemPackage.SPECIFIC_FLIGHT__STATUS:
                return status != STATUS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ReservationsystemPackage.SPECIFIC_FLIGHT___ASSIGN_PILOT__INT:
                assignPilot((Integer)arguments.get(0));
                return null;
            case ReservationsystemPackage.SPECIFIC_FLIGHT___ASSIGN_ATTD__INT:
                assignAttd((Integer)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", date: ");
        result.append(date);
        result.append(", realDepTime: ");
        result.append(realDepTime);
        result.append(", realArriTime: ");
        result.append(realArriTime);
        result.append(", status: ");
        result.append(status);
        result.append(')');
        return result.toString();
    }

} //SpecificFlightImpl
