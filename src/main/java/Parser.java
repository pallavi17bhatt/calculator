public class Parser {

  Calculator calcy;

  public Parser(Calculator c) {
    calcy = c;
  }

  public void parse( String[] command) {

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
}
