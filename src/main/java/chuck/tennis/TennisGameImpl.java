package chuck.tennis;

public class TennisGameImpl implements TennisGame {

  int isWonPointCalled;

  @Override
  public void wonPoint(String player) {
    isWonPointCalled++;
  }

  @Override
  public String getScore() {
    if(isWonPointCalled >0) return "Fifteen-Love";
    return "Love-All";
  }
}
