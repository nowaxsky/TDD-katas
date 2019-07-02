package chuck.tennis;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTests {

  private TennisGame game;

  @Before
  public void setUp() {
    game = new TennisGameImpl();
  }

  @Test
  public void getScore_0to0_LoveAll() {
    assertEquals("Love-All", game.getScore());
  }
}
