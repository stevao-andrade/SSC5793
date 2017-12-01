/**
 */
package examsRepository.impl;

import examsRepository.Alternative;
import examsRepository.ExamsRepositoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.impl.AlternativeImpl#getId <em>Id</em>}</li>
 *   <li>{@link examsRepository.impl.AlternativeImpl#getAlternativeStatement <em>Alternative Statement</em>}</li>
 *   <li>{@link examsRepository.impl.AlternativeImpl#isCorrect <em>Correct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeImpl extends MinimalEObjectImpl.Container implements Alternative {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final char ID_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected char id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternativeStatement() <em>Alternative Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeStatement() <em>Alternative Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeStatement()
	 * @generated
	 * @ordered
	 */
	protected String alternativeStatement = ALTERNATIVE_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCorrect() <em>Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CORRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCorrect() <em>Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrect()
	 * @generated
	 * @ordered
	 */
	protected boolean correct = CORRECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamsRepositoryPackage.Literals.ALTERNATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(char newId) {
		char oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.ALTERNATIVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeStatement() {
		return alternativeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeStatement(String newAlternativeStatement) {
		String oldAlternativeStatement = alternativeStatement;
		alternativeStatement = newAlternativeStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExamsRepositoryPackage.ALTERNATIVE__ALTERNATIVE_STATEMENT, oldAlternativeStatement,
					alternativeStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCorrect() {
		return correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrect(boolean newCorrect) {
		boolean oldCorrect = correct;
		correct = newCorrect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.ALTERNATIVE__CORRECT,
					oldCorrect, correct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExamsRepositoryPackage.ALTERNATIVE__ID:
			return getId();
		case ExamsRepositoryPackage.ALTERNATIVE__ALTERNATIVE_STATEMENT:
			return getAlternativeStatement();
		case ExamsRepositoryPackage.ALTERNATIVE__CORRECT:
			return isCorrect();
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
		case ExamsRepositoryPackage.ALTERNATIVE__ID:
			setId((Character) newValue);
			return;
		case ExamsRepositoryPackage.ALTERNATIVE__ALTERNATIVE_STATEMENT:
			setAlternativeStatement((String) newValue);
			return;
		case ExamsRepositoryPackage.ALTERNATIVE__CORRECT:
			setCorrect((Boolean) newValue);
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
		case ExamsRepositoryPackage.ALTERNATIVE__ID:
			setId(ID_EDEFAULT);
			return;
		case ExamsRepositoryPackage.ALTERNATIVE__ALTERNATIVE_STATEMENT:
			setAlternativeStatement(ALTERNATIVE_STATEMENT_EDEFAULT);
			return;
		case ExamsRepositoryPackage.ALTERNATIVE__CORRECT:
			setCorrect(CORRECT_EDEFAULT);
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
		case ExamsRepositoryPackage.ALTERNATIVE__ID:
			return id != ID_EDEFAULT;
		case ExamsRepositoryPackage.ALTERNATIVE__ALTERNATIVE_STATEMENT:
			return ALTERNATIVE_STATEMENT_EDEFAULT == null ? alternativeStatement != null
					: !ALTERNATIVE_STATEMENT_EDEFAULT.equals(alternativeStatement);
		case ExamsRepositoryPackage.ALTERNATIVE__CORRECT:
			return correct != CORRECT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", alternativeStatement: ");
		result.append(alternativeStatement);
		result.append(", correct: ");
		result.append(correct);
		result.append(')');
		return result.toString();
	}

} //AlternativeImpl
