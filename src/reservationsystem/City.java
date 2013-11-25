/**
 */
package reservationsystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reservationsystem.City#getAirport <em>Airport</em>}</li>
 *   <li>{@link reservationsystem.City#getId <em>Id</em>}</li>
 *   <li>{@link reservationsystem.City#getName <em>Name</em>}</li>
 *   <li>{@link reservationsystem.City#getAbbr <em>Abbr</em>}</li>
 * </ul>
 * </p>
 *
 * @see reservationsystem.ReservationsystemPackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
    /**
     * Returns the value of the '<em><b>Airport</b></em>' reference list.
     * The list contents are of type {@link reservationsystem.Airport}.
     * It is bidirectional and its opposite is '{@link reservationsystem.Airport#getCity <em>City</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Airport</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Airport</em>' reference list.
     * @see reservationsystem.ReservationsystemPackage#getCity_Airport()
     * @see reservationsystem.Airport#getCity
     * @model opposite="city"
     * @generated
     */
    EList<Airport> getAirport();

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
     * @see reservationsystem.ReservationsystemPackage#getCity_Id()
     * @model
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link reservationsystem.City#getId <em>Id</em>}' attribute.
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
     * @see reservationsystem.ReservationsystemPackage#getCity_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link reservationsystem.City#getName <em>Name</em>}' attribute.
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
     * @see reservationsystem.ReservationsystemPackage#getCity_Abbr()
     * @model
     * @generated
     */
    String getAbbr();

    /**
     * Sets the value of the '{@link reservationsystem.City#getAbbr <em>Abbr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abbr</em>' attribute.
     * @see #getAbbr()
     * @generated
     */
    void setAbbr(String value);

} // City
