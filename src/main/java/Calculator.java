import java.util.Scanner;

public class Calculator {

  int answer = 0;

  public static void main(String args[]) {
    Calculator calcy = new Calculator();
    Scanner sc = new Scanner(System.in);

    while (true) {
      String inputValue = sc.nextLine();
      String command[] = inputValue.split(" ");
      executeCommand(calcy, command);
    }
  }

  private static void executeCommand(Calculator calcy, String[] command) {

    if ("add".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.add(commandArg);
      System.out.println(response);
    }
    else if ("subtract".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.subtract(commandArg);
      System.out.println(response);
    }
    else if ("multiply".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.multiply(commandArg);
      System.out.println(response);
    }
    else if ("divide".equals((command[0]))) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.divide(commandArg);
      System.out.println(response);
    }
    else if("exit".equals(command[0])){
      System.exit(0);
    }
    else {
      System.out.println("Invalid Command! Please re-enter.");
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
