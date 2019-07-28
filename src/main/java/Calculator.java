public class Calculator {

  private int answer;

  Calculator(int initialValue) {
    answer = initialValue;
  }

  public void multiply(int value) {
    answer = answer * value;
  }

  public void divide(int value) throws Exception {
    if (value == 0)
      throw new Exception("can't divide by zero");
    else
      answer = answer / value;
  }

  public void add(int value) {
    answer = answer + value;
  }

  public void subtract(int value) {
    answer = answer - value;
  }

  @Override
  public String toString() {
    return String.valueOf(answer);
  }
}
