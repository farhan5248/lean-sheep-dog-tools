/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cukefsm.cucumberFSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMFactory
 * @model kind="package"
 * @generated
 */
public interface CucumberFSMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cucumberFSM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.farhan.org/cukefsm/CucumberFSM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cucumberFSM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CucumberFSMPackage eINSTANCE = org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl.init();

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.FeatureImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Background</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__BACKGROUND = 2;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__SCENARIOS = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.BackgroundImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__STEPS = 2;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.AbstractScenarioImpl <em>Abstract Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.AbstractScenarioImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getAbstractScenario()
   * @generated
   */
  int ABSTRACT_SCENARIO = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO__STEPS = 2;

  /**
   * The number of structural features of the '<em>Abstract Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCENARIO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.ScenarioImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__TITLE = ABSTRACT_SCENARIO__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__DESCRIPTION = ABSTRACT_SCENARIO__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__STEPS = ABSTRACT_SCENARIO__STEPS;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = ABSTRACT_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.ScenarioOutlineImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getScenarioOutline()
   * @generated
   */
  int SCENARIO_OUTLINE = 4;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__TITLE = ABSTRACT_SCENARIO__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__DESCRIPTION = ABSTRACT_SCENARIO__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__STEPS = ABSTRACT_SCENARIO__STEPS;

  /**
   * The feature id for the '<em><b>Examples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE__EXAMPLES = ABSTRACT_SCENARIO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scenario Outline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_OUTLINE_FEATURE_COUNT = ABSTRACT_SCENARIO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ExampleImpl <em>Example</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.ExampleImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getExample()
   * @generated
   */
  int EXAMPLE = 5;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE__TABLE = 2;

  /**
   * The number of structural features of the '<em>Example</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXAMPLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.StepImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getStep()
   * @generated
   */
  int STEP = 6;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TITLE = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TABLE = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TEXT = 2;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.TableImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getTable()
   * @generated
   */
  int TABLE = 7;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ROWS = 0;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.TableRowImpl <em>Table Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.TableRowImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getTableRow()
   * @generated
   */
  int TABLE_ROW = 8;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__CELLS = 0;

  /**
   * The number of structural features of the '<em>Table Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.RowCellImpl <em>Row Cell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.RowCellImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getRowCell()
   * @generated
   */
  int ROW_CELL = 9;

  /**
   * The feature id for the '<em><b>Cell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_CELL__CELL = 0;

  /**
   * The number of structural features of the '<em>Row Cell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROW_CELL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.DocStringImpl <em>Doc String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.DocStringImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getDocString()
   * @generated
   */
  int DOC_STRING = 10;

  /**
   * The number of structural features of the '<em>Doc String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_STRING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.farhan.cukefsm.cucumberFSM.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.farhan.cukefsm.cucumberFSM.impl.DescriptionImpl
   * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 11;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__SENTENCES = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.Feature#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Feature#getTitle()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Feature#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Feature#getDescription()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Feature#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Background</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Feature#getBackground()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Background();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.Feature#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Feature#getScenarios()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Scenarios();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.Background#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Background#getTitle()
   * @see #getBackground()
   * @generated
   */
  EAttribute getBackground_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Background#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Background#getDescription()
   * @see #getBackground()
   * @generated
   */
  EReference getBackground_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.Background#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Background#getSteps()
   * @see #getBackground()
   * @generated
   */
  EReference getBackground_Steps();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.AbstractScenario <em>Abstract Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Scenario</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.AbstractScenario
   * @generated
   */
  EClass getAbstractScenario();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.AbstractScenario#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.AbstractScenario#getTitle()
   * @see #getAbstractScenario()
   * @generated
   */
  EAttribute getAbstractScenario_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.AbstractScenario#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.AbstractScenario#getDescription()
   * @see #getAbstractScenario()
   * @generated
   */
  EReference getAbstractScenario_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.AbstractScenario#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.AbstractScenario#getSteps()
   * @see #getAbstractScenario()
   * @generated
   */
  EReference getAbstractScenario_Steps();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.ScenarioOutline <em>Scenario Outline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario Outline</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.ScenarioOutline
   * @generated
   */
  EClass getScenarioOutline();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.ScenarioOutline#getExamples <em>Examples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Examples</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.ScenarioOutline#getExamples()
   * @see #getScenarioOutline()
   * @generated
   */
  EReference getScenarioOutline_Examples();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Example <em>Example</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Example</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Example
   * @generated
   */
  EClass getExample();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.Example#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Example#getTitle()
   * @see #getExample()
   * @generated
   */
  EAttribute getExample_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Example#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Example#getDescription()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Example#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Example#getTable()
   * @see #getExample()
   * @generated
   */
  EReference getExample_Table();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.Step#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Step#getTitle()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Title();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Step#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Step#getTable()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Table();

  /**
   * Returns the meta object for the containment reference '{@link org.farhan.cukefsm.cucumberFSM.Step#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Step#getText()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Text();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.Table#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Table#getRows()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Rows();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.TableRow <em>Table Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Row</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.TableRow
   * @generated
   */
  EClass getTableRow();

  /**
   * Returns the meta object for the containment reference list '{@link org.farhan.cukefsm.cucumberFSM.TableRow#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.TableRow#getCells()
   * @see #getTableRow()
   * @generated
   */
  EReference getTableRow_Cells();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.RowCell <em>Row Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Row Cell</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.RowCell
   * @generated
   */
  EClass getRowCell();

  /**
   * Returns the meta object for the attribute '{@link org.farhan.cukefsm.cucumberFSM.RowCell#getCell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cell</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.RowCell#getCell()
   * @see #getRowCell()
   * @generated
   */
  EAttribute getRowCell_Cell();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.DocString <em>Doc String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc String</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.DocString
   * @generated
   */
  EClass getDocString();

  /**
   * Returns the meta object for class '{@link org.farhan.cukefsm.cucumberFSM.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute list '{@link org.farhan.cukefsm.cucumberFSM.Description#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sentences</em>'.
   * @see org.farhan.cukefsm.cucumberFSM.Description#getSentences()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Sentences();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CucumberFSMFactory getCucumberFSMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.FeatureImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__TITLE = eINSTANCE.getFeature_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__BACKGROUND = eINSTANCE.getFeature_Background();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__SCENARIOS = eINSTANCE.getFeature_Scenarios();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.BackgroundImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKGROUND__TITLE = eINSTANCE.getBackground_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND__DESCRIPTION = eINSTANCE.getBackground_Description();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKGROUND__STEPS = eINSTANCE.getBackground_Steps();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.AbstractScenarioImpl <em>Abstract Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.AbstractScenarioImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getAbstractScenario()
     * @generated
     */
    EClass ABSTRACT_SCENARIO = eINSTANCE.getAbstractScenario();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SCENARIO__TITLE = eINSTANCE.getAbstractScenario_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SCENARIO__DESCRIPTION = eINSTANCE.getAbstractScenario_Description();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SCENARIO__STEPS = eINSTANCE.getAbstractScenario_Steps();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.ScenarioImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ScenarioOutlineImpl <em>Scenario Outline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.ScenarioOutlineImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getScenarioOutline()
     * @generated
     */
    EClass SCENARIO_OUTLINE = eINSTANCE.getScenarioOutline();

    /**
     * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO_OUTLINE__EXAMPLES = eINSTANCE.getScenarioOutline_Examples();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.ExampleImpl <em>Example</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.ExampleImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getExample()
     * @generated
     */
    EClass EXAMPLE = eINSTANCE.getExample();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXAMPLE__TITLE = eINSTANCE.getExample_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__DESCRIPTION = eINSTANCE.getExample_Description();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXAMPLE__TABLE = eINSTANCE.getExample_Table();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.StepImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TITLE = eINSTANCE.getStep_Title();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__TABLE = eINSTANCE.getStep_Table();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__TEXT = eINSTANCE.getStep_Text();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.TableImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.TableRowImpl <em>Table Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.TableRowImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getTableRow()
     * @generated
     */
    EClass TABLE_ROW = eINSTANCE.getTableRow();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.RowCellImpl <em>Row Cell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.RowCellImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getRowCell()
     * @generated
     */
    EClass ROW_CELL = eINSTANCE.getRowCell();

    /**
     * The meta object literal for the '<em><b>Cell</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROW_CELL__CELL = eINSTANCE.getRowCell_Cell();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.DocStringImpl <em>Doc String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.DocStringImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getDocString()
     * @generated
     */
    EClass DOC_STRING = eINSTANCE.getDocString();

    /**
     * The meta object literal for the '{@link org.farhan.cukefsm.cucumberFSM.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.farhan.cukefsm.cucumberFSM.impl.DescriptionImpl
     * @see org.farhan.cukefsm.cucumberFSM.impl.CucumberFSMPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__SENTENCES = eINSTANCE.getDescription_Sentences();

  }

} //CucumberFSMPackage
