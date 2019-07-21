public class Calculator {

  int answer = 0;

  public int multiply(int value) {
    answer = answer * value;
    return answer;
  }

  public int divide(int value) throws Exception {
    if (value == 0)
      throw new Exception("can't divide by zero");
    else
      answer = answer / value;
    return answer;
  }

  public int add(int value) {
    answer = answer + value;
    return answer;
  }

  public int subtract(int value) {
    answer = answer - value;
    return answer;
  }
}
