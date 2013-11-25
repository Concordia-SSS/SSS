/**
 */
package reservationsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Seat#getNo <em>No</em>}</li>
 *   <li>{@link reservationsystem.Seat#getType <em>Type</em>}</li>
 *   <li>{@link reservationsystem.Seat#isIsExit <em>Is Exit</em>}</li>
 *   <li>{@link reservationsystem.Seat#getPlane <em>Plane</em>}</li>
 *   <li>{@link reservationsystem.Seat#getBook <em>Book</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
    /**
     * Returns the value of the '<em><b>No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>No</em>' attribute.
     * @see #setNo(String)
     * @see reservationsystem.ReservationsystemPackage#getSeat_No()
     * @model
     * @generated
     */
    String getNo();

    /**
     * Sets the value of the '{@link reservationsystem.Seat#getNo <em>No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>No</em>' attribute.
     * @see #getNo()
     * @generated
     */
    void setNo(String value);

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
     * @see reservationsystem.ReservationsystemPackage#getSeat_Type()
     * @model
     * @generated
     */
    int getType();

    /**
     * Sets the value of the '{@link reservationsystem.Seat#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(int value);

    /**
     * Returns the value of the '<em><b>Is Exit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Exit</em>' attribute.
     * @see #setIsExit(boolean)
     * @see reservationsystem.ReservationsystemPackage#getSeat_IsExit()
     * @model
     * @generated
     */
    boolean isIsExit();

    /**
     * Sets the value of the '{@link reservationsystem.Seat#isIsExit <em>Is Exit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Exit</em>' attribute.
     * @see #isIsExit()
     * @generated
     */
    void setIsExit(boolean value);

    /**
     * Returns the value of the '<em><b>Plane</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.Plane#getSeats <em>Seats</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane</em>' reference.
     * @see #setPlane(Plane)
     * @see reservationsystem.ReservationsystemPackage#getSeat_Plane()
     * @see reservationsystem.Plane#getSeats
     * @model opposite="seats" required="true"
     * @generated
     */
    Plane getPlane();

    /**
     * Sets the value of the '{@link reservationsystem.Seat#getPlane <em>Plane</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plane</em>' reference.
     * @see #getPlane()
     * @generated
     */
    void setPlane(Plane value);

    /**
     * Returns the value of the '<em><b>Book</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.Booking#getSeats <em>Seats</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Book</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Book</em>' reference.
     * @see #setBook(Booking)
     * @see reservationsystem.ReservationsystemPackage#getSeat_Book()
     * @see reservationsystem.Booking#getSeats
     * @model opposite="seats" required="true"
     * @generated
     */
    Booking getBook();

    /**
     * Sets the value of the '{@link reservationsystem.Seat#getBook <em>Book</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Book</em>' reference.
     * @see #getBook()
     * @generated
     */
    void setBook(Booking value);

} // Seat
