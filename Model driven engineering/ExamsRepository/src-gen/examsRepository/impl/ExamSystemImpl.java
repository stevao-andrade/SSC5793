/**
 */
package examsRepository.impl;

import examsRepository.Exam;
import examsRepository.ExamSystem;
import examsRepository.ExamsRepositoryPackage;
import examsRepository.Repository;

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
 * An implementation of the model object '<em><b>Exam System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.impl.ExamSystemImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link examsRepository.impl.ExamSystemImpl#getExam <em>Exam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamSystemImpl extends MinimalEObjectImpl.Container implements ExamSystem {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> exam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamsRepositoryPackage.Literals.EXAM_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY, oldRepository, newRepository);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY,
					newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getExam() {
		if (exam == null) {
			exam = new EObjectContainmentEList<Exam>(Exam.class, this, ExamsRepositoryPackage.EXAM_SYSTEM__EXAM);
		}
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY:
			return basicSetRepository(null, msgs);
		case ExamsRepositoryPackage.EXAM_SYSTEM__EXAM:
			return ((InternalEList<?>) getExam()).basicRemove(otherEnd, msgs);
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
		case ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY:
			return getRepository();
		case ExamsRepositoryPackage.EXAM_SYSTEM__EXAM:
			return getExam();
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
		case ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY:
			setRepository((Repository) newValue);
			return;
		case ExamsRepositoryPackage.EXAM_SYSTEM__EXAM:
			getExam().clear();
			getExam().addAll((Collection<? extends Exam>) newValue);
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
		case ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY:
			setRepository((Repository) null);
			return;
		case ExamsRepositoryPackage.EXAM_SYSTEM__EXAM:
			getExam().clear();
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
		case ExamsRepositoryPackage.EXAM_SYSTEM__REPOSITORY:
			return repository != null;
		case ExamsRepositoryPackage.EXAM_SYSTEM__EXAM:
			return exam != null && !exam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExamSystemImpl
