import java.util.ArrayList;
import java.util.List;

public class RockPaperScissors {
  public Boolean runRockPaperScissors(String choices) {
    boolean choiceValue = false;
    if (choices.equalsIgnoreCase("rock")) {
      choiceValue = true;
    }
    // if (choices.equalsIgnoreCase("scissors")) {
    //   choiceValue = true;
    // }
    // if (choices.equalsIgnoreCase("paper")) {
    //   choiceValue = true;
    // }
    return choiceValue;
  }
}
