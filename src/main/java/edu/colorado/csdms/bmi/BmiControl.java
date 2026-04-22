package edu.colorado.csdms.bmi;

/**
 * Control model execution.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiControl {

  void initialize(String configFile);
  void initialize();
  void update();
  void updateUntil(double time);
  void finalize();
}
