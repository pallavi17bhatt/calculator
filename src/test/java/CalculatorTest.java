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

  @Test
  public void specShouldUpdateAnswerTo5when3isSubtractedFromCalculatorWithUpdatedValueInitialValue8(){
    int input = 3;
    String expectedAnswer = "5";
    Calculator c = new Calculator(8);

    c.subtract(input);

    String actualAnswer = c.toString();
    assertEquals(expectedAnswer, actualAnswer);
 }

  @Test
  public void specShouldUpdateAnswerTo24when3isMultipliedFromCalculatorWithUpdatedValueInitialValue8(){
    int input = 3;
    String expectedAnswer = "24";
    Calculator c = new Calculator(8);

    c.multiply(input);

    String actualAnswer = c.toString();
    assertEquals(expectedAnswer, actualAnswer);
  }

  @Test
  public void specShouldUpdateAnswerTo3when6isDividedFromCalculatorWithInitialValue2(){
    int input = 6;
    String expectedAnswer = "3";
    Calculator c = new Calculator(2);

    try {
      c.divide(input);
    } catch (Exception e) {

      e.printStackTrace();
    }

    String actualAnswer = c.toString();
    assertEquals(expectedAnswer, actualAnswer);
  }


}