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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reservationsystem.Airport;
import reservationsystem.GeneralFlight;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.SpecificFlight;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>General Flight</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getSpecificFlight <em>Specific Flight</em>}</li>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getFrom <em>From</em>}</li>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getFlightNo <em>Flight No</em>}</li>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getDepartureTime <em>Departure Time</em>}</li>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getTo <em>To</em>}</li>
 * <li>{@link reservationsystem.impl.GeneralFlightImpl#getArrivalTime <em>Arrival Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GeneralFlightImpl extends MinimalEObjectImpl.Container implements GeneralFlight {
    /**
     * The cached value of the '{@link #getSpecificFlight() <em>Specific Flight</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSpecificFlight()
     * @generated
     * @ordered
     */
    protected EList<SpecificFlight> specificFlight;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected Airport from;

    /**
     * The default value of the '{@link #getFlightNo() <em>Flight No</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getFlightNo()
     * @generated
     * @ordered
     */
    protected static final String FLIGHT_NO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlightNo() <em>Flight No</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getFlightNo()
     * @generated
     * @ordered
     */
    protected String flightNo = FLIGHT_NO_EDEFAULT;

    /**
     * The default value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDepartureTime()
     * @generated
     * @ordered
     */
    protected static final String DEPARTURE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDepartureTime() <em>Departure Time</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDepartureTime()
     * @generated
     * @ordered
     */
    protected String departureTime = DEPARTURE_TIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected Airport to;

    /**
     * The default value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getArrivalTime()
     * @generated
     * @ordered
     */
    protected static final String ARRIVAL_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getArrivalTime()
     * @generated
     * @ordered
     */
    protected String arrivalTime = ARRIVAL_TIME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public GeneralFlightImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.GENERAL_FLIGHT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<SpecificFlight> getSpecificFlight() {
        if (specificFlight == null) {
            specificFlight = new EObjectWithInverseResolvingEList<SpecificFlight>(SpecificFlight.class, this,
                    ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT,
                    ReservationsystemPackage.SPECIFIC_FLIGHT__GENERAL_FLIGHT);
        }
        return specificFlight;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Airport getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject) from;
            from = (Airport) eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ReservationsystemPackage.GENERAL_FLIGHT__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Airport basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFrom(Airport newFrom) {
        Airport oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.GENERAL_FLIGHT__FROM,
                    oldFrom, from));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFlightNo(String newFlightNo) {
        String oldFlightNo = flightNo;
        flightNo = newFlightNo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.GENERAL_FLIGHT__FLIGHT_NO,
                    oldFlightNo, flightNo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setDepartureTime(String newDepartureTime) {
        String oldDepartureTime = departureTime;
        departureTime = newDepartureTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ReservationsystemPackage.GENERAL_FLIGHT__DEPARTURE_TIME, oldDepartureTime, departureTime));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Airport getTo() {
        if (to != null && to.eIsProxy()) {
            InternalEObject oldTo = (InternalEObject) to;
            to = (Airport) eResolveProxy(oldTo);
            if (to != oldTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ReservationsystemPackage.GENERAL_FLIGHT__TO, oldTo, to));
            }
        }
        return to;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Airport basicGetTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTo(Airport newTo) {
        Airport oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.GENERAL_FLIGHT__TO, oldTo,
                    to));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setArrivalTime(String newArrivalTime) {
        String oldArrivalTime = arrivalTime;
        arrivalTime = newArrivalTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    ReservationsystemPackage.GENERAL_FLIGHT__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpecificFlight()).basicAdd(otherEnd,
                        msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                return ((InternalEList<?>) getSpecificFlight()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                return getSpecificFlight();
            case ReservationsystemPackage.GENERAL_FLIGHT__FROM:
                if (resolve)
                    return getFrom();
                return basicGetFrom();
            case ReservationsystemPackage.GENERAL_FLIGHT__FLIGHT_NO:
                return getFlightNo();
            case ReservationsystemPackage.GENERAL_FLIGHT__DEPARTURE_TIME:
                return getDepartureTime();
            case ReservationsystemPackage.GENERAL_FLIGHT__TO:
                if (resolve)
                    return getTo();
                return basicGetTo();
            case ReservationsystemPackage.GENERAL_FLIGHT__ARRIVAL_TIME:
                return getArrivalTime();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                getSpecificFlight().addAll((Collection<? extends SpecificFlight>) newValue);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__FROM:
                setFrom((Airport) newValue);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__FLIGHT_NO:
                setFlightNo((String) newValue);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__DEPARTURE_TIME:
                setDepartureTime((String) newValue);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__TO:
                setTo((Airport) newValue);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__ARRIVAL_TIME:
                setArrivalTime((String) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__FROM:
                setFrom((Airport) null);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__FLIGHT_NO:
                setFlightNo(FLIGHT_NO_EDEFAULT);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__DEPARTURE_TIME:
                setDepartureTime(DEPARTURE_TIME_EDEFAULT);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__TO:
                setTo((Airport) null);
                return;
            case ReservationsystemPackage.GENERAL_FLIGHT__ARRIVAL_TIME:
                setArrivalTime(ARRIVAL_TIME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.GENERAL_FLIGHT__SPECIFIC_FLIGHT:
                return specificFlight != null && !specificFlight.isEmpty();
            case ReservationsystemPackage.GENERAL_FLIGHT__FROM:
                return from != null;
            case ReservationsystemPackage.GENERAL_FLIGHT__FLIGHT_NO:
                return FLIGHT_NO_EDEFAULT == null ? flightNo != null : !FLIGHT_NO_EDEFAULT.equals(flightNo);
            case ReservationsystemPackage.GENERAL_FLIGHT__DEPARTURE_TIME:
                return DEPARTURE_TIME_EDEFAULT == null ? departureTime != null : !DEPARTURE_TIME_EDEFAULT
                        .equals(departureTime);
            case ReservationsystemPackage.GENERAL_FLIGHT__TO:
                return to != null;
            case ReservationsystemPackage.GENERAL_FLIGHT__ARRIVAL_TIME:
                return ARRIVAL_TIME_EDEFAULT == null ? arrivalTime != null : !ARRIVAL_TIME_EDEFAULT.equals(arrivalTime);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (flightNo: ");
        result.append(flightNo);
        result.append(", departureTime: ");
        result.append(departureTime);
        result.append(", arrivalTime: ");
        result.append(arrivalTime);
        result.append(')');
        return result.toString();
    }

} // GeneralFlightImpl
