/**
 */
package reservationsystem.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import reservationsystem.Person;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getCitizenship <em>Citizenship</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getResidence <em>Residence</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getPassportId <em>Passport Id</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link reservationsystem.impl.PersonImpl#getGender <em>Gender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
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
     * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddr()
     * @generated
     * @ordered
     */
    protected static final String ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddr()
     * @generated
     * @ordered
     */
    protected String addr = ADDR_EDEFAULT;

    /**
     * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone()
     * @generated
     * @ordered
     */
    protected static final String PHONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhone()
     * @generated
     * @ordered
     */
    protected String phone = PHONE_EDEFAULT;

    /**
     * The default value of the '{@link #getCitizenship() <em>Citizenship</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCitizenship()
     * @generated
     * @ordered
     */
    protected static final String CITIZENSHIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCitizenship() <em>Citizenship</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCitizenship()
     * @generated
     * @ordered
     */
    protected String citizenship = CITIZENSHIP_EDEFAULT;

    /**
     * The default value of the '{@link #getResidence() <em>Residence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidence()
     * @generated
     * @ordered
     */
    protected static final String RESIDENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResidence() <em>Residence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidence()
     * @generated
     * @ordered
     */
    protected String residence = RESIDENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMiddleName()
     * @generated
     * @ordered
     */
    protected static final String MIDDLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMiddleName()
     * @generated
     * @ordered
     */
    protected String middleName = MIDDLE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFamilyName()
     * @generated
     * @ordered
     */
    protected static final String FAMILY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFamilyName() <em>Family Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFamilyName()
     * @generated
     * @ordered
     */
    protected String familyName = FAMILY_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBirthDate()
     * @generated
     * @ordered
     */
    protected static final Date BIRTH_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBirthDate()
     * @generated
     * @ordered
     */
    protected Date birthDate = BIRTH_DATE_EDEFAULT;

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
     * The default value of the '{@link #getPassportId() <em>Passport Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassportId()
     * @generated
     * @ordered
     */
    protected static final String PASSPORT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPassportId() <em>Passport Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPassportId()
     * @generated
     * @ordered
     */
    protected String passportId = PASSPORT_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected static final String EMAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected String email = EMAIL_EDEFAULT;

    /**
     * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGender()
     * @generated
     * @ordered
     */
    protected static final int GENDER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGender()
     * @generated
     * @ordered
     */
    protected int gender = GENDER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.PERSON;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddr() {
        return addr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddr(String newAddr) {
        String oldAddr = addr;
        addr = newAddr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__ADDR, oldAddr, addr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhone(String newPhone) {
        String oldPhone = phone;
        phone = newPhone;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__PHONE, oldPhone, phone));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCitizenship(String newCitizenship) {
        String oldCitizenship = citizenship;
        citizenship = newCitizenship;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__CITIZENSHIP, oldCitizenship, citizenship));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getResidence() {
        return residence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResidence(String newResidence) {
        String oldResidence = residence;
        residence = newResidence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__RESIDENCE, oldResidence, residence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMiddleName(String newMiddleName) {
        String oldMiddleName = middleName;
        middleName = newMiddleName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__MIDDLE_NAME, oldMiddleName, middleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFamilyName(String newFamilyName) {
        String oldFamilyName = familyName;
        familyName = newFamilyName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__FAMILY_NAME, oldFamilyName, familyName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBirthDate(Date newBirthDate) {
        Date oldBirthDate = birthDate;
        birthDate = newBirthDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__BIRTH_DATE, oldBirthDate, birthDate));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPassportId() {
        return passportId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPassportId(String newPassportId) {
        String oldPassportId = passportId;
        passportId = newPassportId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__PASSPORT_ID, oldPassportId, passportId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEmail(String newEmail) {
        String oldEmail = email;
        email = newEmail;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__EMAIL, oldEmail, email));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGender() {
        return gender;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGender(int newGender) {
        int oldGender = gender;
        gender = newGender;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PERSON__GENDER, oldGender, gender));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.PERSON__NAME:
                return getName();
            case ReservationsystemPackage.PERSON__ADDR:
                return getAddr();
            case ReservationsystemPackage.PERSON__PHONE:
                return getPhone();
            case ReservationsystemPackage.PERSON__CITIZENSHIP:
                return getCitizenship();
            case ReservationsystemPackage.PERSON__RESIDENCE:
                return getResidence();
            case ReservationsystemPackage.PERSON__MIDDLE_NAME:
                return getMiddleName();
            case ReservationsystemPackage.PERSON__FAMILY_NAME:
                return getFamilyName();
            case ReservationsystemPackage.PERSON__BIRTH_DATE:
                return getBirthDate();
            case ReservationsystemPackage.PERSON__ID:
                return getId();
            case ReservationsystemPackage.PERSON__PASSPORT_ID:
                return getPassportId();
            case ReservationsystemPackage.PERSON__EMAIL:
                return getEmail();
            case ReservationsystemPackage.PERSON__GENDER:
                return getGender();
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
            case ReservationsystemPackage.PERSON__NAME:
                setName((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__ADDR:
                setAddr((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__PHONE:
                setPhone((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__CITIZENSHIP:
                setCitizenship((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__RESIDENCE:
                setResidence((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__MIDDLE_NAME:
                setMiddleName((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__FAMILY_NAME:
                setFamilyName((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__BIRTH_DATE:
                setBirthDate((Date)newValue);
                return;
            case ReservationsystemPackage.PERSON__ID:
                setId((Integer)newValue);
                return;
            case ReservationsystemPackage.PERSON__PASSPORT_ID:
                setPassportId((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__EMAIL:
                setEmail((String)newValue);
                return;
            case ReservationsystemPackage.PERSON__GENDER:
                setGender((Integer)newValue);
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
            case ReservationsystemPackage.PERSON__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__ADDR:
                setAddr(ADDR_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__PHONE:
                setPhone(PHONE_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__CITIZENSHIP:
                setCitizenship(CITIZENSHIP_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__RESIDENCE:
                setResidence(RESIDENCE_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__MIDDLE_NAME:
                setMiddleName(MIDDLE_NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__FAMILY_NAME:
                setFamilyName(FAMILY_NAME_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__BIRTH_DATE:
                setBirthDate(BIRTH_DATE_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__PASSPORT_ID:
                setPassportId(PASSPORT_ID_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__EMAIL:
                setEmail(EMAIL_EDEFAULT);
                return;
            case ReservationsystemPackage.PERSON__GENDER:
                setGender(GENDER_EDEFAULT);
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
            case ReservationsystemPackage.PERSON__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ReservationsystemPackage.PERSON__ADDR:
                return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
            case ReservationsystemPackage.PERSON__PHONE:
                return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
            case ReservationsystemPackage.PERSON__CITIZENSHIP:
                return CITIZENSHIP_EDEFAULT == null ? citizenship != null : !CITIZENSHIP_EDEFAULT.equals(citizenship);
            case ReservationsystemPackage.PERSON__RESIDENCE:
                return RESIDENCE_EDEFAULT == null ? residence != null : !RESIDENCE_EDEFAULT.equals(residence);
            case ReservationsystemPackage.PERSON__MIDDLE_NAME:
                return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
            case ReservationsystemPackage.PERSON__FAMILY_NAME:
                return FAMILY_NAME_EDEFAULT == null ? familyName != null : !FAMILY_NAME_EDEFAULT.equals(familyName);
            case ReservationsystemPackage.PERSON__BIRTH_DATE:
                return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
            case ReservationsystemPackage.PERSON__ID:
                return id != ID_EDEFAULT;
            case ReservationsystemPackage.PERSON__PASSPORT_ID:
                return PASSPORT_ID_EDEFAULT == null ? passportId != null : !PASSPORT_ID_EDEFAULT.equals(passportId);
            case ReservationsystemPackage.PERSON__EMAIL:
                return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
            case ReservationsystemPackage.PERSON__GENDER:
                return gender != GENDER_EDEFAULT;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", addr: ");
        result.append(addr);
        result.append(", phone: ");
        result.append(phone);
        result.append(", citizenship: ");
        result.append(citizenship);
        result.append(", residence: ");
        result.append(residence);
        result.append(", middleName: ");
        result.append(middleName);
        result.append(", FamilyName: ");
        result.append(familyName);
        result.append(", birthDate: ");
        result.append(birthDate);
        result.append(", id: ");
        result.append(id);
        result.append(", passportId: ");
        result.append(passportId);
        result.append(", email: ");
        result.append(email);
        result.append(", gender: ");
        result.append(gender);
        result.append(')');
        return result.toString();
    }

} //PersonImpl
