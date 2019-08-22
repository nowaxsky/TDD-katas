package chuck.tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisGameImpl implements TennisGame {

    private final static int DEUCE = 6;
    private final static String DASH = "-";
    private final static String ALL = "All";
    private Map<Integer, String> scoreMap = new HashMap<>();

    private int Andy = 0;
    private int Chuck = 0;

    TennisGameImpl() {
        scoreMap.put(0, "Love");
        scoreMap.put(1, "Fifteen");
        scoreMap.put(2, "Thirty");
        scoreMap.put(3, "Forty");
    }

    @Override
    public void wonPoint(String player) {
        if ("Andy".equals(player)) {
            Andy++;
        } else {
            Chuck++;
        }
    }

    private int getTotal() {
        return Andy + Chuck;
    }

    @Override
    public String getScore() {
        if (getTotal() == 10) return "Win for Chuck";
        else if (getTotal() == 7) return "Advantage Andy";
        else if (getTotal() >= DEUCE) return "Deuce";
        else if (getTotal() == 0) return scoreMap.get(0) + DASH + ALL;
        else return scoreMap.get(Andy) + DASH + scoreMap.get(Chuck);
    }

}
