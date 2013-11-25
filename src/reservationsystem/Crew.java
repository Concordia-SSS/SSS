/**
 */
package reservationsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Crew#getLeader <em>Leader</em>}</li>
 *   <li>{@link reservationsystem.Crew#getSpecificFlight <em>Specific Flight</em>}</li>
 *   <li>{@link reservationsystem.Crew#getEmployeeId <em>Employee Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getCrew()
 * @model abstract="true"
 * @generated
 */
public interface Crew extends Person {
    /**
     * Returns the value of the '<em><b>Leader</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leader</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leader</em>' reference.
     * @see #setLeader(Crew)
     * @see reservationsystem.ReservationsystemPackage#getCrew_Leader()
     * @model required="true"
     * @generated
     */
    Crew getLeader();

    /**
     * Sets the value of the '{@link reservationsystem.Crew#getLeader <em>Leader</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leader</em>' reference.
     * @see #getLeader()
     * @generated
     */
    void setLeader(Crew value);

    /**
     * Returns the value of the '<em><b>Specific Flight</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.SpecificFlight}.
     * It is bidirectional and its opposite is '{@link reservationsystem.SpecificFlight#getCrew <em>Crew</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specific Flight</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specific Flight</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getCrew_SpecificFlight()
     * @see reservationsystem.SpecificFlight#getCrew
     * @model opposite="crew"
     * @generated
     */
    EList<SpecificFlight> getSpecificFlight();

    /**
     * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Employee Id</em>' attribute.
     * @see #setEmployeeId(String)
     * @see reservationsystem.ReservationsystemPackage#getCrew_EmployeeId()
     * @model
     * @generated
     */
    String getEmployeeId();

    /**
     * Sets the value of the '{@link reservationsystem.Crew#getEmployeeId <em>Employee Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Employee Id</em>' attribute.
     * @see #getEmployeeId()
     * @generated
     */
    void setEmployeeId(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void setLeader();

} // Crew
