import java.util.Scanner;

public class Application {
  public static void main(String args[]) {
    Calculator calcy = new Calculator();
    Parser parser = new Parser(calcy);
    Scanner sc = new Scanner(System.in);
    while (true) {
      String inputValue = sc.nextLine();
      String command[] = inputValue.split(" ");
      parser.parse(command);
    }
  }
}
