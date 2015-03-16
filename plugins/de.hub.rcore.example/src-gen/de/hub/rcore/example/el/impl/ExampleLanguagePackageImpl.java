/**
 */
package de.hub.rcore.example.el.impl;

import de.hub.rcore.example.el.ELAccess;
import de.hub.rcore.example.el.ELAssignment;
import de.hub.rcore.example.el.ELBlock;
import de.hub.rcore.example.el.ELBlockStarementKind;
import de.hub.rcore.example.el.ELBlockStatement;
import de.hub.rcore.example.el.ELCall;
import de.hub.rcore.example.el.ELClass;
import de.hub.rcore.example.el.ELDataType;
import de.hub.rcore.example.el.ELExpression;
import de.hub.rcore.example.el.ELField;
import de.hub.rcore.example.el.ELLiteral;
import de.hub.rcore.example.el.ELMethod;
import de.hub.rcore.example.el.ELModel;
import de.hub.rcore.example.el.ELNamedElement;
import de.hub.rcore.example.el.ELOp;
import de.hub.rcore.example.el.ELOpCall;
import de.hub.rcore.example.el.ELOpKind;
import de.hub.rcore.example.el.ELPackage;
import de.hub.rcore.example.el.ELStatement;
import de.hub.rcore.example.el.ELTypedElement;
import de.hub.rcore.example.el.ELVariable;
import de.hub.rcore.example.el.ExampleLanguageFactory;
import de.hub.rcore.example.el.ExampleLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExampleLanguagePackageImpl extends EPackageImpl implements ExampleLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elOpCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elBlockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elBlockStarementKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elOpKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hub.rcore.example.el.ExampleLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExampleLanguagePackageImpl() {
		super(eNS_URI, ExampleLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExampleLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExampleLanguagePackage init() {
		if (isInited) return (ExampleLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ExampleLanguagePackage.eNS_URI);

		// Obtain or create and register package
		ExampleLanguagePackageImpl theExampleLanguagePackage = (ExampleLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExampleLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExampleLanguagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExampleLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theExampleLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExampleLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExampleLanguagePackage.eNS_URI, theExampleLanguagePackage);
		return theExampleLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELPackage() {
		return elPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELPackage_Classes() {
		return (EReference)elPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELClass() {
		return elClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELClass_Methods() {
		return (EReference)elClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELClass_Fields() {
		return (EReference)elClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELClass_SuperClases() {
		return (EReference)elClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELClass_InnerClasses() {
		return (EReference)elClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELVariable() {
		return elVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELMethod() {
		return elMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELMethod_Parameters() {
		return (EReference)elMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELMethod_LocalVariables() {
		return (EReference)elMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELMethod_Block() {
		return (EReference)elMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELField() {
		return elFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELStatement() {
		return elStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELBlock() {
		return elBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELBlock_Statements() {
		return (EReference)elBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELExpression() {
		return elExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELLiteral() {
		return elLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELLiteral_Value() {
		return (EAttribute)elLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELOpCall() {
		return elOpCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELOpCall_Kind() {
		return (EReference)elOpCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELCall() {
		return elCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELCall_Arguments() {
		return (EReference)elCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELCall_Callee() {
		return (EReference)elCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELCall_ThisArgument() {
		return (EReference)elCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELAccess() {
		return elAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELAccess_Variable() {
		return (EReference)elAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELBlockStatement() {
		return elBlockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELBlockStatement_Block() {
		return (EReference)elBlockStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELBlockStatement_Kind() {
		return (EReference)elBlockStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELBlockStatement_Expressions() {
		return (EReference)elBlockStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELOp() {
		return elOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELOp_Kind() {
		return (EAttribute)elOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELOp_Syntax() {
		return (EAttribute)elOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELOp_Operands() {
		return (EAttribute)elOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELOp_Precedence() {
		return (EAttribute)elOpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELDataType() {
		return elDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELNamedElement() {
		return elNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELNamedElement_Name() {
		return (EAttribute)elNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELTypedElement() {
		return elTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELTypedElement_Type() {
		return (EReference)elTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELTypedElement_Array() {
		return (EAttribute)elTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELBlockStarementKind() {
		return elBlockStarementKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELBlockStarementKind_Syntax() {
		return (EAttribute)elBlockStarementKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELBlockStarementKind_Blocks() {
		return (EAttribute)elBlockStarementKindEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELBlockStarementKind_Expressions() {
		return (EAttribute)elBlockStarementKindEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELModel() {
		return elModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELModel_Packages() {
		return (EReference)elModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELModel_Ops() {
		return (EReference)elModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELModel_Blocks() {
		return (EReference)elModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELAssignment() {
		return elAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELAssignment_Expr() {
		return (EReference)elAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getELAssignment_Assignee() {
		return (EReference)elAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getELOpKind() {
		return elOpKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleLanguageFactory getExampleLanguageFactory() {
		return (ExampleLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elPackageEClass = createEClass(EL_PACKAGE);
		createEReference(elPackageEClass, EL_PACKAGE__CLASSES);

		elClassEClass = createEClass(EL_CLASS);
		createEReference(elClassEClass, EL_CLASS__METHODS);
		createEReference(elClassEClass, EL_CLASS__FIELDS);
		createEReference(elClassEClass, EL_CLASS__SUPER_CLASES);
		createEReference(elClassEClass, EL_CLASS__INNER_CLASSES);

		elVariableEClass = createEClass(EL_VARIABLE);

		elMethodEClass = createEClass(EL_METHOD);
		createEReference(elMethodEClass, EL_METHOD__PARAMETERS);
		createEReference(elMethodEClass, EL_METHOD__LOCAL_VARIABLES);
		createEReference(elMethodEClass, EL_METHOD__BLOCK);

		elFieldEClass = createEClass(EL_FIELD);

		elStatementEClass = createEClass(EL_STATEMENT);

		elBlockEClass = createEClass(EL_BLOCK);
		createEReference(elBlockEClass, EL_BLOCK__STATEMENTS);

		elExpressionEClass = createEClass(EL_EXPRESSION);

		elLiteralEClass = createEClass(EL_LITERAL);
		createEAttribute(elLiteralEClass, EL_LITERAL__VALUE);

		elOpCallEClass = createEClass(EL_OP_CALL);
		createEReference(elOpCallEClass, EL_OP_CALL__KIND);

		elCallEClass = createEClass(EL_CALL);
		createEReference(elCallEClass, EL_CALL__ARGUMENTS);
		createEReference(elCallEClass, EL_CALL__CALLEE);
		createEReference(elCallEClass, EL_CALL__THIS_ARGUMENT);

		elAccessEClass = createEClass(EL_ACCESS);
		createEReference(elAccessEClass, EL_ACCESS__VARIABLE);

		elBlockStatementEClass = createEClass(EL_BLOCK_STATEMENT);
		createEReference(elBlockStatementEClass, EL_BLOCK_STATEMENT__BLOCK);
		createEReference(elBlockStatementEClass, EL_BLOCK_STATEMENT__KIND);
		createEReference(elBlockStatementEClass, EL_BLOCK_STATEMENT__EXPRESSIONS);

		elOpEClass = createEClass(EL_OP);
		createEAttribute(elOpEClass, EL_OP__KIND);
		createEAttribute(elOpEClass, EL_OP__SYNTAX);
		createEAttribute(elOpEClass, EL_OP__OPERANDS);
		createEAttribute(elOpEClass, EL_OP__PRECEDENCE);

		elDataTypeEClass = createEClass(EL_DATA_TYPE);

		elNamedElementEClass = createEClass(EL_NAMED_ELEMENT);
		createEAttribute(elNamedElementEClass, EL_NAMED_ELEMENT__NAME);

		elTypedElementEClass = createEClass(EL_TYPED_ELEMENT);
		createEReference(elTypedElementEClass, EL_TYPED_ELEMENT__TYPE);
		createEAttribute(elTypedElementEClass, EL_TYPED_ELEMENT__ARRAY);

		elBlockStarementKindEClass = createEClass(EL_BLOCK_STAREMENT_KIND);
		createEAttribute(elBlockStarementKindEClass, EL_BLOCK_STAREMENT_KIND__SYNTAX);
		createEAttribute(elBlockStarementKindEClass, EL_BLOCK_STAREMENT_KIND__BLOCKS);
		createEAttribute(elBlockStarementKindEClass, EL_BLOCK_STAREMENT_KIND__EXPRESSIONS);

		elModelEClass = createEClass(EL_MODEL);
		createEReference(elModelEClass, EL_MODEL__PACKAGES);
		createEReference(elModelEClass, EL_MODEL__OPS);
		createEReference(elModelEClass, EL_MODEL__BLOCKS);

		elAssignmentEClass = createEClass(EL_ASSIGNMENT);
		createEReference(elAssignmentEClass, EL_ASSIGNMENT__EXPR);
		createEReference(elAssignmentEClass, EL_ASSIGNMENT__ASSIGNEE);

		// Create enums
		elOpKindEEnum = createEEnum(EL_OP_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elPackageEClass.getESuperTypes().add(this.getELNamedElement());
		elClassEClass.getESuperTypes().add(this.getELNamedElement());
		elVariableEClass.getESuperTypes().add(this.getELTypedElement());
		elMethodEClass.getESuperTypes().add(this.getELTypedElement());
		elFieldEClass.getESuperTypes().add(this.getELVariable());
		elExpressionEClass.getESuperTypes().add(this.getELStatement());
		elLiteralEClass.getESuperTypes().add(this.getELExpression());
		elOpCallEClass.getESuperTypes().add(this.getELCall());
		elCallEClass.getESuperTypes().add(this.getELExpression());
		elAccessEClass.getESuperTypes().add(this.getELExpression());
		elBlockStatementEClass.getESuperTypes().add(this.getELStatement());
		elDataTypeEClass.getESuperTypes().add(this.getELClass());
		elTypedElementEClass.getESuperTypes().add(this.getELNamedElement());
		elModelEClass.getESuperTypes().add(this.getELNamedElement());
		elAssignmentEClass.getESuperTypes().add(this.getELStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elPackageEClass, ELPackage.class, "ELPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELPackage_Classes(), this.getELClass(), null, "classes", null, 0, -1, ELPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elClassEClass, ELClass.class, "ELClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELClass_Methods(), this.getELMethod(), null, "methods", null, 0, -1, ELClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELClass_Fields(), this.getELField(), null, "fields", null, 0, -1, ELClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELClass_SuperClases(), this.getELClass(), null, "superClases", null, 0, -1, ELClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELClass_InnerClasses(), this.getELClass(), null, "innerClasses", null, 0, -1, ELClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elVariableEClass, ELVariable.class, "ELVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elMethodEClass, ELMethod.class, "ELMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELMethod_Parameters(), this.getELVariable(), null, "parameters", null, 0, -1, ELMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELMethod_LocalVariables(), this.getELVariable(), null, "localVariables", null, 0, -1, ELMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELMethod_Block(), this.getELBlock(), null, "block", null, 0, 1, ELMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elFieldEClass, ELField.class, "ELField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elStatementEClass, ELStatement.class, "ELStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elBlockEClass, ELBlock.class, "ELBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELBlock_Statements(), this.getELStatement(), null, "statements", null, 0, -1, ELBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elExpressionEClass, ELExpression.class, "ELExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elLiteralEClass, ELLiteral.class, "ELLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, ELLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elOpCallEClass, ELOpCall.class, "ELOpCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELOpCall_Kind(), this.getELOp(), null, "kind", null, 0, 1, ELOpCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elCallEClass, ELCall.class, "ELCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELCall_Arguments(), this.getELExpression(), null, "arguments", null, 0, -1, ELCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELCall_Callee(), this.getELMethod(), null, "callee", null, 0, 1, ELCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELCall_ThisArgument(), this.getELExpression(), null, "thisArgument", null, 0, 1, ELCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elAccessEClass, ELAccess.class, "ELAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELAccess_Variable(), this.getELVariable(), null, "variable", null, 0, 1, ELAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elBlockStatementEClass, ELBlockStatement.class, "ELBlockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELBlockStatement_Block(), this.getELBlock(), null, "block", null, 0, -1, ELBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELBlockStatement_Kind(), this.getELBlockStarementKind(), null, "kind", null, 0, 1, ELBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELBlockStatement_Expressions(), this.getELExpression(), null, "expressions", null, 0, -1, ELBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elOpEClass, ELOp.class, "ELOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELOp_Kind(), this.getELOpKind(), "kind", null, 0, 1, ELOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELOp_Syntax(), ecorePackage.getEString(), "syntax", null, 0, 1, ELOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELOp_Operands(), ecorePackage.getEInt(), "operands", null, 0, 1, ELOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELOp_Precedence(), ecorePackage.getEInt(), "precedence", null, 0, 1, ELOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elDataTypeEClass, ELDataType.class, "ELDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elNamedElementEClass, ELNamedElement.class, "ELNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ELNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elTypedElementEClass, ELTypedElement.class, "ELTypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELTypedElement_Type(), this.getELClass(), null, "type", null, 0, 1, ELTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELTypedElement_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, ELTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elBlockStarementKindEClass, ELBlockStarementKind.class, "ELBlockStarementKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELBlockStarementKind_Syntax(), ecorePackage.getEString(), "syntax", null, 0, 1, ELBlockStarementKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELBlockStarementKind_Blocks(), ecorePackage.getEInt(), "blocks", null, 0, 1, ELBlockStarementKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELBlockStarementKind_Expressions(), ecorePackage.getEInt(), "expressions", null, 0, 1, ELBlockStarementKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elModelEClass, ELModel.class, "ELModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELModel_Packages(), this.getELPackage(), null, "packages", null, 0, -1, ELModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELModel_Ops(), this.getELOp(), null, "ops", null, 0, -1, ELModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELModel_Blocks(), this.getELBlockStarementKind(), null, "blocks", null, 0, -1, ELModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elAssignmentEClass, ELAssignment.class, "ELAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getELAssignment_Expr(), this.getELExpression(), null, "expr", null, 0, 1, ELAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELAssignment_Assignee(), this.getELVariable(), null, "assignee", null, 0, 1, ELAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(elOpKindEEnum, ELOpKind.class, "ELOpKind");
		addEEnumLiteral(elOpKindEEnum, ELOpKind.INFIX);
		addEEnumLiteral(elOpKindEEnum, ELOpKind.SUFFIX);
		addEEnumLiteral(elOpKindEEnum, ELOpKind.PREFIX);
		addEEnumLiteral(elOpKindEEnum, ELOpKind.SYNTAX);

		// Create resource
		createResource(eNS_URI);
	}

} //ExampleLanguagePackageImpl
