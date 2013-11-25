/**
 */
package reservationsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Booking#getPaymentInfo <em>Payment Info</em>}</li>
 *   <li>{@link reservationsystem.Booking#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link reservationsystem.Booking#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.Booking#getBookNo <em>Book No</em>}</li>
 *   <li>{@link reservationsystem.Booking#getBookingStatus <em>Booking Status</em>}</li>
 *   <li>{@link reservationsystem.Booking#getSeats <em>Seats</em>}</li>
 *   <li>{@link reservationsystem.Booking#getBaggageInfo <em>Baggage Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
    /**
     * Returns the value of the '<em><b>Payment Info</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.PaymentInfo}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Payment Info</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Payment Info</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getBooking_PaymentInfo()
     * @model
     * @generated
     */
    EList<PaymentInfo> getPaymentInfo();

    /**
     * Returns the value of the '<em><b>Passenger</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Passenger}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Passenger#getBooking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Passenger</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passenger</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getBooking_Passenger()
     * @see reservationsystem.Passenger#getBooking
     * @model opposite="booking" required="true"
     * @generated
     */
    EList<Passenger> getPassenger();

    /**
     * Returns the value of the '<em><b>Specific Flight</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.SpecificFlight}.
     * It is bidirectional and its opposite is '{@link reservationsystem.SpecificFlight#getBooking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specific Flight</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specific Flight</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getBooking_SpecificFlight()
     * @see reservationsystem.SpecificFlight#getBooking
     * @model opposite="booking" required="true"
     * @generated
     */
    EList<SpecificFlight> getSpecificFlight();

    /**
     * Returns the value of the '<em><b>Book No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Book No</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Book No</em>' attribute.
     * @see #setBookNo(String)
     * @see reservationsystem.ReservationsystemPackage#getBooking_BookNo()
     * @model
     * @generated
     */
    String getBookNo();

    /**
     * Sets the value of the '{@link reservationsystem.Booking#getBookNo <em>Book No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Book No</em>' attribute.
     * @see #getBookNo()
     * @generated
     */
    void setBookNo(String value);

    /**
     * Returns the value of the '<em><b>Booking Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Booking Status</em>' attribute.
     * @see #setBookingStatus(int)
     * @see reservationsystem.ReservationsystemPackage#getBooking_BookingStatus()
     * @model
     * @generated
     */
    int getBookingStatus();

    /**
     * Sets the value of the '{@link reservationsystem.Booking#getBookingStatus <em>Booking Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Booking Status</em>' attribute.
     * @see #getBookingStatus()
     * @generated
     */
    void setBookingStatus(int value);

    /**
     * Returns the value of the '<em><b>Seats</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Seat}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Seat#getBook <em>Book</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seats</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seats</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getBooking_Seats()
     * @see reservationsystem.Seat#getBook
     * @model opposite="book" required="true"
     * @generated
     */
    EList<Seat> getSeats();

    /**
     * Returns the value of the '<em><b>Baggage Info</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Baggage Info</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Baggage Info</em>' attribute.
     * @see #setBaggageInfo(String)
     * @see reservationsystem.ReservationsystemPackage#getBooking_BaggageInfo()
     * @model
     * @generated
     */
    String getBaggageInfo();

    /**
     * Sets the value of the '{@link reservationsystem.Booking#getBaggageInfo <em>Baggage Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Baggage Info</em>' attribute.
     * @see #getBaggageInfo()
     * @generated
     */
    void setBaggageInfo(String value);

} // Booking
