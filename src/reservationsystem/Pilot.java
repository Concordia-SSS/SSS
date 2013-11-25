/**
 */
package reservationsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pilot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Pilot#getCertificationId <em>Certification Id</em>}</li>
 *   <li>{@link reservationsystem.Pilot#getExperience <em>Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getPilot()
 * @model
 * @generated
 */
public interface Pilot extends Crew {
    /**
     * Returns the value of the '<em><b>Certification Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Certification Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Certification Id</em>' attribute.
     * @see #setCertificationId(String)
     * @see reservationsystem.ReservationsystemPackage#getPilot_CertificationId()
     * @model
     * @generated
     */
    String getCertificationId();

    /**
     * Sets the value of the '{@link reservationsystem.Pilot#getCertificationId <em>Certification Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Certification Id</em>' attribute.
     * @see #getCertificationId()
     * @generated
     */
    void setCertificationId(String value);

    /**
     * Returns the value of the '<em><b>Experience</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Experience</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Experience</em>' attribute.
     * @see #setExperience(int)
     * @see reservationsystem.ReservationsystemPackage#getPilot_Experience()
     * @model
     * @generated
     */
    int getExperience();

    /**
     * Sets the value of the '{@link reservationsystem.Pilot#getExperience <em>Experience</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Experience</em>' attribute.
     * @see #getExperience()
     * @generated
     */
    void setExperience(int value);

} // Pilot
