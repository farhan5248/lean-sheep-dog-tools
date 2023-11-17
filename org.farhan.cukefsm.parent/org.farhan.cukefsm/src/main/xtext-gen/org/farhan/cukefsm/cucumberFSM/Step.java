/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cukefsm.cucumberFSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cukefsm.cucumberFSM.Step#getTitle <em>Title</em>}</li>
 *   <li>{@link org.farhan.cukefsm.cucumberFSM.Step#getTable <em>Table</em>}</li>
 *   <li>{@link org.farhan.cukefsm.cucumberFSM.Step#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getStep_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.farhan.cukefsm.cucumberFSM.Step#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(Table)
   * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getStep_Table()
   * @model containment="true"
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link org.farhan.cukefsm.cucumberFSM.Step#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(Table value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(DocString)
   * @see org.farhan.cukefsm.cucumberFSM.CucumberFSMPackage#getStep_Text()
   * @model containment="true"
   * @generated
   */
  DocString getText();

  /**
   * Sets the value of the '{@link org.farhan.cukefsm.cucumberFSM.Step#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(DocString value);

} // Step
