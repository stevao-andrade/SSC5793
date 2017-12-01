/**
 */
package examsRepository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Theme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see examsRepository.ExamsRepositoryPackage#getTheme()
 * @model
 * @generated
 */
public enum Theme implements Enumerator {
	/**
	 * The '<em><b>Software Patterns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_PATTERNS_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_PATTERNS(0, "softwarePatterns", "Software Patterns"),

	/**
	 * The '<em><b>Frameworks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORKS_VALUE
	 * @generated
	 * @ordered
	 */
	FRAMEWORKS(1, "frameworks", "Frameworks"),

	/**
	 * The '<em><b>Software Components</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_COMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_COMPONENTS(2, "softwareComponents", "Software Components"),

	/**
	 * The '<em><b>Software Product Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_PRODUCT_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_PRODUCT_LINE(3, "softwareProductLine", "Software Product Line"),

	/**
	 * The '<em><b>SOA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOA_VALUE
	 * @generated
	 * @ordered
	 */
	SOA(4, "SOA", "Serviceoriented Architecture"),

	/**
	 * The '<em><b>So S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SO_S_VALUE
	 * @generated
	 * @ordered
	 */
	SO_S(5, "SoS", "Systems of Systems"),

	/**
	 * The '<em><b>MDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MDE_VALUE
	 * @generated
	 * @ordered
	 */
	MDE(6, "MDE", "Model driven Engineering"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "other");

	/**
	 * The '<em><b>Software Patterns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Patterns</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_PATTERNS
	 * @model name="softwarePatterns" literal="Software Patterns"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_PATTERNS_VALUE = 0;

	/**
	 * The '<em><b>Frameworks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frameworks</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAMEWORKS
	 * @model name="frameworks" literal="Frameworks"
	 * @generated
	 * @ordered
	 */
	public static final int FRAMEWORKS_VALUE = 1;

	/**
	 * The '<em><b>Software Components</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Components</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_COMPONENTS
	 * @model name="softwareComponents" literal="Software Components"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_COMPONENTS_VALUE = 2;

	/**
	 * The '<em><b>Software Product Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Product Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_PRODUCT_LINE
	 * @model name="softwareProductLine" literal="Software Product Line"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_PRODUCT_LINE_VALUE = 3;

	/**
	 * The '<em><b>SOA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOA
	 * @model literal="Serviceoriented Architecture"
	 * @generated
	 * @ordered
	 */
	public static final int SOA_VALUE = 4;

	/**
	 * The '<em><b>So S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>So S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SO_S
	 * @model name="SoS" literal="Systems of Systems"
	 * @generated
	 * @ordered
	 */
	public static final int SO_S_VALUE = 5;

	/**
	 * The '<em><b>MDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MDE
	 * @model literal="Model driven Engineering"
	 * @generated
	 * @ordered
	 */
	public static final int MDE_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Theme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Theme[] VALUES_ARRAY = new Theme[] { SOFTWARE_PATTERNS, FRAMEWORKS, SOFTWARE_COMPONENTS,
			SOFTWARE_PRODUCT_LINE, SOA, SO_S, MDE, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Theme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Theme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Theme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Theme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Theme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Theme get(int value) {
		switch (value) {
		case SOFTWARE_PATTERNS_VALUE:
			return SOFTWARE_PATTERNS;
		case FRAMEWORKS_VALUE:
			return FRAMEWORKS;
		case SOFTWARE_COMPONENTS_VALUE:
			return SOFTWARE_COMPONENTS;
		case SOFTWARE_PRODUCT_LINE_VALUE:
			return SOFTWARE_PRODUCT_LINE;
		case SOA_VALUE:
			return SOA;
		case SO_S_VALUE:
			return SO_S;
		case MDE_VALUE:
			return MDE;
		case OTHER_VALUE:
			return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Theme(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Theme
