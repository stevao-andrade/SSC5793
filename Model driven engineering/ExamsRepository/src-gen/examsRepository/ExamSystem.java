/**
 */
package examsRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.ExamSystem#getRepository <em>Repository</em>}</li>
 *   <li>{@link examsRepository.ExamSystem#getExam <em>Exam</em>}</li>
 * </ul>
 *
 * @see examsRepository.ExamsRepositoryPackage#getExamSystem()
 * @model
 * @generated
 */
public interface ExamSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see examsRepository.ExamsRepositoryPackage#getExamSystem_Repository()
	 * @model containment="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link examsRepository.ExamSystem#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference list.
	 * The list contents are of type {@link examsRepository.Exam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference list.
	 * @see examsRepository.ExamsRepositoryPackage#getExamSystem_Exam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam> getExam();

} // ExamSystem
