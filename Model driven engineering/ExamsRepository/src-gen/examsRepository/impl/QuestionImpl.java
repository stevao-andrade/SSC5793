/**
 */
package examsRepository.impl;

import examsRepository.Alternative;
import examsRepository.ExamsRepositoryPackage;
import examsRepository.Question;
import examsRepository.Theme;

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
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link examsRepository.impl.QuestionImpl#getId <em>Id</em>}</li>
 *   <li>{@link examsRepository.impl.QuestionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link examsRepository.impl.QuestionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link examsRepository.impl.QuestionImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link examsRepository.impl.QuestionImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
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
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final Theme THEME_EDEFAULT = Theme.OTHER;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected Theme theme = THEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> alternative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamsRepositoryPackage.Literals.QUESTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.QUESTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.QUESTION__STATEMENT,
					oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.QUESTION__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		Theme oldTheme = theme;
		theme = newTheme == null ? THEME_EDEFAULT : newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamsRepositoryPackage.QUESTION__THEME, oldTheme,
					theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alternative> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<Alternative>(Alternative.class, this,
					ExamsRepositoryPackage.QUESTION__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExamsRepositoryPackage.QUESTION__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
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
		case ExamsRepositoryPackage.QUESTION__ID:
			return getId();
		case ExamsRepositoryPackage.QUESTION__STATEMENT:
			return getStatement();
		case ExamsRepositoryPackage.QUESTION__VALUE:
			return getValue();
		case ExamsRepositoryPackage.QUESTION__THEME:
			return getTheme();
		case ExamsRepositoryPackage.QUESTION__ALTERNATIVE:
			return getAlternative();
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
		case ExamsRepositoryPackage.QUESTION__ID:
			setId((Integer) newValue);
			return;
		case ExamsRepositoryPackage.QUESTION__STATEMENT:
			setStatement((String) newValue);
			return;
		case ExamsRepositoryPackage.QUESTION__VALUE:
			setValue((Float) newValue);
			return;
		case ExamsRepositoryPackage.QUESTION__THEME:
			setTheme((Theme) newValue);
			return;
		case ExamsRepositoryPackage.QUESTION__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends Alternative>) newValue);
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
		case ExamsRepositoryPackage.QUESTION__ID:
			setId(ID_EDEFAULT);
			return;
		case ExamsRepositoryPackage.QUESTION__STATEMENT:
			setStatement(STATEMENT_EDEFAULT);
			return;
		case ExamsRepositoryPackage.QUESTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ExamsRepositoryPackage.QUESTION__THEME:
			setTheme(THEME_EDEFAULT);
			return;
		case ExamsRepositoryPackage.QUESTION__ALTERNATIVE:
			getAlternative().clear();
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
		case ExamsRepositoryPackage.QUESTION__ID:
			return id != ID_EDEFAULT;
		case ExamsRepositoryPackage.QUESTION__STATEMENT:
			return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
		case ExamsRepositoryPackage.QUESTION__VALUE:
			return value != VALUE_EDEFAULT;
		case ExamsRepositoryPackage.QUESTION__THEME:
			return theme != THEME_EDEFAULT;
		case ExamsRepositoryPackage.QUESTION__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
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
		result.append(", statement: ");
		result.append(statement);
		result.append(", value: ");
		result.append(value);
		result.append(", theme: ");
		result.append(theme);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
