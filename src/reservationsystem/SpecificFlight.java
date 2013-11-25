/**
 */
package reservationsystem;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.SpecificFlight#getGeneralFlight <em>General Flight</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getPlane <em>Plane</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getCrew <em>Crew</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getBooking <em>Booking</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getDate <em>Date</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getRealDepTime <em>Real Dep Time</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getRealArriTime <em>Real Arri Time</em>}</li>
 *   <li>{@link reservationsystem.SpecificFlight#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getSpecificFlight()
 * @model
 * @generated
 */
public interface SpecificFlight extends EObject {
    /**
     * Returns the value of the '<em><b>General Flight</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.GeneralFlight#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>General Flight</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>General Flight</em>' reference.
     * @see #setGeneralFlight(GeneralFlight)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_GeneralFlight()
     * @see reservationsystem.GeneralFlight#getSpecificFlight
     * @model opposite="specificFlight" required="true"
     * @generated
     */
    GeneralFlight getGeneralFlight();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getGeneralFlight <em>General Flight</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Flight</em>' reference.
     * @see #getGeneralFlight()
     * @generated
     */
    void setGeneralFlight(GeneralFlight value);

    /**
     * Returns the value of the '<em><b>Plane</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.Plane#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane</em>' reference.
     * @see #setPlane(Plane)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Plane()
     * @see reservationsystem.Plane#getSpecificFlight
     * @model opposite="specificFlight" required="true"
     * @generated
     */
    Plane getPlane();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getPlane <em>Plane</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plane</em>' reference.
     * @see #getPlane()
     * @generated
     */
    void setPlane(Plane value);

    /**
     * Returns the value of the '<em><b>Crew</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Crew}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Crew#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crew</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crew</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Crew()
     * @see reservationsystem.Crew#getSpecificFlight
     * @model opposite="specificFlight" required="true"
     * @generated
     */
    EList<Crew> getCrew();

    /**
     * Returns the value of the '<em><b>Booking</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Booking}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Booking#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Booking</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Booking</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Booking()
     * @see reservationsystem.Booking#getSpecificFlight
     * @model opposite="specificFlight"
     * @generated
     */
    EList<Booking> getBooking();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Id()
     * @model
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Date()
     * @model
     * @generated
     */
    Date getDate();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
    void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Real Dep Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Real Dep Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Real Dep Time</em>' attribute.
     * @see #setRealDepTime(Date)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_RealDepTime()
     * @model
     * @generated
     */
    Date getRealDepTime();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getRealDepTime <em>Real Dep Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Real Dep Time</em>' attribute.
     * @see #getRealDepTime()
     * @generated
     */
    void setRealDepTime(Date value);

    /**
     * Returns the value of the '<em><b>Real Arri Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Real Arri Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Real Arri Time</em>' attribute.
     * @see #setRealArriTime(Date)
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_RealArriTime()
     * @model
     * @generated
     */
    Date getRealArriTime();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getRealArriTime <em>Real Arri Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Real Arri Time</em>' attribute.
     * @see #getRealArriTime()
     * @generated
     */
    void setRealArriTime(Date value);

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
     * @see reservationsystem.ReservationsystemPackage#getSpecificFlight_Status()
     * @model
     * @generated
     */
    int getStatus();

    /**
     * Sets the value of the '{@link reservationsystem.SpecificFlight#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void assignPilot(int personId);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void assignAttd(int personId);

} // SpecificFlight
