package edu.colorado.csdms.bmi;

/**
 * Get information about model exchange items.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiVars {

  int getVarGrid(String varName);
  String getVarType(String varName);
  String getVarUnits(String varName);
  int getVarItemsize(String varName);
  int getVarNbytes(String varName);
  String getVarLocation(String varName);
}
