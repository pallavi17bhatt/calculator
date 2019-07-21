import java.util.Scanner;

public class Calculator {

  int answer = 0;

  public static void main(String args[]) {
    Calculator calcy = new Calculator();
    Scanner sc = new Scanner(System.in);

    while (true) {
      String inputValue = sc.nextLine();
      String command[] = inputValue.split(" ");
      int commandArg = Integer.parseInt(command[1]);
      executeCommand(calcy, command[0], commandArg);
    }
  }

  private static void executeCommand(Calculator calcy, String commandName, int commandArg) {
    if ("add".equals(commandName)) {
      int response = calcy.add(commandArg);
      System.out.println(response);
    } else if ("subtract".equals(commandName)) {
      int response = calcy.subtract(commandArg);
      System.out.println(response);
    } else if ("multiply".equals(commandName)) {
      int response = calcy.multiply(commandArg);
      System.out.println(response);
    } else if ("divide".equals((commandName))) {
      int response = calcy.divide(commandArg);
      System.out.println(response);
    }
  }

  private int multiply(int value) {
    answer = answer * value;
    return answer;
  }

  private int divide(int value) {
    if (value == 0)
      System.out.println("can't divide by zero");
    else
      answer = answer / value;
    return answer;
  }

  private int add(int value) {
    answer = answer + value;
    return answer;
  }

  private int subtract(int value) {
    answer = answer - value;
    return answer;
  }
}
