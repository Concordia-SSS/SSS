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
import reservationsystem.City;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.CityImpl#getAirport <em>Airport</em>}</li>
 *   <li>{@link reservationsystem.impl.CityImpl#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.impl.CityImpl#getName <em>Name</em>}</li>
 *   <li>{@link reservationsystem.impl.CityImpl#getAbbr <em>Abbr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends MinimalEObjectImpl.Container implements City {
    /**
     * The cached value of the '{@link #getAirport() <em>Airport</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAirport()
     * @generated
     * @ordered
     */
    protected EList<Airport> airport;

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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbr()
     * @generated
     * @ordered
     */
    protected static final String ABBR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbr() <em>Abbr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAbbr()
     * @generated
     * @ordered
     */
    protected String abbr = ABBR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.CITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Airport> getAirport() {
        if (airport == null) {
            airport = new EObjectWithInverseResolvingEList<Airport>(Airport.class, this, ReservationsystemPackage.CITY__AIRPORT, ReservationsystemPackage.AIRPORT__CITY);
        }
        return airport;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.CITY__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.CITY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbbr(String newAbbr) {
        String oldAbbr = abbr;
        abbr = newAbbr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.CITY__ABBR, oldAbbr, abbr));
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
            case ReservationsystemPackage.CITY__AIRPORT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAirport()).basicAdd(otherEnd, msgs);
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
            case ReservationsystemPackage.CITY__AIRPORT:
                return ((InternalEList<?>)getAirport()).basicRemove(otherEnd, msgs);
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
            case ReservationsystemPackage.CITY__AIRPORT:
                return getAirport();
            case ReservationsystemPackage.CITY__ID:
                return getId();
            case ReservationsystemPackage.CITY__NAME:
                return getName();
            case ReservationsystemPackage.CITY__ABBR:
                return getAbbr();
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
            case ReservationsystemPackage.CITY__AIRPORT:
                getAirport().clear();
                getAirport().addAll((Collection<? extends Airport>)newValue);
                return;
            case ReservationsystemPackage.CITY__ID:
                setId((Integer)newValue);
                return;
            case ReservationsystemPackage.CITY__NAME:
                setName((String)newValue);
                return;
            case ReservationsystemPackage.CITY__ABBR:
                setAbbr((String)newValue);
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
            case ReservationsystemPackage.CITY__AIRPORT:
                getAirport().clear();
                return;
            case ReservationsystemPackage.CITY__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.CITY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.CITY__ABBR:
                setAbbr(ABBR_EDEFAULT);
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
            case ReservationsystemPackage.CITY__AIRPORT:
                return airport != null && !airport.isEmpty();
            case ReservationsystemPackage.CITY__ID:
                return id != ID_EDEFAULT;
            case ReservationsystemPackage.CITY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ReservationsystemPackage.CITY__ABBR:
                return ABBR_EDEFAULT == null ? abbr != null : !ABBR_EDEFAULT.equals(abbr);
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
        result.append(", name: ");
        result.append(name);
        result.append(", abbr: ");
        result.append(abbr);
        result.append(')');
        return result.toString();
    }

} //CityImpl
