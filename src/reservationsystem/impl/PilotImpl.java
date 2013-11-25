/**
 */
package reservationsystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import reservationsystem.Pilot;
import reservationsystem.ReservationsystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pilot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link reservationsystem.impl.PilotImpl#getCertificationId <em>Certification Id</em>}</li>
 *   <li>{@link reservationsystem.impl.PilotImpl#getExperience <em>Experience</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PilotImpl extends CrewImpl implements Pilot {
    /**
     * The default value of the '{@link #getCertificationId() <em>Certification Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificationId()
     * @generated
     * @ordered
     */
    protected static final String CERTIFICATION_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCertificationId() <em>Certification Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCertificationId()
     * @generated
     * @ordered
     */
    protected String certificationId = CERTIFICATION_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getExperience() <em>Experience</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExperience()
     * @generated
     * @ordered
     */
    protected static final int EXPERIENCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getExperience() <em>Experience</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExperience()
     * @generated
     * @ordered
     */
    protected int experience = EXPERIENCE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PilotImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ReservationsystemPackage.Literals.PILOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCertificationId() {
        return certificationId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCertificationId(String newCertificationId) {
        String oldCertificationId = certificationId;
        certificationId = newCertificationId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PILOT__CERTIFICATION_ID, oldCertificationId, certificationId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getExperience() {
        return experience;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExperience(int newExperience) {
        int oldExperience = experience;
        experience = newExperience;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ReservationsystemPackage.PILOT__EXPERIENCE, oldExperience, experience));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ReservationsystemPackage.PILOT__CERTIFICATION_ID:
                return getCertificationId();
            case ReservationsystemPackage.PILOT__EXPERIENCE:
                return getExperience();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ReservationsystemPackage.PILOT__CERTIFICATION_ID:
                setCertificationId((String)newValue);
                return;
            case ReservationsystemPackage.PILOT__EXPERIENCE:
                setExperience((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.PILOT__CERTIFICATION_ID:
                setCertificationId(CERTIFICATION_ID_EDEFAULT);
                return;
            case ReservationsystemPackage.PILOT__EXPERIENCE:
                setExperience(EXPERIENCE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ReservationsystemPackage.PILOT__CERTIFICATION_ID:
                return CERTIFICATION_ID_EDEFAULT == null ? certificationId != null : !CERTIFICATION_ID_EDEFAULT.equals(certificationId);
            case ReservationsystemPackage.PILOT__EXPERIENCE:
                return experience != EXPERIENCE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (certificationId: ");
        result.append(certificationId);
        result.append(", experience: ");
        result.append(experience);
        result.append(')');
        return result.toString();
    }

} //PilotImpl
