/**
 */
package reservationsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>User</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link reservationsystem.User#getBelongsTo <em>Belongs To</em>}</li>
 * <li>{@link reservationsystem.User#getUserType <em>User Type</em>}</li>
 * <li>{@link reservationsystem.User#getUserName <em>User Name</em>}</li>
 * <li>{@link reservationsystem.User#getMd5Pwd <em>Md5 Pwd</em>}</li>
 * </ul>
 * </p>
 * 
 * @see reservationsystem.ReservationsystemPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
    /**
     * Returns the value of the '<em><b>Belongs To</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Belongs To</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Belongs To</em>' reference.
     * @see #setBelongsTo(Person)
     * @see reservationsystem.ReservationsystemPackage#getUser_BelongsTo()
     * @model required="true"
     * @generated
     */
    Person getBelongsTo();

    /**
     * Sets the value of the '{@link reservationsystem.User#getBelongsTo <em>Belongs To</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Belongs To</em>' reference.
     * @see #getBelongsTo()
     * @generated
     */
    void setBelongsTo(Person value);

    /**
     * Returns the value of the '<em><b>User Type</b></em>' attribute. The default value is <code>""</code>. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Type</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>User Type</em>' attribute.
     * @see #setUserType(Object)
     * @see reservationsystem.ReservationsystemPackage#getUser_UserType()
     * @model default="" dataType="reservationsystem.UserType" required="true"
     * @generated
     */
    int getUserType();

    /**
     * Sets the value of the '{@link reservationsystem.User#getUserType <em>User Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>User Type</em>' attribute.
     * @see #getUserType()
     * @generated
     */
    void setUserType(int value);

    /**
     * Returns the value of the '<em><b>User Name</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Name</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>User Name</em>' attribute.
     * @see #setUserName(String)
     * @see reservationsystem.ReservationsystemPackage#getUser_UserName()
     * @model
     * @generated
     */
    String getUserName();

    /**
     * Sets the value of the '{@link reservationsystem.User#getUserName <em>User Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>User Name</em>' attribute.
     * @see #getUserName()
     * @generated
     */
    void setUserName(String value);

    /**
     * Returns the value of the '<em><b>Md5 Pwd</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Md5 Pwd</em>' attribute isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Md5 Pwd</em>' attribute.
     * @see #setMd5Pwd(String)
     * @see reservationsystem.ReservationsystemPackage#getUser_Md5Pwd()
     * @model
     * @generated
     */
    String getMd5Pwd();

    /**
     * Sets the value of the '{@link reservationsystem.User#getMd5Pwd <em>Md5 Pwd</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Md5 Pwd</em>' attribute.
     * @see #getMd5Pwd()
     * @generated
     */
    void setMd5Pwd(String value);

} // User
