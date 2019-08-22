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

  @Test
  public void getScore_1to0_FifteenLove() {
    game.wonPoint("Andy");
    assertEquals("Fifteen-Love",game.getScore());
  }

  @Test
  public void getScore_2to0_ThirtyLove() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    assertEquals("Thirty-Love",game.getScore());
  }

  @Test
  public void getScore_3to3_Deuce() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    assertEquals("Deuce",game.getScore());
  }

  @Test
  public void getScore_4to4_Deuce() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    assertEquals("Deuce",game.getScore());
  }
  @Test
  public void getScore_3to0_FortyLove() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    assertEquals("Forty-Love",game.getScore());
  }

  @Test
  public void getScore_3to2_FortyThirty() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    assertEquals("Forty-Thirty",game.getScore());
  }

  @Test
  public void getScore_2to3_ThirtyForty() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    assertEquals("Thirty-Forty",game.getScore());
  }

  @Test
  public void getScore_3to1_FortyFifteen() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    assertEquals("Forty-Fifteen",game.getScore());
  }

  @Test
  public void getScore_4to3_AdvantageAndy() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Andy");
    assertEquals("Advantage Andy",game.getScore());
  }
  @Test
  public void getScore_4to6_WinForChuck() {
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Andy");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    game.wonPoint("Chuck");
    assertEquals("Win for Chuck",game.getScore());
  }
}
