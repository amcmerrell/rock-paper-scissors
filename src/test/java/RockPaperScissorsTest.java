import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void compareStrings_gameOutcome_tieGame() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Tie Game";
    assertEquals(expected, testRockPaperScissors.runRockPaperScissors("rock", "rock"));
  }

  @Test
  public void compareStrings_gameOutcome_tieGame() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Tie Game";
    assertEquals(expected, testRockPaperScissors.runRockPaperScissors("rock", "rock"));
  }
}
