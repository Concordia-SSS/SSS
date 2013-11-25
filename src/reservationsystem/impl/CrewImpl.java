/**
 */
package reservationsystem.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import reservationsystem.Crew;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.SpecificFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.CrewImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link reservationsystem.impl.CrewImpl#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.impl.CrewImpl#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CrewImpl extends PersonImpl implements Crew {
    /**
     * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeader()
     * @generated
     * @ordered
     */
    protected Crew leader;

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
     * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmployeeId()
     * @generated
     * @ordered
     */
    protected static final String EMPLOYEE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmployeeId()
     * @generated
     * @ordered
     */
    protected String employeeId = EMPLOYEE_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrewImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.CREW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Crew getLeader() {
        if (leader != null && leader.eIsProxy()) {
            InternalEObject oldLeader = (InternalEObject)leader;
            leader = (Crew)eResolveProxy(oldLeader);
            if (leader != oldLeader) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.CREW__LEADER, oldLeader, leader));
            }
        }
        return leader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Crew basicGetLeader() {
        return leader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeader(Crew newLeader) {
        Crew oldLeader = leader;
        leader = newLeader;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.CREW__LEADER, oldLeader, leader));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SpecificFlight> getSpecificFlight() {
        if (specificFlight == null) {
            specificFlight = new EObjectWithInverseResolvingEList.ManyInverse<SpecificFlight>(SpecificFlight.class, this, ReservationsystemPackage.CREW__SPECIFIC_FLIGHT, ReservationsystemPackage.SPECIFIC_FLIGHT__CREW);
        }
        return specificFlight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEmployeeId(String newEmployeeId) {
        String oldEmployeeId = employeeId;
        employeeId = newEmployeeId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.CREW__EMPLOYEE_ID, oldEmployeeId, employeeId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeader() {
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
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificFlight()).basicAdd(otherEnd, msgs);
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
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                return ((InternalEList<?>)getSpecificFlight()).basicRemove(otherEnd, msgs);
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
            case ReservationsystemPackage.CREW__LEADER:
                if (resolve) return getLeader();
                return basicGetLeader();
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                return getSpecificFlight();
            case ReservationsystemPackage.CREW__EMPLOYEE_ID:
                return getEmployeeId();
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
            case ReservationsystemPackage.CREW__LEADER:
                setLeader((Crew)newValue);
                return;
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                getSpecificFlight().addAll((Collection<? extends SpecificFlight>)newValue);
                return;
            case ReservationsystemPackage.CREW__EMPLOYEE_ID:
                setEmployeeId((String)newValue);
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
            case ReservationsystemPackage.CREW__LEADER:
                setLeader((Crew)null);
                return;
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                getSpecificFlight().clear();
                return;
            case ReservationsystemPackage.CREW__EMPLOYEE_ID:
                setEmployeeId(EMPLOYEE_ID_EDEFAULT);
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
            case ReservationsystemPackage.CREW__LEADER:
                return leader != null;
            case ReservationsystemPackage.CREW__SPECIFIC_FLIGHT:
                return specificFlight != null && !specificFlight.isEmpty();
            case ReservationsystemPackage.CREW__EMPLOYEE_ID:
                return EMPLOYEE_ID_EDEFAULT == null ? employeeId != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeId);
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
            case ReservationsystemPackage.CREW___SET_LEADER:
                setLeader();
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
        result.append(" (employeeId: ");
        result.append(employeeId);
        result.append(')');
        return result.toString();
    }

} //CrewImpl
