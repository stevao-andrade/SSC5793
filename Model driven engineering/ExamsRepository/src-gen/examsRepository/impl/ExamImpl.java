/**
 */
package examsRepository.impl;

import examsRepository.Exam;
import examsRepository.ExamsRepositoryPackage;

import examsRepository.Question;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.impl.ExamImpl#getId <em>Id</em>}</li>
 *   <li>{@link examsRepository.impl.ExamImpl#getName <em>Name</em>}</li>
 *   <li>{@link examsRepository.impl.ExamImpl#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link examsRepository.impl.ExamImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends MinimalEObjectImpl.Container implements Exam {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected float totalValue = TOTAL_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamsRepositoryPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.EXAM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.EXAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalValue() {
		return totalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalValue(float newTotalValue) {
		float oldTotalValue = totalValue;
		totalValue = newTotalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.EXAM__TOTAL_VALUE,
					oldTotalValue, totalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this,
					ExamsRepositoryPackage.EXAM__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExamsRepositoryPackage.EXAM__QUESTION:
			return ((InternalEList<?>) getQuestion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExamsRepositoryPackage.EXAM__ID:
			return getId();
		case ExamsRepositoryPackage.EXAM__NAME:
			return getName();
		case ExamsRepositoryPackage.EXAM__TOTAL_VALUE:
			return getTotalValue();
		case ExamsRepositoryPackage.EXAM__QUESTION:
			return getQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExamsRepositoryPackage.EXAM__ID:
			setId((Integer) newValue);
			return;
		case ExamsRepositoryPackage.EXAM__NAME:
			setName((String) newValue);
			return;
		case ExamsRepositoryPackage.EXAM__TOTAL_VALUE:
			setTotalValue((Float) newValue);
			return;
		case ExamsRepositoryPackage.EXAM__QUESTION:
			getQuestion().clear();
			getQuestion().addAll((Collection<? extends Question>) newValue);
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
		case ExamsRepositoryPackage.EXAM__ID:
			setId(ID_EDEFAULT);
			return;
		case ExamsRepositoryPackage.EXAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ExamsRepositoryPackage.EXAM__TOTAL_VALUE:
			setTotalValue(TOTAL_VALUE_EDEFAULT);
			return;
		case ExamsRepositoryPackage.EXAM__QUESTION:
			getQuestion().clear();
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
		case ExamsRepositoryPackage.EXAM__ID:
			return id != ID_EDEFAULT;
		case ExamsRepositoryPackage.EXAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ExamsRepositoryPackage.EXAM__TOTAL_VALUE:
			return totalValue != TOTAL_VALUE_EDEFAULT;
		case ExamsRepositoryPackage.EXAM__QUESTION:
			return question != null && !question.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(", totalValue: ");
		result.append(totalValue);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
