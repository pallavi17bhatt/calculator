public class Parser {

  Calculator calcy;

  public Parser(Calculator c) {
    calcy = c;
  }

  public String parse(String[] command) {

    if ("add".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.add(commandArg);
      return String.valueOf(response);
    }
    else if ("subtract".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.subtract(commandArg);
      return String.valueOf(response);

    }
    else if ("multiply".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      int response = calcy.multiply(commandArg);
      return String.valueOf(response);
    }
    else if ("divide".equals((command[0]))) {
      int commandArg = Integer.parseInt(command[1]);
      int response = 0;
      try {
        response = calcy.divide(commandArg);
      } catch (Exception e) {
        return e.getMessage();
      }
      return String.valueOf(response);
    }
    return "Invalid Command! Please re-enter.";
  }
}
