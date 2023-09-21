/**
 * generated by Xtext 2.32.0
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
