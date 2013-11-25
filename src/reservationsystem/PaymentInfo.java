/**
 */
package reservationsystem;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.PaymentInfo#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getCreateTime <em>Create Time</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getStatus <em>Status</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getPayTime <em>Pay Time</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getType <em>Type</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getCardNo <em>Card No</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getCardOwner <em>Card Owner</em>}</li>
 *   <li>{@link reservationsystem.PaymentInfo#getCardAddr <em>Card Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getPaymentInfo()
 * @model
 * @generated
 */
public interface PaymentInfo extends Booking {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Create Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Create Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Create Time</em>' attribute.
     * @see #setCreateTime(Date)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_CreateTime()
     * @model
     * @generated
     */
    Date getCreateTime();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getCreateTime <em>Create Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Create Time</em>' attribute.
     * @see #getCreateTime()
     * @generated
     */
    void setCreateTime(Date value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see #setStatus(int)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_Status()
     * @model
     * @generated
     */
    int getStatus();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(int value);

    /**
     * Returns the value of the '<em><b>Pay Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pay Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pay Time</em>' attribute.
     * @see #setPayTime(Date)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_PayTime()
     * @model
     * @generated
     */
    Date getPayTime();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getPayTime <em>Pay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pay Time</em>' attribute.
     * @see #getPayTime()
     * @generated
     */
    void setPayTime(Date value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(int)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_Type()
     * @model
     * @generated
     */
    int getType();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(int value);

    /**
     * Returns the value of the '<em><b>Card No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card No</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Card No</em>' attribute.
     * @see #setCardNo(String)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_CardNo()
     * @model
     * @generated
     */
    String getCardNo();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getCardNo <em>Card No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Card No</em>' attribute.
     * @see #getCardNo()
     * @generated
     */
    void setCardNo(String value);

    /**
     * Returns the value of the '<em><b>Card Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Card Owner</em>' attribute.
     * @see #setCardOwner(String)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_CardOwner()
     * @model
     * @generated
     */
    String getCardOwner();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getCardOwner <em>Card Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Card Owner</em>' attribute.
     * @see #getCardOwner()
     * @generated
     */
    void setCardOwner(String value);

    /**
     * Returns the value of the '<em><b>Card Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card Addr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Card Addr</em>' attribute.
     * @see #setCardAddr(String)
     * @see reservationsystem.ReservationsystemPackage#getPaymentInfo_CardAddr()
     * @model
     * @generated
     */
    String getCardAddr();

    /**
     * Sets the value of the '{@link reservationsystem.PaymentInfo#getCardAddr <em>Card Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Card Addr</em>' attribute.
     * @see #getCardAddr()
     * @generated
     */
    void setCardAddr(String value);

} // PaymentInfo
