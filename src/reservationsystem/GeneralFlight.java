/**
 */
package reservationsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.GeneralFlight#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.GeneralFlight#getFrom <em>From</em>}</li>
 *   <li>{@link reservationsystem.GeneralFlight#getFlightNo <em>Flight No</em>}</li>
 *   <li>{@link reservationsystem.GeneralFlight#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link reservationsystem.GeneralFlight#getTo <em>To</em>}</li>
 *   <li>{@link reservationsystem.GeneralFlight#getArrivalTime <em>Arrival Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getGeneralFlight()
 * @model
 * @generated
 */
public interface GeneralFlight extends EObject {
    /**
     * Returns the value of the '<em><b>Specific Flight</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.SpecificFlight}.
     * It is bidirectional and its opposite is '{@link reservationsystem.SpecificFlight#getGeneralFlight <em>General Flight</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specific Flight</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specific Flight</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_SpecificFlight()
     * @see reservationsystem.SpecificFlight#getGeneralFlight
     * @model opposite="generalFlight" required="true"
     * @generated
     */
    EList<SpecificFlight> getSpecificFlight();

    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(Airport)
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_From()
     * @model required="true"
     * @generated
     */
    Airport getFrom();

    /**
     * Sets the value of the '{@link reservationsystem.GeneralFlight#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(Airport value);

    /**
     * Returns the value of the '<em><b>Flight No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flight No</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flight No</em>' attribute.
     * @see #setFlightNo(String)
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_FlightNo()
     * @model
     * @generated
     */
    String getFlightNo();

    /**
     * Sets the value of the '{@link reservationsystem.GeneralFlight#getFlightNo <em>Flight No</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flight No</em>' attribute.
     * @see #getFlightNo()
     * @generated
     */
    void setFlightNo(String value);

    /**
     * Returns the value of the '<em><b>Departure Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Departure Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Departure Time</em>' attribute.
     * @see #setDepartureTime(String)
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_DepartureTime()
     * @model
     * @generated
     */
    String getDepartureTime();

    /**
     * Sets the value of the '{@link reservationsystem.GeneralFlight#getDepartureTime <em>Departure Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Departure Time</em>' attribute.
     * @see #getDepartureTime()
     * @generated
     */
    void setDepartureTime(String value);

    /**
     * Returns the value of the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' reference.
     * @see #setTo(Airport)
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_To()
     * @model required="true"
     * @generated
     */
    Airport getTo();

    /**
     * Sets the value of the '{@link reservationsystem.GeneralFlight#getTo <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' reference.
     * @see #getTo()
     * @generated
     */
    void setTo(Airport value);

    /**
     * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arrival Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arrival Time</em>' attribute.
     * @see #setArrivalTime(String)
     * @see reservationsystem.ReservationsystemPackage#getGeneralFlight_ArrivalTime()
     * @model
     * @generated
     */
    String getArrivalTime();

    /**
     * Sets the value of the '{@link reservationsystem.GeneralFlight#getArrivalTime <em>Arrival Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arrival Time</em>' attribute.
     * @see #getArrivalTime()
     * @generated
     */
    void setArrivalTime(String value);

} // GeneralFlight
