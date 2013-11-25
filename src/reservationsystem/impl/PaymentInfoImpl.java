/**
 */
package reservationsystem.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reservationsystem.PaymentInfo;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getCreateTime <em>Create Time</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getPayTime <em>Pay Time</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getType <em>Type</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getCardNo <em>Card No</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getCardOwner <em>Card Owner</em>}</li>
 *   <li>{@link reservationsystem.impl.PaymentInfoImpl#getCardAddr <em>Card Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaymentInfoImpl extends BookingImpl implements PaymentInfo {
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
     * The default value of the '{@link #getCreateTime() <em>Create Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateTime()
     * @generated
     * @ordered
     */
    protected static final Date CREATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreateTime() <em>Create Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateTime()
     * @generated
     * @ordered
     */
    protected Date createTime = CREATE_TIME_EDEFAULT;

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
     * The default value of the '{@link #getPayTime() <em>Pay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPayTime()
     * @generated
     * @ordered
     */
    protected static final Date PAY_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPayTime() <em>Pay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPayTime()
     * @generated
     * @ordered
     */
    protected Date payTime = PAY_TIME_EDEFAULT;

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
     * The default value of the '{@link #getCardNo() <em>Card No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardNo()
     * @generated
     * @ordered
     */
    protected static final String CARD_NO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCardNo() <em>Card No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardNo()
     * @generated
     * @ordered
     */
    protected String cardNo = CARD_NO_EDEFAULT;

    /**
     * The default value of the '{@link #getCardOwner() <em>Card Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardOwner()
     * @generated
     * @ordered
     */
    protected static final String CARD_OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCardOwner() <em>Card Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardOwner()
     * @generated
     * @ordered
     */
    protected String cardOwner = CARD_OWNER_EDEFAULT;

    /**
     * The default value of the '{@link #getCardAddr() <em>Card Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardAddr()
     * @generated
     * @ordered
     */
    protected static final String CARD_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCardAddr() <em>Card Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardAddr()
     * @generated
     * @ordered
     */
    protected String cardAddr = CARD_ADDR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PaymentInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.PAYMENT_INFO;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateTime(Date newCreateTime) {
        Date oldCreateTime = createTime;
        createTime = newCreateTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__CREATE_TIME, oldCreateTime, createTime));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__STATUS, oldStatus, status));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPayTime(Date newPayTime) {
        Date oldPayTime = payTime;
        payTime = newPayTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__PAY_TIME, oldPayTime, payTime));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCardNo(String newCardNo) {
        String oldCardNo = cardNo;
        cardNo = newCardNo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__CARD_NO, oldCardNo, cardNo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCardOwner() {
        return cardOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCardOwner(String newCardOwner) {
        String oldCardOwner = cardOwner;
        cardOwner = newCardOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__CARD_OWNER, oldCardOwner, cardOwner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCardAddr() {
        return cardAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCardAddr(String newCardAddr) {
        String oldCardAddr = cardAddr;
        cardAddr = newCardAddr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PAYMENT_INFO__CARD_ADDR, oldCardAddr, cardAddr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.PAYMENT_INFO__ID:
                return getId();
            case ReservationsystemPackage.PAYMENT_INFO__CREATE_TIME:
                return getCreateTime();
            case ReservationsystemPackage.PAYMENT_INFO__STATUS:
                return getStatus();
            case ReservationsystemPackage.PAYMENT_INFO__PAY_TIME:
                return getPayTime();
            case ReservationsystemPackage.PAYMENT_INFO__TYPE:
                return getType();
            case ReservationsystemPackage.PAYMENT_INFO__CARD_NO:
                return getCardNo();
            case ReservationsystemPackage.PAYMENT_INFO__CARD_OWNER:
                return getCardOwner();
            case ReservationsystemPackage.PAYMENT_INFO__CARD_ADDR:
                return getCardAddr();
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
            case ReservationsystemPackage.PAYMENT_INFO__ID:
                setId((String)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CREATE_TIME:
                setCreateTime((Date)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__STATUS:
                setStatus((Integer)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__PAY_TIME:
                setPayTime((Date)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__TYPE:
                setType((Integer)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_NO:
                setCardNo((String)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_OWNER:
                setCardOwner((String)newValue);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_ADDR:
                setCardAddr((String)newValue);
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
            case ReservationsystemPackage.PAYMENT_INFO__ID:
                setId(ID_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CREATE_TIME:
                setCreateTime(CREATE_TIME_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__STATUS:
                setStatus(STATUS_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__PAY_TIME:
                setPayTime(PAY_TIME_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_NO:
                setCardNo(CARD_NO_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_OWNER:
                setCardOwner(CARD_OWNER_EDEFAULT);
                return;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_ADDR:
                setCardAddr(CARD_ADDR_EDEFAULT);
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
            case ReservationsystemPackage.PAYMENT_INFO__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ReservationsystemPackage.PAYMENT_INFO__CREATE_TIME:
                return CREATE_TIME_EDEFAULT == null ? createTime != null : !CREATE_TIME_EDEFAULT.equals(createTime);
            case ReservationsystemPackage.PAYMENT_INFO__STATUS:
                return status != STATUS_EDEFAULT;
            case ReservationsystemPackage.PAYMENT_INFO__PAY_TIME:
                return PAY_TIME_EDEFAULT == null ? payTime != null : !PAY_TIME_EDEFAULT.equals(payTime);
            case ReservationsystemPackage.PAYMENT_INFO__TYPE:
                return type != TYPE_EDEFAULT;
            case ReservationsystemPackage.PAYMENT_INFO__CARD_NO:
                return CARD_NO_EDEFAULT == null ? cardNo != null : !CARD_NO_EDEFAULT.equals(cardNo);
            case ReservationsystemPackage.PAYMENT_INFO__CARD_OWNER:
                return CARD_OWNER_EDEFAULT == null ? cardOwner != null : !CARD_OWNER_EDEFAULT.equals(cardOwner);
            case ReservationsystemPackage.PAYMENT_INFO__CARD_ADDR:
                return CARD_ADDR_EDEFAULT == null ? cardAddr != null : !CARD_ADDR_EDEFAULT.equals(cardAddr);
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
        result.append(", createTime: ");
        result.append(createTime);
        result.append(", status: ");
        result.append(status);
        result.append(", payTime: ");
        result.append(payTime);
        result.append(", type: ");
        result.append(type);
        result.append(", cardNo: ");
        result.append(cardNo);
        result.append(", cardOwner: ");
        result.append(cardOwner);
        result.append(", cardAddr: ");
        result.append(cardAddr);
        result.append(')');
        return result.toString();
    }

} //PaymentInfoImpl
