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
  public void compareStrings_gameOutcome_Player1() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 1 wins!";
    assertEquals(expected, testRockPaperScissors.runRockPaperScissors("paper", "rock"));
  }

  @Test
  public void compareStrings_gameOutcome_Player2() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 2 wins!";
    assertEquals(expected, testRockPaperScissors.runRockPaperScissors("paper", "scissors"));
  }

  @Test
  public void compareStrings_gameOutcome_Invalid() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "We don't recognize those choices.";
    assertEquals(expected, testRockPaperScissors.runRockPaperScissors("hello", "scissors"));
  }
  
}
