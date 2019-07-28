import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


  @Test
  public void specShouldUpdateAnswerTo8when5isAddedToCalculatorWithInitialValue3(){
    int input = 5;
    String expectedAnswer = "8";
    Calculator c = new Calculator(3);

    c.add(input);

    String actualAnswer = c.toString();
    assertEquals(expectedAnswer, actualAnswer);

  }

}