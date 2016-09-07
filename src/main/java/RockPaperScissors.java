import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
  public String runRockPaperScissors(String choicesA, String choicesB) {
    String outcome = "";
    if (choicesA.equalsIgnoreCase(choicesB)) {
      outcome = "Tie Game";
    } else if (choicesA.equalsIgnoreCase("paper") && choicesB.equalsIgnoreCase("rock")) {
      outcome = "Player 1 wins!";
    } else if (choicesA.equalsIgnoreCase("scissors") && choicesB.equalsIgnoreCase("paper")) {
      outcome = "Player 1 wins!";
    } else if (choicesA.equalsIgnoreCase("rock") && choicesB.equalsIgnoreCase("scissors")) {
      outcome = "Player 1 wins!";
    } else if (choicesA.equalsIgnoreCase("rock") && choicesB.equalsIgnoreCase("paper")) {
      outcome = "Player 2 wins!";
    } else if (choicesA.equalsIgnoreCase("paper") && choicesB.equalsIgnoreCase("scissors")) {
      outcome = "Player 2 wins!";
    } else if (choicesA.equalsIgnoreCase("scissors") && choicesB.equalsIgnoreCase("rock")) {
      outcome = "Player 2 wins!";
    } else {
      outcome = "We don't recognize those choices.";
    }
    return outcome;
  }
}
