package edu.colorado.csdms.bmi;

/**
 * Get model time information.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiTime {

  double getCurrentTime();
  double getStartTime();
  double getEndTime();
  String getTimeUnits();
  double getTimeStep();
}
