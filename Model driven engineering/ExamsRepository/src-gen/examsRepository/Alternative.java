/**
 */
package examsRepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.Alternative#getId <em>Id</em>}</li>
 *   <li>{@link examsRepository.Alternative#getAlternativeStatement <em>Alternative Statement</em>}</li>
 *   <li>{@link examsRepository.Alternative#isCorrect <em>Correct</em>}</li>
 * </ul>
 *
 * @see examsRepository.ExamsRepositoryPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(char)
	 * @see examsRepository.ExamsRepositoryPackage#getAlternative_Id()
	 * @model
	 * @generated
	 */
	char getId();

	/**
	 * Sets the value of the '{@link examsRepository.Alternative#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(char value);

	/**
	 * Returns the value of the '<em><b>Alternative Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Statement</em>' attribute.
	 * @see #setAlternativeStatement(String)
	 * @see examsRepository.ExamsRepositoryPackage#getAlternative_AlternativeStatement()
	 * @model
	 * @generated
	 */
	String getAlternativeStatement();

	/**
	 * Sets the value of the '{@link examsRepository.Alternative#getAlternativeStatement <em>Alternative Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Statement</em>' attribute.
	 * @see #getAlternativeStatement()
	 * @generated
	 */
	void setAlternativeStatement(String value);

	/**
	 * Returns the value of the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct</em>' attribute.
	 * @see #setCorrect(boolean)
	 * @see examsRepository.ExamsRepositoryPackage#getAlternative_Correct()
	 * @model
	 * @generated
	 */
	boolean isCorrect();

	/**
	 * Sets the value of the '{@link examsRepository.Alternative#isCorrect <em>Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct</em>' attribute.
	 * @see #isCorrect()
	 * @generated
	 */
	void setCorrect(boolean value);

} // Alternative
