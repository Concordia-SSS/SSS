/**
 */
package reservationsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Passenger#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link reservationsystem.Passenger#getBooking <em>Booking</em>}</li>
 *   <li>{@link reservationsystem.Passenger#getSpecialNeeds <em>Special Needs</em>}</li>
 *   <li>{@link reservationsystem.Passenger#getFoodPref <em>Food Pref</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends Person {
    /**
     * Returns the value of the '<em><b>Passenger</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passenger</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passenger</em>' reference.
     * @see #setPassenger(Booking)
     * @see reservationsystem.ReservationsystemPackage#getPassenger_Passenger()
     * @model
     * @generated
     */
    Booking getPassenger();

    /**
     * Sets the value of the '{@link reservationsystem.Passenger#getPassenger <em>Passenger</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passenger</em>' reference.
     * @see #getPassenger()
     * @generated
     */
    void setPassenger(Booking value);

    /**
     * Returns the value of the '<em><b>Booking</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.Booking#getPassenger <em>Passenger</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Booking</em>' reference.
     * @see #setBooking(Booking)
     * @see reservationsystem.ReservationsystemPackage#getPassenger_Booking()
     * @see reservationsystem.Booking#getPassenger
     * @model opposite="passenger" required="true"
     * @generated
     */
    Booking getBooking();

    /**
     * Sets the value of the '{@link reservationsystem.Passenger#getBooking <em>Booking</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booking</em>' reference.
     * @see #getBooking()
     * @generated
     */
    void setBooking(Booking value);

    /**
     * Returns the value of the '<em><b>Special Needs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Special Needs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Special Needs</em>' attribute.
     * @see #setSpecialNeeds(String)
     * @see reservationsystem.ReservationsystemPackage#getPassenger_SpecialNeeds()
     * @model
     * @generated
     */
    String getSpecialNeeds();

    /**
     * Sets the value of the '{@link reservationsystem.Passenger#getSpecialNeeds <em>Special Needs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Special Needs</em>' attribute.
     * @see #getSpecialNeeds()
     * @generated
     */
    void setSpecialNeeds(String value);

    /**
     * Returns the value of the '<em><b>Food Pref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Food Pref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Food Pref</em>' attribute.
     * @see #setFoodPref(String)
     * @see reservationsystem.ReservationsystemPackage#getPassenger_FoodPref()
     * @model
     * @generated
     */
    String getFoodPref();

    /**
     * Sets the value of the '{@link reservationsystem.Passenger#getFoodPref <em>Food Pref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Food Pref</em>' attribute.
     * @see #getFoodPref()
     * @generated
     */
    void setFoodPref(String value);

} // Passenger
