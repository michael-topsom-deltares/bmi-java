package edu.colorado.csdms.bmi;

/**
 * Get variables from a model.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */ 
public interface BmiGetter {

  void getValue(String varName, double[] dest);
  default void getValue(String varName, float[] dest) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  void getValue(String varName, int[] dest);
  void getValue(String varName, String[] dest);

  <T> T getValuePtr(String varName);

  void getValueAtIndices(String varName, double[] dest, int[] indices);
  default void getValueAtIndices(String varName, float[] dest, int[] indices) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  void getValueAtIndices(String varName, int[] dest, int[] indices);
  void getValueAtIndices(String varName, String[] dest, int[] indices);
}
