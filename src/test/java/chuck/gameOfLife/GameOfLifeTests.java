package chuck.gameOfLife;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTests {

  private GameOfLife game;

  @Before
  public void setUp() {
  }

  @Test
  public void countlivingNeighbours_Size33_AllDead() {
    game = new GameOfLifeImpl(3, 3);
    assertEquals(0, game.countlivingNeighbours());
  }

  @Test
  public void computeNextGeneration_Size33_Living11() {
    game = new GameOfLifeImpl(3, 3);
    int[][] expectedGrid = new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    assertTrue(Arrays.deepEquals(game.computeNextGeneration(), expectedGrid));
  }
}
