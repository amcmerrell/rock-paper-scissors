import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void compareStrings_enterRock_true() {
  RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  Boolean expected = true;
  assertEquals(expected, testRockPaperScissors.runRockPaperScissors("rock"));
  }

  // @Test
  // public void compareStrings_enterScissors_true() {
  // RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  // Boolean expected = false;
  // assertEquals(expected, testRockPaperScissors.runRockPaperScissors("scissors"));
  // }
}
