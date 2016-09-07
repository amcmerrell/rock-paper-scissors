import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Let's play rock, paper, scissors.");

    System.out.println("Player 1: Choose 'rock', 'paper', or 'scissors'.");
    String choicesA = myConsole.readLine();

    System.out.println("Player 2: Choose 'rock', 'paper', or 'scissors'.");
    String choicesB = myConsole.readLine();

    RockPaperScissors newGame = new RockPaperScissors();
    String gameResult = newGame.runRockPaperScissors(choicesA, choicesB);

    System.out.println("Game result: "+ gameResult);
  }
}
