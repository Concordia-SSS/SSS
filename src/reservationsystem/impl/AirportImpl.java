/**
 */
package reservationsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reservationsystem.Airport;
import reservationsystem.City;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Airport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link reservationsystem.impl.AirportImpl#getCity <em>City</em>}</li>
 * <li>{@link reservationsystem.impl.AirportImpl#getId <em>Id</em>}</li>
 * <li>{@link reservationsystem.impl.AirportImpl#getName <em>Name</em>}</li>
 * <li>{@link reservationsystem.impl.AirportImpl#getAbbr <em>Abbr</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AirportImpl extends MinimalEObjectImpl.Container implements Airport {
    /**
     * The cached value of the '{@link #getCity() <em>City</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getCity()
     * @generated
     * @ordered
     */
    protected City city;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getAbbr() <em>Abbr</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getAbbr()
     * @generated
     * @ordered
     */
    protected static final String ABBR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAbbr() <em>Abbr</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getAbbr()
     * @generated
     * @ordered
     */
    protected String abbr = ABBR_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AirportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.AIRPORT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public City getCity() {
        if (city != null && city.eIsProxy()) {
            InternalEObject oldCity = (InternalEObject) city;
            city = (City) eResolveProxy(oldCity);
            if (city != oldCity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReservationsystemPackage.AIRPORT__CITY,
                            oldCity, city));
            }
        }
        return city;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public City basicGetCity() {
        return city;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetCity(City newCity, NotificationChain msgs) {
        City oldCity = city;
        city = newCity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ReservationsystemPackage.AIRPORT__CITY, oldCity, newCity);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setCity(City newCity) {
        if (newCity != city) {
            NotificationChain msgs = null;
            if (city != null)
                msgs = ((InternalEObject) city).eInverseRemove(this, ReservationsystemPackage.CITY__AIRPORT,
                        City.class, msgs);
            if (newCity != null)
                msgs = ((InternalEObject) newCity).eInverseAdd(this, ReservationsystemPackage.CITY__AIRPORT,
                        City.class, msgs);
            msgs = basicSetCity(newCity, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.AIRPORT__CITY, newCity,
                    newCity));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.AIRPORT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.AIRPORT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAbbr(String newAbbr) {
        String oldAbbr = abbr;
        abbr = newAbbr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.AIRPORT__ABBR, oldAbbr, abbr));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ReservationsystemPackage.AIRPORT__CITY:
                if (city != null)
                    msgs = ((InternalEObject) city).eInverseRemove(this, ReservationsystemPackage.CITY__AIRPORT,
                            City.class, msgs);
                return basicSetCity((City) otherEnd, msgs);
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
            case ReservationsystemPackage.AIRPORT__CITY:
                return basicSetCity(null, msgs);
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
            case ReservationsystemPackage.AIRPORT__CITY:
                if (resolve)
                    return getCity();
                return basicGetCity();
            case ReservationsystemPackage.AIRPORT__ID:
                return getId();
            case ReservationsystemPackage.AIRPORT__NAME:
                return getName();
            case ReservationsystemPackage.AIRPORT__ABBR:
                return getAbbr();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ReservationsystemPackage.AIRPORT__CITY:
                setCity((City) newValue);
                return;
            case ReservationsystemPackage.AIRPORT__ID:
                setId((Integer) newValue);
                return;
            case ReservationsystemPackage.AIRPORT__NAME:
                setName((String) newValue);
                return;
            case ReservationsystemPackage.AIRPORT__ABBR:
                setAbbr((String) newValue);
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
            case ReservationsystemPackage.AIRPORT__CITY:
                setCity((City) null);
                return;
            case ReservationsystemPackage.AIRPORT__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.AIRPORT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.AIRPORT__ABBR:
                setAbbr(ABBR_EDEFAULT);
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
            case ReservationsystemPackage.AIRPORT__CITY:
                return city != null;
            case ReservationsystemPackage.AIRPORT__ID:
                return id != ID_EDEFAULT;
            case ReservationsystemPackage.AIRPORT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ReservationsystemPackage.AIRPORT__ABBR:
                return ABBR_EDEFAULT == null ? abbr != null : !ABBR_EDEFAULT.equals(abbr);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", abbr: ");
        result.append(abbr);
        result.append(')');
        return result.toString();
    }

} // AirportImpl
