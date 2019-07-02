package chuck.gameOfLife;

public interface GameOfLife {

  void setLivingCell(int row, int column);

  int countlivingNeighbours();

  int[][] computeNextGeneration();
}
