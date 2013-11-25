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

import reservationsystem.Plane;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.Seat;
import reservationsystem.SpecificFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getModel <em>Model</em>}</li>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getCrewNum <em>Crew Num</em>}</li>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link reservationsystem.impl.PlaneImpl#getSeats <em>Seats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaneImpl extends MinimalEObjectImpl.Container implements Plane {
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
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected static final String MODEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected String model = MODEL_EDEFAULT;

    /**
     * The default value of the '{@link #getCrewNum() <em>Crew Num</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewNum()
     * @generated
     * @ordered
     */
    protected static final int CREW_NUM_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCrewNum() <em>Crew Num</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewNum()
     * @generated
     * @ordered
     */
    protected int crewNum = CREW_NUM_EDEFAULT;

    /**
     * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected static final int CAPACITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacity()
     * @generated
     * @ordered
     */
    protected int capacity = CAPACITY_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlaneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.PLANE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpecificFlight> getSpecificFlight() {
        if (specificFlight == null) {
            specificFlight = new EObjectWithInverseResolvingEList<SpecificFlight>(SpecificFlight.class, this, ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT, ReservationsystemPackage.SPECIFIC_FLIGHT__PLANE);
        }
        return specificFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PLANE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(String newModel) {
        String oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PLANE__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCrewNum() {
        return crewNum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCrewNum(int newCrewNum) {
        int oldCrewNum = crewNum;
        crewNum = newCrewNum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PLANE__CREW_NUM, oldCrewNum, crewNum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapacity(int newCapacity) {
        int oldCapacity = capacity;
        capacity = newCapacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PLANE__CAPACITY, oldCapacity, capacity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Seat> getSeats() {
        if (seats == null) {
            seats = new EObjectWithInverseResolvingEList<Seat>(Seat.class, this, ReservationsystemPackage.PLANE__SEATS, ReservationsystemPackage.SEAT__PLANE);
        }
        return seats;
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificFlight()).basicAdd(otherEnd, msgs);
            case ReservationsystemPackage.PLANE__SEATS:
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                return ((InternalEList<?>)getSpecificFlight()).basicRemove(otherEnd, msgs);
            case ReservationsystemPackage.PLANE__SEATS:
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                return getSpecificFlight();
            case ReservationsystemPackage.PLANE__ID:
                return getId();
            case ReservationsystemPackage.PLANE__MODEL:
                return getModel();
            case ReservationsystemPackage.PLANE__CREW_NUM:
                return getCrewNum();
            case ReservationsystemPackage.PLANE__CAPACITY:
                return getCapacity();
            case ReservationsystemPackage.PLANE__SEATS:
                return getSeats();
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                getSpecificFlight().addAll((Collection<? extends SpecificFlight>)newValue);
                return;
            case ReservationsystemPackage.PLANE__ID:
                setId((String)newValue);
                return;
            case ReservationsystemPackage.PLANE__MODEL:
                setModel((String)newValue);
                return;
            case ReservationsystemPackage.PLANE__CREW_NUM:
                setCrewNum((Integer)newValue);
                return;
            case ReservationsystemPackage.PLANE__CAPACITY:
                setCapacity((Integer)newValue);
                return;
            case ReservationsystemPackage.PLANE__SEATS:
                getSeats().clear();
                getSeats().addAll((Collection<? extends Seat>)newValue);
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                return;
            case ReservationsystemPackage.PLANE__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.PLANE__MODEL:
                setModel(MODEL_EDEFAULT);
                return;
            case ReservationsystemPackage.PLANE__CREW_NUM:
                setCrewNum(CREW_NUM_EDEFAULT);
                return;
            case ReservationsystemPackage.PLANE__CAPACITY:
                setCapacity(CAPACITY_EDEFAULT);
                return;
            case ReservationsystemPackage.PLANE__SEATS:
                getSeats().clear();
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
            case ReservationsystemPackage.PLANE__SPECIFIC_FLIGHT:
                return specificFlight != null && !specificFlight.isEmpty();
            case ReservationsystemPackage.PLANE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ReservationsystemPackage.PLANE__MODEL:
                return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
            case ReservationsystemPackage.PLANE__CREW_NUM:
                return crewNum != CREW_NUM_EDEFAULT;
            case ReservationsystemPackage.PLANE__CAPACITY:
                return capacity != CAPACITY_EDEFAULT;
            case ReservationsystemPackage.PLANE__SEATS:
                return seats != null && !seats.isEmpty();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", model: ");
        result.append(model);
        result.append(", crewNum: ");
        result.append(crewNum);
        result.append(", capacity: ");
        result.append(capacity);
        result.append(')');
        return result.toString();
    }

} //PlaneImpl
