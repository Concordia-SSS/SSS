/**
 */
package reservationsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Plane#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.Plane#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.Plane#getModel <em>Model</em>}</li>
 *   <li>{@link reservationsystem.Plane#getCrewNum <em>Crew Num</em>}</li>
 *   <li>{@link reservationsystem.Plane#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link reservationsystem.Plane#getSeats <em>Seats</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends EObject {
    /**
     * Returns the value of the '<em><b>Specific Flight</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.SpecificFlight}.
     * It is bidirectional and its opposite is '{@link reservationsystem.SpecificFlight#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specific Flight</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specific Flight</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getPlane_SpecificFlight()
     * @see reservationsystem.SpecificFlight#getPlane
     * @model opposite="plane"
     * @generated
     */
    EList<SpecificFlight> getSpecificFlight();

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
     * @see reservationsystem.ReservationsystemPackage#getPlane_Id()
     * @model
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link reservationsystem.Plane#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' attribute.
     * @see #setModel(String)
     * @see reservationsystem.ReservationsystemPackage#getPlane_Model()
     * @model
     * @generated
     */
    String getModel();

    /**
     * Sets the value of the '{@link reservationsystem.Plane#getModel <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' attribute.
     * @see #getModel()
     * @generated
     */
    void setModel(String value);

    /**
     * Returns the value of the '<em><b>Crew Num</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crew Num</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crew Num</em>' attribute.
     * @see #setCrewNum(int)
     * @see reservationsystem.ReservationsystemPackage#getPlane_CrewNum()
     * @model
     * @generated
     */
    int getCrewNum();

    /**
     * Sets the value of the '{@link reservationsystem.Plane#getCrewNum <em>Crew Num</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crew Num</em>' attribute.
     * @see #getCrewNum()
     * @generated
     */
    void setCrewNum(int value);

    /**
     * Returns the value of the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity</em>' attribute.
     * @see #setCapacity(int)
     * @see reservationsystem.ReservationsystemPackage#getPlane_Capacity()
     * @model
     * @generated
     */
    int getCapacity();

    /**
     * Sets the value of the '{@link reservationsystem.Plane#getCapacity <em>Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacity</em>' attribute.
     * @see #getCapacity()
     * @generated
     */
    void setCapacity(int value);

    /**
     * Returns the value of the '<em><b>Seats</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Seat}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Seat#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seats</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seats</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getPlane_Seats()
     * @see reservationsystem.Seat#getPlane
     * @model opposite="plane" required="true"
     * @generated
     */
    EList<Seat> getSeats();

} // Plane
