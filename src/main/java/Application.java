public class Application {
  public static void main(String args[]) {
    Calculator calcy = new Calculator();
    Parser parser = new Parser(calcy);
    Console console = new Console();

    while(true) {
      String inputValue = console.getInput();
      String command[] = inputValue.split(" ");
      if("exit".equals(command[0])){
        console.exit();
      }

      String output = parser.parse(command);
      console.showOutput(output);
    }
  }
}
