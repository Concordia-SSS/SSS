/**
 */
package reservationsystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.Airport#getCity <em>City</em>}</li>
 *   <li>{@link reservationsystem.Airport#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.Airport#getName <em>Name</em>}</li>
 *   <li>{@link reservationsystem.Airport#getAbbr <em>Abbr</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getAirport()
 * @model
 * @generated
 */
public interface Airport extends EObject {
    /**
     * Returns the value of the '<em><b>City</b></em>' reference.
     * It is bidirectional and its opposite is '{@link reservationsystem.City#getAirport <em>Airport</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>City</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>City</em>' reference.
     * @see #setCity(City)
     * @see reservationsystem.ReservationsystemPackage#getAirport_City()
     * @see reservationsystem.City#getAirport
     * @model opposite="airport" required="true"
     * @generated
     */
    City getCity();

    /**
     * Sets the value of the '{@link reservationsystem.Airport#getCity <em>City</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>City</em>' reference.
     * @see #getCity()
     * @generated
     */
    void setCity(City value);

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
     * @see reservationsystem.ReservationsystemPackage#getAirport_Id()
     * @model
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link reservationsystem.Airport#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see reservationsystem.ReservationsystemPackage#getAirport_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link reservationsystem.Airport#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Abbr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abbr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abbr</em>' attribute.
     * @see #setAbbr(String)
     * @see reservationsystem.ReservationsystemPackage#getAirport_Abbr()
     * @model
     * @generated
     */
    String getAbbr();

    /**
     * Sets the value of the '{@link reservationsystem.Airport#getAbbr <em>Abbr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbr</em>' attribute.
     * @see #getAbbr()
     * @generated
     */
    void setAbbr(String value);

} // Airport
