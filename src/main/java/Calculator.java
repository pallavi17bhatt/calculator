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

      if ("add".equals(command[0])) {
        int response = calcy.add(commandArg);
        System.out.println(response);
      }

    }
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
