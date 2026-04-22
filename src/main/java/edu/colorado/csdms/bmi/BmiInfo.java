package edu.colorado.csdms.bmi;

/**
 * Get model information.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiInfo {

  String getComponentName();
  int getInputItemCount();
  int getOutputItemCount();
  String[] getInputVarNames();
  String[] getOutputVarNames();
}
