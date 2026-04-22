package edu.colorado.csdms.bmi;

/**
 * Describe a grid of type <em>unstructured</em>, which includes the special
 * cases <em>scalar</em>, <em>points</em>, and <em>vector</em>.
 * <p>
 * See the BMI <a href="https://bmi.readthedocs.io">documentation</a> for
 * detailed information about each function.
 */
public interface BmiGridUnstructured extends BmiGrid {

  void getGridX(int gridId, double[] gridX);
  void getGridY(int gridId, double[] gridY);
  void getGridZ(int gridId, double[] gridZ);

  int getGridNodeCount(int gridId);
  int getGridEdgeCount(int gridId);
  int getGridFaceCount(int gridId);

  void getGridEdgeNodes(int gridId, int[] edgeNodes);
  void getGridFaceEdges(int gridId, int[] faceEdges);
  void getGridFaceNodes(int gridId, int[] faceNodes);
  void getGridNodesPerFace(int gridId, int[] nodesPerFace);
}
