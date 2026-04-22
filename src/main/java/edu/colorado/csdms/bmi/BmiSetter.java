package edu.colorado.csdms.bmi;

/**
 * Set variables in a model.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiSetter {

  void setValue(String varName, double[] src);
  default void setValue(String varName, float[] src) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  void setValue(String varName, int[] src);
  void setValue(String varName, String[] src);

  void setValueAtIndices(String varName, int[] indices, double[] src);
  default void setValueAtIndices(String varName, int[] indices, float[] src) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  void setValueAtIndices(String varName, int[] indices, int[] src);
  void setValueAtIndices(String varName, int[] indices, String[] src);
}
