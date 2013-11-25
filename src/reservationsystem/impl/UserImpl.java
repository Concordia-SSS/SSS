/**
 */
package reservationsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reservationsystem.Person;
import reservationsystem.ReservationsystemPackage;
import reservationsystem.User;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>User</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link reservationsystem.impl.UserImpl#getBelongsTo <em>Belongs To</em>}</li>
 * <li>{@link reservationsystem.impl.UserImpl#getUserType <em>User Type</em>}</li>
 * <li>{@link reservationsystem.impl.UserImpl#getUserName <em>User Name</em>}</li>
 * <li>{@link reservationsystem.impl.UserImpl#getMd5Pwd <em>Md5 Pwd</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
    /**
     * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getBelongsTo()
     * @generated
     * @ordered
     */
    protected Person belongsTo;

    /**
     * The cached value of the '{@link #getUserType() <em>User Type</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUserType()
     * @generated
     * @ordered
     */
    protected int userType;

    /**
     * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected static final String USER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUserName()
     * @generated
     * @ordered
     */
    protected String userName = USER_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMd5Pwd() <em>Md5 Pwd</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getMd5Pwd()
     * @generated
     * @ordered
     */
    protected static final String MD5_PWD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMd5Pwd() <em>Md5 Pwd</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getMd5Pwd()
     * @generated
     * @ordered
     */
    protected String md5Pwd = MD5_PWD_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UserImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.USER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Person getBelongsTo() {
        if (belongsTo != null && belongsTo.eIsProxy()) {
            InternalEObject oldBelongsTo = (InternalEObject) belongsTo;
            belongsTo = (Person) eResolveProxy(oldBelongsTo);
            if (belongsTo != oldBelongsTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ReservationsystemPackage.USER__BELONGS_TO, oldBelongsTo, belongsTo));
            }
        }
        return belongsTo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Person basicGetBelongsTo() {
        return belongsTo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setBelongsTo(Person newBelongsTo) {
        Person oldBelongsTo = belongsTo;
        belongsTo = newBelongsTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.USER__BELONGS_TO,
                    oldBelongsTo, belongsTo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getUserType() {
        return userType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUserType(int newUserType) {
        Object oldUserType = userType;
        userType = newUserType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.USER__USER_TYPE,
                    oldUserType, userType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUserName(String newUserName) {
        String oldUserName = userName;
        userName = newUserName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.USER__USER_NAME,
                    oldUserName, userName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getMd5Pwd() {
        return md5Pwd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMd5Pwd(String newMd5Pwd) {
        String oldMd5Pwd = md5Pwd;
        md5Pwd = newMd5Pwd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.USER__MD5_PWD, oldMd5Pwd,
                    md5Pwd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.USER__BELONGS_TO:
                if (resolve)
                    return getBelongsTo();
                return basicGetBelongsTo();
            case ReservationsystemPackage.USER__USER_TYPE:
                return getUserType();
            case ReservationsystemPackage.USER__USER_NAME:
                return getUserName();
            case ReservationsystemPackage.USER__MD5_PWD:
                return getMd5Pwd();
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
            case ReservationsystemPackage.USER__BELONGS_TO:
                setBelongsTo((Person) newValue);
                return;
            case ReservationsystemPackage.USER__USER_TYPE:
                setUserType((Integer) newValue);
                return;
            case ReservationsystemPackage.USER__USER_NAME:
                setUserName((String) newValue);
                return;
            case ReservationsystemPackage.USER__MD5_PWD:
                setMd5Pwd((String) newValue);
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
            case ReservationsystemPackage.USER__BELONGS_TO:
                setBelongsTo((Person) null);
                return;
            case ReservationsystemPackage.USER__USER_TYPE:
                setUserType((Integer) null);
                return;
            case ReservationsystemPackage.USER__USER_NAME:
                setUserName(USER_NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.USER__MD5_PWD:
                setMd5Pwd(MD5_PWD_EDEFAULT);
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
            case ReservationsystemPackage.USER__BELONGS_TO:
                return belongsTo != null;
            case ReservationsystemPackage.USER__USER_TYPE:
                return userType != 0;
            case ReservationsystemPackage.USER__USER_NAME:
                return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
            case ReservationsystemPackage.USER__MD5_PWD:
                return MD5_PWD_EDEFAULT == null ? md5Pwd != null : !MD5_PWD_EDEFAULT.equals(md5Pwd);
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
        result.append(" (userType: ");
        result.append(userType);
        result.append(", userName: ");
        result.append(userName);
        result.append(", md5Pwd: ");
        result.append(md5Pwd);
        result.append(')');
        return result.toString();
    }

} // UserImpl
