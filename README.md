# TDD-katas
Katas for TDD practice.

## 1. Tennis Game

<img src="img/maria-sharapova.jpg" alt="maria-sharapova" />
Tennis has a rather quirky scoring system, and to newcomers it can be a little difficult to keep track of. The tennis society has contracted you to build a scoreboard to display the current score during tennis games. 

Your task is to write a "TennisGame" class containing the logic which outputs the correct score as a string for display on the scoreboard. When a player scores a point, it triggers a method to be called on your class letting you know who scored the point. Later, you will get a call "score()" from the scoreboard asking what it should display. This method should return a string with the current score.

You can read more about Tennis scores [here](https://en.wikipedia.org/wiki/Tennis_scoring_system) which is summarized below:

1. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
2. The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as "Love", "Fifteen", "Thirty", and "Forty" respectively.
3. If at least three points have been scored by each player, and the scores are equal, the score is "Deuce".
4. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is "Advantage" for the player in the lead.

You need only report the score for the current game. Sets and Matches are out of scope. Here is an example:

Andy|Chuck|Corresponding call
--|--|--
0|0|Love-All
1|0|Fifteen-Love
2|0|Thirty-Love
3|0|Forty-Love
4|0|Win for Andy
1|1|Fifteen-All
2|2|Thirty-All
3|3|Deuce
4|4|Deuce
1|2|Fifteen-Thirty
3|2|Forty-Thirty
3|4|Advantage Chuck
5|4|Advantage Andy
5|7|Win for Chuck
...|...|...

### Questions to discuss afterwards

* How did it feel to work with such fast, comprehensive tests?
* Did you make mistakes while refactoring that were caught by the tests?
* If you used a tool to record your test runs, review it. Could you have taken smaller steps? Made fewer refactoring mistakes?
* Did you ever make any refactoring mistakes and then back out your changes? How did it feel to throw away code?

## 2. Game of Life

You start with a two dimensional grid of cells, where each cell is either alive or dead. In this version of the problem, the grid is finite, and no life can exist off the edges. When calcuating the next generation of the grid, follow these rules:

1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
1. Any live cell with more than three live neighbours dies, as if by overcrowding.
1. Any live cell with two (or three) live neighbours lives on to the next generation.
1. Any dead cell with exactly three live neighbours becomes a live cell.

You should write a program that can accept an arbitrary grid of cells, and will output a similar grid showing the next generation.

You can read more about Game of Life [here](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life).
