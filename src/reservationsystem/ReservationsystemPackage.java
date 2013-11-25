/**
 */
package reservationsystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see reservationsystem.ReservationsystemFactory
 * @model kind="package"
 * @generated
 */
public interface ReservationsystemPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "reservationsystem";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://reservationsystem/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "reservationsystem";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ReservationsystemPackage eINSTANCE = reservationsystem.impl.ReservationsystemPackageImpl.init();

    /**
     * The meta object id for the '{@link reservationsystem.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.PersonImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getPerson()
     * @generated
     */
    int PERSON = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__NAME = 0;

    /**
     * The feature id for the '<em><b>Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ADDR = 1;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__PHONE = 2;

    /**
     * The feature id for the '<em><b>Citizenship</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__CITIZENSHIP = 3;

    /**
     * The feature id for the '<em><b>Residence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__RESIDENCE = 4;

    /**
     * The feature id for the '<em><b>Middle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__MIDDLE_NAME = 5;

    /**
     * The feature id for the '<em><b>Family Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__FAMILY_NAME = 6;

    /**
     * The feature id for the '<em><b>Birth Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__BIRTH_DATE = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__ID = 8;

    /**
     * The feature id for the '<em><b>Passport Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__PASSPORT_ID = 9;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__EMAIL = 10;

    /**
     * The feature id for the '<em><b>Gender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__GENDER = 11;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = 12;

    /**
     * The number of operations of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.UserImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getUser()
     * @generated
     */
    int USER = 1;

    /**
     * The feature id for the '<em><b>Belongs To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER__BELONGS_TO = 0;

    /**
     * The feature id for the '<em><b>User Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER__USER_TYPE = 1;

    /**
     * The feature id for the '<em><b>User Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER__USER_NAME = 2;

    /**
     * The feature id for the '<em><b>Md5 Pwd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER__MD5_PWD = 3;

    /**
     * The number of structural features of the '<em>User</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>User</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.CrewImpl <em>Crew</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.CrewImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getCrew()
     * @generated
     */
    int CREW = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__ADDR = PERSON__ADDR;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__PHONE = PERSON__PHONE;

    /**
     * The feature id for the '<em><b>Citizenship</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__CITIZENSHIP = PERSON__CITIZENSHIP;

    /**
     * The feature id for the '<em><b>Residence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__RESIDENCE = PERSON__RESIDENCE;

    /**
     * The feature id for the '<em><b>Middle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__MIDDLE_NAME = PERSON__MIDDLE_NAME;

    /**
     * The feature id for the '<em><b>Family Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__FAMILY_NAME = PERSON__FAMILY_NAME;

    /**
     * The feature id for the '<em><b>Birth Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__BIRTH_DATE = PERSON__BIRTH_DATE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__ID = PERSON__ID;

    /**
     * The feature id for the '<em><b>Passport Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__PASSPORT_ID = PERSON__PASSPORT_ID;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__EMAIL = PERSON__EMAIL;

    /**
     * The feature id for the '<em><b>Gender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__GENDER = PERSON__GENDER;

    /**
     * The feature id for the '<em><b>Leader</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__LEADER = PERSON_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__SPECIFIC_FLIGHT = PERSON_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Employee Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW__EMPLOYEE_ID = PERSON_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Crew</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Set Leader</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW___SET_LEADER = PERSON_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Crew</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREW_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link reservationsystem.impl.PassengerImpl <em>Passenger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.PassengerImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getPassenger()
     * @generated
     */
    int PASSENGER = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__ADDR = PERSON__ADDR;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__PHONE = PERSON__PHONE;

    /**
     * The feature id for the '<em><b>Citizenship</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__CITIZENSHIP = PERSON__CITIZENSHIP;

    /**
     * The feature id for the '<em><b>Residence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__RESIDENCE = PERSON__RESIDENCE;

    /**
     * The feature id for the '<em><b>Middle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__MIDDLE_NAME = PERSON__MIDDLE_NAME;

    /**
     * The feature id for the '<em><b>Family Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__FAMILY_NAME = PERSON__FAMILY_NAME;

    /**
     * The feature id for the '<em><b>Birth Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__BIRTH_DATE = PERSON__BIRTH_DATE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__ID = PERSON__ID;

    /**
     * The feature id for the '<em><b>Passport Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__PASSPORT_ID = PERSON__PASSPORT_ID;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__EMAIL = PERSON__EMAIL;

    /**
     * The feature id for the '<em><b>Gender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__GENDER = PERSON__GENDER;

    /**
     * The feature id for the '<em><b>Passenger</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__PASSENGER = PERSON_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Booking</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__BOOKING = PERSON_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Special Needs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__SPECIAL_NEEDS = PERSON_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Food Pref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER__FOOD_PREF = PERSON_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Passenger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Passenger</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSENGER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.PilotImpl <em>Pilot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.PilotImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getPilot()
     * @generated
     */
    int PILOT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__NAME = CREW__NAME;

    /**
     * The feature id for the '<em><b>Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__ADDR = CREW__ADDR;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__PHONE = CREW__PHONE;

    /**
     * The feature id for the '<em><b>Citizenship</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__CITIZENSHIP = CREW__CITIZENSHIP;

    /**
     * The feature id for the '<em><b>Residence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__RESIDENCE = CREW__RESIDENCE;

    /**
     * The feature id for the '<em><b>Middle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__MIDDLE_NAME = CREW__MIDDLE_NAME;

    /**
     * The feature id for the '<em><b>Family Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__FAMILY_NAME = CREW__FAMILY_NAME;

    /**
     * The feature id for the '<em><b>Birth Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__BIRTH_DATE = CREW__BIRTH_DATE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__ID = CREW__ID;

    /**
     * The feature id for the '<em><b>Passport Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__PASSPORT_ID = CREW__PASSPORT_ID;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__EMAIL = CREW__EMAIL;

    /**
     * The feature id for the '<em><b>Gender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__GENDER = CREW__GENDER;

    /**
     * The feature id for the '<em><b>Leader</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__LEADER = CREW__LEADER;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__SPECIFIC_FLIGHT = CREW__SPECIFIC_FLIGHT;

    /**
     * The feature id for the '<em><b>Employee Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__EMPLOYEE_ID = CREW__EMPLOYEE_ID;

    /**
     * The feature id for the '<em><b>Certification Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__CERTIFICATION_ID = CREW_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Experience</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT__EXPERIENCE = CREW_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Pilot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT_FEATURE_COUNT = CREW_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Set Leader</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT___SET_LEADER = CREW___SET_LEADER;

    /**
     * The number of operations of the '<em>Pilot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PILOT_OPERATION_COUNT = CREW_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.AttendantImpl <em>Attendant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.AttendantImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getAttendant()
     * @generated
     */
    int ATTENDANT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__NAME = CREW__NAME;

    /**
     * The feature id for the '<em><b>Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__ADDR = CREW__ADDR;

    /**
     * The feature id for the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__PHONE = CREW__PHONE;

    /**
     * The feature id for the '<em><b>Citizenship</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__CITIZENSHIP = CREW__CITIZENSHIP;

    /**
     * The feature id for the '<em><b>Residence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__RESIDENCE = CREW__RESIDENCE;

    /**
     * The feature id for the '<em><b>Middle Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__MIDDLE_NAME = CREW__MIDDLE_NAME;

    /**
     * The feature id for the '<em><b>Family Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__FAMILY_NAME = CREW__FAMILY_NAME;

    /**
     * The feature id for the '<em><b>Birth Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__BIRTH_DATE = CREW__BIRTH_DATE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__ID = CREW__ID;

    /**
     * The feature id for the '<em><b>Passport Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__PASSPORT_ID = CREW__PASSPORT_ID;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__EMAIL = CREW__EMAIL;

    /**
     * The feature id for the '<em><b>Gender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__GENDER = CREW__GENDER;

    /**
     * The feature id for the '<em><b>Leader</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__LEADER = CREW__LEADER;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__SPECIFIC_FLIGHT = CREW__SPECIFIC_FLIGHT;

    /**
     * The feature id for the '<em><b>Employee Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT__EMPLOYEE_ID = CREW__EMPLOYEE_ID;

    /**
     * The number of structural features of the '<em>Attendant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT_FEATURE_COUNT = CREW_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Set Leader</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT___SET_LEADER = CREW___SET_LEADER;

    /**
     * The number of operations of the '<em>Attendant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTENDANT_OPERATION_COUNT = CREW_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.BookingImpl <em>Booking</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.BookingImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getBooking()
     * @generated
     */
    int BOOKING = 6;

    /**
     * The feature id for the '<em><b>Payment Info</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__PAYMENT_INFO = 0;

    /**
     * The feature id for the '<em><b>Passenger</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__PASSENGER = 1;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__SPECIFIC_FLIGHT = 2;

    /**
     * The feature id for the '<em><b>Book No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__BOOK_NO = 3;

    /**
     * The feature id for the '<em><b>Booking Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__BOOKING_STATUS = 4;

    /**
     * The feature id for the '<em><b>Seats</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__SEATS = 5;

    /**
     * The feature id for the '<em><b>Baggage Info</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING__BAGGAGE_INFO = 6;

    /**
     * The number of structural features of the '<em>Booking</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Booking</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOKING_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.GeneralFlightImpl <em>General Flight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.GeneralFlightImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getGeneralFlight()
     * @generated
     */
    int GENERAL_FLIGHT = 7;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__SPECIFIC_FLIGHT = 0;

    /**
     * The feature id for the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__FROM = 1;

    /**
     * The feature id for the '<em><b>Flight No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__FLIGHT_NO = 2;

    /**
     * The feature id for the '<em><b>Departure Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__DEPARTURE_TIME = 3;

    /**
     * The feature id for the '<em><b>To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__TO = 4;

    /**
     * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT__ARRIVAL_TIME = 5;

    /**
     * The number of structural features of the '<em>General Flight</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>General Flight</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_FLIGHT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.SpecificFlightImpl <em>Specific Flight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.SpecificFlightImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getSpecificFlight()
     * @generated
     */
    int SPECIFIC_FLIGHT = 8;

    /**
     * The feature id for the '<em><b>General Flight</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__GENERAL_FLIGHT = 0;

    /**
     * The feature id for the '<em><b>Plane</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__PLANE = 1;

    /**
     * The feature id for the '<em><b>Crew</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__CREW = 2;

    /**
     * The feature id for the '<em><b>Booking</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__BOOKING = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__ID = 4;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__DATE = 5;

    /**
     * The feature id for the '<em><b>Real Dep Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__REAL_DEP_TIME = 6;

    /**
     * The feature id for the '<em><b>Real Arri Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__REAL_ARRI_TIME = 7;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT__STATUS = 8;

    /**
     * The number of structural features of the '<em>Specific Flight</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT_FEATURE_COUNT = 9;

    /**
     * The operation id for the '<em>Assign Pilot</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT___ASSIGN_PILOT__INT = 0;

    /**
     * The operation id for the '<em>Assign Attd</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT___ASSIGN_ATTD__INT = 1;

    /**
     * The number of operations of the '<em>Specific Flight</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIFIC_FLIGHT_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link reservationsystem.impl.PlaneImpl <em>Plane</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.PlaneImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getPlane()
     * @generated
     */
    int PLANE = 9;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__SPECIFIC_FLIGHT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__ID = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__MODEL = 2;

    /**
     * The feature id for the '<em><b>Crew Num</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__CREW_NUM = 3;

    /**
     * The feature id for the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__CAPACITY = 4;

    /**
     * The feature id for the '<em><b>Seats</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE__SEATS = 5;

    /**
     * The number of structural features of the '<em>Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Plane</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLANE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.AirportImpl <em>Airport</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.AirportImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getAirport()
     * @generated
     */
    int AIRPORT = 10;

    /**
     * The feature id for the '<em><b>City</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT__CITY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT__NAME = 2;

    /**
     * The feature id for the '<em><b>Abbr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT__ABBR = 3;

    /**
     * The number of structural features of the '<em>Airport</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Airport</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AIRPORT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.CityImpl <em>City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.CityImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getCity()
     * @generated
     */
    int CITY = 11;

    /**
     * The feature id for the '<em><b>Airport</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__AIRPORT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__NAME = 2;

    /**
     * The feature id for the '<em><b>Abbr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__ABBR = 3;

    /**
     * The number of structural features of the '<em>City</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>City</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.PaymentInfoImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getPaymentInfo()
     * @generated
     */
    int PAYMENT_INFO = 12;

    /**
     * The feature id for the '<em><b>Payment Info</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__PAYMENT_INFO = BOOKING__PAYMENT_INFO;

    /**
     * The feature id for the '<em><b>Passenger</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__PASSENGER = BOOKING__PASSENGER;

    /**
     * The feature id for the '<em><b>Specific Flight</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__SPECIFIC_FLIGHT = BOOKING__SPECIFIC_FLIGHT;

    /**
     * The feature id for the '<em><b>Book No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__BOOK_NO = BOOKING__BOOK_NO;

    /**
     * The feature id for the '<em><b>Booking Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__BOOKING_STATUS = BOOKING__BOOKING_STATUS;

    /**
     * The feature id for the '<em><b>Seats</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__SEATS = BOOKING__SEATS;

    /**
     * The feature id for the '<em><b>Baggage Info</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__BAGGAGE_INFO = BOOKING__BAGGAGE_INFO;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__ID = BOOKING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Create Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__CREATE_TIME = BOOKING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__STATUS = BOOKING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pay Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__PAY_TIME = BOOKING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__TYPE = BOOKING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Card No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__CARD_NO = BOOKING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Card Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__CARD_OWNER = BOOKING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Card Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO__CARD_ADDR = BOOKING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Payment Info</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO_FEATURE_COUNT = BOOKING_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Payment Info</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAYMENT_INFO_OPERATION_COUNT = BOOKING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link reservationsystem.impl.SeatImpl <em>Seat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see reservationsystem.impl.SeatImpl
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getSeat()
     * @generated
     */
    int SEAT = 13;

    /**
     * The feature id for the '<em><b>No</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT__NO = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT__TYPE = 1;

    /**
     * The feature id for the '<em><b>Is Exit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT__IS_EXIT = 2;

    /**
     * The feature id for the '<em><b>Plane</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT__PLANE = 3;

    /**
     * The feature id for the '<em><b>Book</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT__BOOK = 4;

    /**
     * The number of structural features of the '<em>Seat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Seat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEAT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>User Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see reservationsystem.impl.ReservationsystemPackageImpl#getUserType()
     * @generated
     */
    int USER_TYPE = 14;


    /**
     * Returns the meta object for class '{@link reservationsystem.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see reservationsystem.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see reservationsystem.Person#getName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Name();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getAddr <em>Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Addr</em>'.
     * @see reservationsystem.Person#getAddr()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Addr();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getPhone <em>Phone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Phone</em>'.
     * @see reservationsystem.Person#getPhone()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Phone();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getCitizenship <em>Citizenship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Citizenship</em>'.
     * @see reservationsystem.Person#getCitizenship()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Citizenship();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getResidence <em>Residence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Residence</em>'.
     * @see reservationsystem.Person#getResidence()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Residence();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getMiddleName <em>Middle Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Middle Name</em>'.
     * @see reservationsystem.Person#getMiddleName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_MiddleName();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getFamilyName <em>Family Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Family Name</em>'.
     * @see reservationsystem.Person#getFamilyName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_FamilyName();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getBirthDate <em>Birth Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Birth Date</em>'.
     * @see reservationsystem.Person#getBirthDate()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_BirthDate();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.Person#getId()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getPassportId <em>Passport Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Passport Id</em>'.
     * @see reservationsystem.Person#getPassportId()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_PassportId();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getEmail <em>Email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Email</em>'.
     * @see reservationsystem.Person#getEmail()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Email();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Person#getGender <em>Gender</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gender</em>'.
     * @see reservationsystem.Person#getGender()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Gender();

    /**
     * Returns the meta object for class '{@link reservationsystem.User <em>User</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User</em>'.
     * @see reservationsystem.User
     * @generated
     */
    EClass getUser();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.User#getBelongsTo <em>Belongs To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Belongs To</em>'.
     * @see reservationsystem.User#getBelongsTo()
     * @see #getUser()
     * @generated
     */
    EReference getUser_BelongsTo();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.User#getUserType <em>User Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Type</em>'.
     * @see reservationsystem.User#getUserType()
     * @see #getUser()
     * @generated
     */
    EAttribute getUser_UserType();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.User#getUserName <em>User Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>User Name</em>'.
     * @see reservationsystem.User#getUserName()
     * @see #getUser()
     * @generated
     */
    EAttribute getUser_UserName();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.User#getMd5Pwd <em>Md5 Pwd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Md5 Pwd</em>'.
     * @see reservationsystem.User#getMd5Pwd()
     * @see #getUser()
     * @generated
     */
    EAttribute getUser_Md5Pwd();

    /**
     * Returns the meta object for class '{@link reservationsystem.Crew <em>Crew</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Crew</em>'.
     * @see reservationsystem.Crew
     * @generated
     */
    EClass getCrew();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Crew#getLeader <em>Leader</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Leader</em>'.
     * @see reservationsystem.Crew#getLeader()
     * @see #getCrew()
     * @generated
     */
    EReference getCrew_Leader();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Crew#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Specific Flight</em>'.
     * @see reservationsystem.Crew#getSpecificFlight()
     * @see #getCrew()
     * @generated
     */
    EReference getCrew_SpecificFlight();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Crew#getEmployeeId <em>Employee Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Employee Id</em>'.
     * @see reservationsystem.Crew#getEmployeeId()
     * @see #getCrew()
     * @generated
     */
    EAttribute getCrew_EmployeeId();

    /**
     * Returns the meta object for the '{@link reservationsystem.Crew#setLeader() <em>Set Leader</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Set Leader</em>' operation.
     * @see reservationsystem.Crew#setLeader()
     * @generated
     */
    EOperation getCrew__SetLeader();

    /**
     * Returns the meta object for class '{@link reservationsystem.Passenger <em>Passenger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Passenger</em>'.
     * @see reservationsystem.Passenger
     * @generated
     */
    EClass getPassenger();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Passenger#getPassenger <em>Passenger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Passenger</em>'.
     * @see reservationsystem.Passenger#getPassenger()
     * @see #getPassenger()
     * @generated
     */
    EReference getPassenger_Passenger();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Passenger#getBooking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Booking</em>'.
     * @see reservationsystem.Passenger#getBooking()
     * @see #getPassenger()
     * @generated
     */
    EReference getPassenger_Booking();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Passenger#getSpecialNeeds <em>Special Needs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Special Needs</em>'.
     * @see reservationsystem.Passenger#getSpecialNeeds()
     * @see #getPassenger()
     * @generated
     */
    EAttribute getPassenger_SpecialNeeds();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Passenger#getFoodPref <em>Food Pref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Food Pref</em>'.
     * @see reservationsystem.Passenger#getFoodPref()
     * @see #getPassenger()
     * @generated
     */
    EAttribute getPassenger_FoodPref();

    /**
     * Returns the meta object for class '{@link reservationsystem.Pilot <em>Pilot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pilot</em>'.
     * @see reservationsystem.Pilot
     * @generated
     */
    EClass getPilot();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Pilot#getCertificationId <em>Certification Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Certification Id</em>'.
     * @see reservationsystem.Pilot#getCertificationId()
     * @see #getPilot()
     * @generated
     */
    EAttribute getPilot_CertificationId();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Pilot#getExperience <em>Experience</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Experience</em>'.
     * @see reservationsystem.Pilot#getExperience()
     * @see #getPilot()
     * @generated
     */
    EAttribute getPilot_Experience();

    /**
     * Returns the meta object for class '{@link reservationsystem.Attendant <em>Attendant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attendant</em>'.
     * @see reservationsystem.Attendant
     * @generated
     */
    EClass getAttendant();

    /**
     * Returns the meta object for class '{@link reservationsystem.Booking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Booking</em>'.
     * @see reservationsystem.Booking
     * @generated
     */
    EClass getBooking();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Booking#getPaymentInfo <em>Payment Info</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Payment Info</em>'.
     * @see reservationsystem.Booking#getPaymentInfo()
     * @see #getBooking()
     * @generated
     */
    EReference getBooking_PaymentInfo();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Booking#getPassenger <em>Passenger</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Passenger</em>'.
     * @see reservationsystem.Booking#getPassenger()
     * @see #getBooking()
     * @generated
     */
    EReference getBooking_Passenger();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Booking#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Specific Flight</em>'.
     * @see reservationsystem.Booking#getSpecificFlight()
     * @see #getBooking()
     * @generated
     */
    EReference getBooking_SpecificFlight();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Booking#getBookNo <em>Book No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Book No</em>'.
     * @see reservationsystem.Booking#getBookNo()
     * @see #getBooking()
     * @generated
     */
    EAttribute getBooking_BookNo();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Booking#getBookingStatus <em>Booking Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Booking Status</em>'.
     * @see reservationsystem.Booking#getBookingStatus()
     * @see #getBooking()
     * @generated
     */
    EAttribute getBooking_BookingStatus();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Booking#getSeats <em>Seats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Seats</em>'.
     * @see reservationsystem.Booking#getSeats()
     * @see #getBooking()
     * @generated
     */
    EReference getBooking_Seats();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Booking#getBaggageInfo <em>Baggage Info</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Baggage Info</em>'.
     * @see reservationsystem.Booking#getBaggageInfo()
     * @see #getBooking()
     * @generated
     */
    EAttribute getBooking_BaggageInfo();

    /**
     * Returns the meta object for class '{@link reservationsystem.GeneralFlight <em>General Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Flight</em>'.
     * @see reservationsystem.GeneralFlight
     * @generated
     */
    EClass getGeneralFlight();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.GeneralFlight#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Specific Flight</em>'.
     * @see reservationsystem.GeneralFlight#getSpecificFlight()
     * @see #getGeneralFlight()
     * @generated
     */
    EReference getGeneralFlight_SpecificFlight();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.GeneralFlight#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>From</em>'.
     * @see reservationsystem.GeneralFlight#getFrom()
     * @see #getGeneralFlight()
     * @generated
     */
    EReference getGeneralFlight_From();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.GeneralFlight#getFlightNo <em>Flight No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Flight No</em>'.
     * @see reservationsystem.GeneralFlight#getFlightNo()
     * @see #getGeneralFlight()
     * @generated
     */
    EAttribute getGeneralFlight_FlightNo();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.GeneralFlight#getDepartureTime <em>Departure Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Departure Time</em>'.
     * @see reservationsystem.GeneralFlight#getDepartureTime()
     * @see #getGeneralFlight()
     * @generated
     */
    EAttribute getGeneralFlight_DepartureTime();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.GeneralFlight#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>To</em>'.
     * @see reservationsystem.GeneralFlight#getTo()
     * @see #getGeneralFlight()
     * @generated
     */
    EReference getGeneralFlight_To();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.GeneralFlight#getArrivalTime <em>Arrival Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Arrival Time</em>'.
     * @see reservationsystem.GeneralFlight#getArrivalTime()
     * @see #getGeneralFlight()
     * @generated
     */
    EAttribute getGeneralFlight_ArrivalTime();

    /**
     * Returns the meta object for class '{@link reservationsystem.SpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Specific Flight</em>'.
     * @see reservationsystem.SpecificFlight
     * @generated
     */
    EClass getSpecificFlight();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.SpecificFlight#getGeneralFlight <em>General Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>General Flight</em>'.
     * @see reservationsystem.SpecificFlight#getGeneralFlight()
     * @see #getSpecificFlight()
     * @generated
     */
    EReference getSpecificFlight_GeneralFlight();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.SpecificFlight#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Plane</em>'.
     * @see reservationsystem.SpecificFlight#getPlane()
     * @see #getSpecificFlight()
     * @generated
     */
    EReference getSpecificFlight_Plane();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.SpecificFlight#getCrew <em>Crew</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Crew</em>'.
     * @see reservationsystem.SpecificFlight#getCrew()
     * @see #getSpecificFlight()
     * @generated
     */
    EReference getSpecificFlight_Crew();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.SpecificFlight#getBooking <em>Booking</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Booking</em>'.
     * @see reservationsystem.SpecificFlight#getBooking()
     * @see #getSpecificFlight()
     * @generated
     */
    EReference getSpecificFlight_Booking();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.SpecificFlight#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.SpecificFlight#getId()
     * @see #getSpecificFlight()
     * @generated
     */
    EAttribute getSpecificFlight_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.SpecificFlight#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see reservationsystem.SpecificFlight#getDate()
     * @see #getSpecificFlight()
     * @generated
     */
    EAttribute getSpecificFlight_Date();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.SpecificFlight#getRealDepTime <em>Real Dep Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Real Dep Time</em>'.
     * @see reservationsystem.SpecificFlight#getRealDepTime()
     * @see #getSpecificFlight()
     * @generated
     */
    EAttribute getSpecificFlight_RealDepTime();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.SpecificFlight#getRealArriTime <em>Real Arri Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Real Arri Time</em>'.
     * @see reservationsystem.SpecificFlight#getRealArriTime()
     * @see #getSpecificFlight()
     * @generated
     */
    EAttribute getSpecificFlight_RealArriTime();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.SpecificFlight#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status</em>'.
     * @see reservationsystem.SpecificFlight#getStatus()
     * @see #getSpecificFlight()
     * @generated
     */
    EAttribute getSpecificFlight_Status();

    /**
     * Returns the meta object for the '{@link reservationsystem.SpecificFlight#assignPilot(int) <em>Assign Pilot</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Assign Pilot</em>' operation.
     * @see reservationsystem.SpecificFlight#assignPilot(int)
     * @generated
     */
    EOperation getSpecificFlight__AssignPilot__int();

    /**
     * Returns the meta object for the '{@link reservationsystem.SpecificFlight#assignAttd(int) <em>Assign Attd</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Assign Attd</em>' operation.
     * @see reservationsystem.SpecificFlight#assignAttd(int)
     * @generated
     */
    EOperation getSpecificFlight__AssignAttd__int();

    /**
     * Returns the meta object for class '{@link reservationsystem.Plane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Plane</em>'.
     * @see reservationsystem.Plane
     * @generated
     */
    EClass getPlane();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Plane#getSpecificFlight <em>Specific Flight</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Specific Flight</em>'.
     * @see reservationsystem.Plane#getSpecificFlight()
     * @see #getPlane()
     * @generated
     */
    EReference getPlane_SpecificFlight();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Plane#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.Plane#getId()
     * @see #getPlane()
     * @generated
     */
    EAttribute getPlane_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Plane#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Model</em>'.
     * @see reservationsystem.Plane#getModel()
     * @see #getPlane()
     * @generated
     */
    EAttribute getPlane_Model();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Plane#getCrewNum <em>Crew Num</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Crew Num</em>'.
     * @see reservationsystem.Plane#getCrewNum()
     * @see #getPlane()
     * @generated
     */
    EAttribute getPlane_CrewNum();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Plane#getCapacity <em>Capacity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Capacity</em>'.
     * @see reservationsystem.Plane#getCapacity()
     * @see #getPlane()
     * @generated
     */
    EAttribute getPlane_Capacity();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.Plane#getSeats <em>Seats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Seats</em>'.
     * @see reservationsystem.Plane#getSeats()
     * @see #getPlane()
     * @generated
     */
    EReference getPlane_Seats();

    /**
     * Returns the meta object for class '{@link reservationsystem.Airport <em>Airport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Airport</em>'.
     * @see reservationsystem.Airport
     * @generated
     */
    EClass getAirport();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Airport#getCity <em>City</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>City</em>'.
     * @see reservationsystem.Airport#getCity()
     * @see #getAirport()
     * @generated
     */
    EReference getAirport_City();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Airport#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.Airport#getId()
     * @see #getAirport()
     * @generated
     */
    EAttribute getAirport_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Airport#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see reservationsystem.Airport#getName()
     * @see #getAirport()
     * @generated
     */
    EAttribute getAirport_Name();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Airport#getAbbr <em>Abbr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbr</em>'.
     * @see reservationsystem.Airport#getAbbr()
     * @see #getAirport()
     * @generated
     */
    EAttribute getAirport_Abbr();

    /**
     * Returns the meta object for class '{@link reservationsystem.City <em>City</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>City</em>'.
     * @see reservationsystem.City
     * @generated
     */
    EClass getCity();

    /**
     * Returns the meta object for the reference list '{@link reservationsystem.City#getAirport <em>Airport</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Airport</em>'.
     * @see reservationsystem.City#getAirport()
     * @see #getCity()
     * @generated
     */
    EReference getCity_Airport();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.City#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.City#getId()
     * @see #getCity()
     * @generated
     */
    EAttribute getCity_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.City#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see reservationsystem.City#getName()
     * @see #getCity()
     * @generated
     */
    EAttribute getCity_Name();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.City#getAbbr <em>Abbr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abbr</em>'.
     * @see reservationsystem.City#getAbbr()
     * @see #getCity()
     * @generated
     */
    EAttribute getCity_Abbr();

    /**
     * Returns the meta object for class '{@link reservationsystem.PaymentInfo <em>Payment Info</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Payment Info</em>'.
     * @see reservationsystem.PaymentInfo
     * @generated
     */
    EClass getPaymentInfo();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see reservationsystem.PaymentInfo#getId()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_Id();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getCreateTime <em>Create Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create Time</em>'.
     * @see reservationsystem.PaymentInfo#getCreateTime()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_CreateTime();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getStatus <em>Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Status</em>'.
     * @see reservationsystem.PaymentInfo#getStatus()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_Status();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getPayTime <em>Pay Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pay Time</em>'.
     * @see reservationsystem.PaymentInfo#getPayTime()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_PayTime();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see reservationsystem.PaymentInfo#getType()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_Type();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getCardNo <em>Card No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Card No</em>'.
     * @see reservationsystem.PaymentInfo#getCardNo()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_CardNo();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getCardOwner <em>Card Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Card Owner</em>'.
     * @see reservationsystem.PaymentInfo#getCardOwner()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_CardOwner();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.PaymentInfo#getCardAddr <em>Card Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Card Addr</em>'.
     * @see reservationsystem.PaymentInfo#getCardAddr()
     * @see #getPaymentInfo()
     * @generated
     */
    EAttribute getPaymentInfo_CardAddr();

    /**
     * Returns the meta object for class '{@link reservationsystem.Seat <em>Seat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Seat</em>'.
     * @see reservationsystem.Seat
     * @generated
     */
    EClass getSeat();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Seat#getNo <em>No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>No</em>'.
     * @see reservationsystem.Seat#getNo()
     * @see #getSeat()
     * @generated
     */
    EAttribute getSeat_No();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Seat#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see reservationsystem.Seat#getType()
     * @see #getSeat()
     * @generated
     */
    EAttribute getSeat_Type();

    /**
     * Returns the meta object for the attribute '{@link reservationsystem.Seat#isIsExit <em>Is Exit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Exit</em>'.
     * @see reservationsystem.Seat#isIsExit()
     * @see #getSeat()
     * @generated
     */
    EAttribute getSeat_IsExit();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Seat#getPlane <em>Plane</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Plane</em>'.
     * @see reservationsystem.Seat#getPlane()
     * @see #getSeat()
     * @generated
     */
    EReference getSeat_Plane();

    /**
     * Returns the meta object for the reference '{@link reservationsystem.Seat#getBook <em>Book</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Book</em>'.
     * @see reservationsystem.Seat#getBook()
     * @see #getSeat()
     * @generated
     */
    EReference getSeat_Book();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>User Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>User Type</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getUserType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ReservationsystemFactory getReservationsystemFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link reservationsystem.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.PersonImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

        /**
         * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__ADDR = eINSTANCE.getPerson_Addr();

        /**
         * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__PHONE = eINSTANCE.getPerson_Phone();

        /**
         * The meta object literal for the '<em><b>Citizenship</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__CITIZENSHIP = eINSTANCE.getPerson_Citizenship();

        /**
         * The meta object literal for the '<em><b>Residence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__RESIDENCE = eINSTANCE.getPerson_Residence();

        /**
         * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

        /**
         * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__FAMILY_NAME = eINSTANCE.getPerson_FamilyName();

        /**
         * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

        /**
         * The meta object literal for the '<em><b>Passport Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__PASSPORT_ID = eINSTANCE.getPerson_PassportId();

        /**
         * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

        /**
         * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.UserImpl <em>User</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.UserImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getUser()
         * @generated
         */
        EClass USER = eINSTANCE.getUser();

        /**
         * The meta object literal for the '<em><b>Belongs To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USER__BELONGS_TO = eINSTANCE.getUser_BelongsTo();

        /**
         * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER__USER_TYPE = eINSTANCE.getUser_UserType();

        /**
         * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

        /**
         * The meta object literal for the '<em><b>Md5 Pwd</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USER__MD5_PWD = eINSTANCE.getUser_Md5Pwd();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.CrewImpl <em>Crew</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.CrewImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getCrew()
         * @generated
         */
        EClass CREW = eINSTANCE.getCrew();

        /**
         * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CREW__LEADER = eINSTANCE.getCrew_Leader();

        /**
         * The meta object literal for the '<em><b>Specific Flight</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CREW__SPECIFIC_FLIGHT = eINSTANCE.getCrew_SpecificFlight();

        /**
         * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CREW__EMPLOYEE_ID = eINSTANCE.getCrew_EmployeeId();

        /**
         * The meta object literal for the '<em><b>Set Leader</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CREW___SET_LEADER = eINSTANCE.getCrew__SetLeader();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.PassengerImpl <em>Passenger</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.PassengerImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getPassenger()
         * @generated
         */
        EClass PASSENGER = eINSTANCE.getPassenger();

        /**
         * The meta object literal for the '<em><b>Passenger</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PASSENGER__PASSENGER = eINSTANCE.getPassenger_Passenger();

        /**
         * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PASSENGER__BOOKING = eINSTANCE.getPassenger_Booking();

        /**
         * The meta object literal for the '<em><b>Special Needs</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PASSENGER__SPECIAL_NEEDS = eINSTANCE.getPassenger_SpecialNeeds();

        /**
         * The meta object literal for the '<em><b>Food Pref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PASSENGER__FOOD_PREF = eINSTANCE.getPassenger_FoodPref();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.PilotImpl <em>Pilot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.PilotImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getPilot()
         * @generated
         */
        EClass PILOT = eINSTANCE.getPilot();

        /**
         * The meta object literal for the '<em><b>Certification Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PILOT__CERTIFICATION_ID = eINSTANCE.getPilot_CertificationId();

        /**
         * The meta object literal for the '<em><b>Experience</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PILOT__EXPERIENCE = eINSTANCE.getPilot_Experience();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.AttendantImpl <em>Attendant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.AttendantImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getAttendant()
         * @generated
         */
        EClass ATTENDANT = eINSTANCE.getAttendant();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.BookingImpl <em>Booking</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.BookingImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getBooking()
         * @generated
         */
        EClass BOOKING = eINSTANCE.getBooking();

        /**
         * The meta object literal for the '<em><b>Payment Info</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOOKING__PAYMENT_INFO = eINSTANCE.getBooking_PaymentInfo();

        /**
         * The meta object literal for the '<em><b>Passenger</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOOKING__PASSENGER = eINSTANCE.getBooking_Passenger();

        /**
         * The meta object literal for the '<em><b>Specific Flight</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOOKING__SPECIFIC_FLIGHT = eINSTANCE.getBooking_SpecificFlight();

        /**
         * The meta object literal for the '<em><b>Book No</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKING__BOOK_NO = eINSTANCE.getBooking_BookNo();

        /**
         * The meta object literal for the '<em><b>Booking Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKING__BOOKING_STATUS = eINSTANCE.getBooking_BookingStatus();

        /**
         * The meta object literal for the '<em><b>Seats</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BOOKING__SEATS = eINSTANCE.getBooking_Seats();

        /**
         * The meta object literal for the '<em><b>Baggage Info</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOOKING__BAGGAGE_INFO = eINSTANCE.getBooking_BaggageInfo();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.GeneralFlightImpl <em>General Flight</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.GeneralFlightImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getGeneralFlight()
         * @generated
         */
        EClass GENERAL_FLIGHT = eINSTANCE.getGeneralFlight();

        /**
         * The meta object literal for the '<em><b>Specific Flight</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERAL_FLIGHT__SPECIFIC_FLIGHT = eINSTANCE.getGeneralFlight_SpecificFlight();

        /**
         * The meta object literal for the '<em><b>From</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERAL_FLIGHT__FROM = eINSTANCE.getGeneralFlight_From();

        /**
         * The meta object literal for the '<em><b>Flight No</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_FLIGHT__FLIGHT_NO = eINSTANCE.getGeneralFlight_FlightNo();

        /**
         * The meta object literal for the '<em><b>Departure Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_FLIGHT__DEPARTURE_TIME = eINSTANCE.getGeneralFlight_DepartureTime();

        /**
         * The meta object literal for the '<em><b>To</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GENERAL_FLIGHT__TO = eINSTANCE.getGeneralFlight_To();

        /**
         * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERAL_FLIGHT__ARRIVAL_TIME = eINSTANCE.getGeneralFlight_ArrivalTime();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.SpecificFlightImpl <em>Specific Flight</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.SpecificFlightImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getSpecificFlight()
         * @generated
         */
        EClass SPECIFIC_FLIGHT = eINSTANCE.getSpecificFlight();

        /**
         * The meta object literal for the '<em><b>General Flight</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPECIFIC_FLIGHT__GENERAL_FLIGHT = eINSTANCE.getSpecificFlight_GeneralFlight();

        /**
         * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPECIFIC_FLIGHT__PLANE = eINSTANCE.getSpecificFlight_Plane();

        /**
         * The meta object literal for the '<em><b>Crew</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPECIFIC_FLIGHT__CREW = eINSTANCE.getSpecificFlight_Crew();

        /**
         * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SPECIFIC_FLIGHT__BOOKING = eINSTANCE.getSpecificFlight_Booking();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFIC_FLIGHT__ID = eINSTANCE.getSpecificFlight_Id();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFIC_FLIGHT__DATE = eINSTANCE.getSpecificFlight_Date();

        /**
         * The meta object literal for the '<em><b>Real Dep Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFIC_FLIGHT__REAL_DEP_TIME = eINSTANCE.getSpecificFlight_RealDepTime();

        /**
         * The meta object literal for the '<em><b>Real Arri Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFIC_FLIGHT__REAL_ARRI_TIME = eINSTANCE.getSpecificFlight_RealArriTime();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SPECIFIC_FLIGHT__STATUS = eINSTANCE.getSpecificFlight_Status();

        /**
         * The meta object literal for the '<em><b>Assign Pilot</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SPECIFIC_FLIGHT___ASSIGN_PILOT__INT = eINSTANCE.getSpecificFlight__AssignPilot__int();

        /**
         * The meta object literal for the '<em><b>Assign Attd</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SPECIFIC_FLIGHT___ASSIGN_ATTD__INT = eINSTANCE.getSpecificFlight__AssignAttd__int();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.PlaneImpl <em>Plane</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.PlaneImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getPlane()
         * @generated
         */
        EClass PLANE = eINSTANCE.getPlane();

        /**
         * The meta object literal for the '<em><b>Specific Flight</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLANE__SPECIFIC_FLIGHT = eINSTANCE.getPlane_SpecificFlight();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLANE__ID = eINSTANCE.getPlane_Id();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLANE__MODEL = eINSTANCE.getPlane_Model();

        /**
         * The meta object literal for the '<em><b>Crew Num</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLANE__CREW_NUM = eINSTANCE.getPlane_CrewNum();

        /**
         * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLANE__CAPACITY = eINSTANCE.getPlane_Capacity();

        /**
         * The meta object literal for the '<em><b>Seats</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLANE__SEATS = eINSTANCE.getPlane_Seats();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.AirportImpl <em>Airport</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.AirportImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getAirport()
         * @generated
         */
        EClass AIRPORT = eINSTANCE.getAirport();

        /**
         * The meta object literal for the '<em><b>City</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AIRPORT__CITY = eINSTANCE.getAirport_City();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AIRPORT__ID = eINSTANCE.getAirport_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AIRPORT__NAME = eINSTANCE.getAirport_Name();

        /**
         * The meta object literal for the '<em><b>Abbr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute AIRPORT__ABBR = eINSTANCE.getAirport_Abbr();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.CityImpl <em>City</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.CityImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getCity()
         * @generated
         */
        EClass CITY = eINSTANCE.getCity();

        /**
         * The meta object literal for the '<em><b>Airport</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CITY__AIRPORT = eINSTANCE.getCity_Airport();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CITY__ID = eINSTANCE.getCity_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CITY__NAME = eINSTANCE.getCity_Name();

        /**
         * The meta object literal for the '<em><b>Abbr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CITY__ABBR = eINSTANCE.getCity_Abbr();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.PaymentInfoImpl <em>Payment Info</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.PaymentInfoImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getPaymentInfo()
         * @generated
         */
        EClass PAYMENT_INFO = eINSTANCE.getPaymentInfo();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__ID = eINSTANCE.getPaymentInfo_Id();

        /**
         * The meta object literal for the '<em><b>Create Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__CREATE_TIME = eINSTANCE.getPaymentInfo_CreateTime();

        /**
         * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__STATUS = eINSTANCE.getPaymentInfo_Status();

        /**
         * The meta object literal for the '<em><b>Pay Time</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__PAY_TIME = eINSTANCE.getPaymentInfo_PayTime();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__TYPE = eINSTANCE.getPaymentInfo_Type();

        /**
         * The meta object literal for the '<em><b>Card No</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__CARD_NO = eINSTANCE.getPaymentInfo_CardNo();

        /**
         * The meta object literal for the '<em><b>Card Owner</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__CARD_OWNER = eINSTANCE.getPaymentInfo_CardOwner();

        /**
         * The meta object literal for the '<em><b>Card Addr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PAYMENT_INFO__CARD_ADDR = eINSTANCE.getPaymentInfo_CardAddr();

        /**
         * The meta object literal for the '{@link reservationsystem.impl.SeatImpl <em>Seat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see reservationsystem.impl.SeatImpl
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getSeat()
         * @generated
         */
        EClass SEAT = eINSTANCE.getSeat();

        /**
         * The meta object literal for the '<em><b>No</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEAT__NO = eINSTANCE.getSeat_No();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEAT__TYPE = eINSTANCE.getSeat_Type();

        /**
         * The meta object literal for the '<em><b>Is Exit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEAT__IS_EXIT = eINSTANCE.getSeat_IsExit();

        /**
         * The meta object literal for the '<em><b>Plane</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEAT__PLANE = eINSTANCE.getSeat_Plane();

        /**
         * The meta object literal for the '<em><b>Book</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SEAT__BOOK = eINSTANCE.getSeat_Book();

        /**
         * The meta object literal for the '<em>User Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see reservationsystem.impl.ReservationsystemPackageImpl#getUserType()
         * @generated
         */
        EDataType USER_TYPE = eINSTANCE.getUserType();

    }

} //ReservationsystemPackage
