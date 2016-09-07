import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
  // public Boolean runRockPaperScissors(String choicesA, String choicesB) {
  //   boolean player1 = false;
  //   boolean player2 = false;
  //   boolean tieValue = false;
  //   if (choicesA.equalsIgnoreCase(choicesB)) {
  //     tieValue = true;
  //   }
  //   if (choicesA.equalsIgnoreCase("scissors")) {
  //     tieValue = false;
  //   }
  //   if (choicesA.equalsIgnoreCase("paper")) {
  //     tieValue = false;
  //   }
  //   return tieValue;
  // }

  public String runRockPaperScissors(String choicesA, String choicesB) {
    String outcome = "";
    if (choicesA.equalsIgnoreCase(choicesB)) {
      outcome = "Tie Game";
    } else if (choicesA.equalsIgnoreCase("rock") && choicesB.equalsIgnoreCase("paper")) {
      outcome = "Player 2 wins!";
    }
    return outcome;
  }
}
