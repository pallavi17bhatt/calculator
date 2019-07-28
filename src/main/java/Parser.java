public class Parser {

  Calculator calcy;

  public Parser(Calculator c) {
    calcy = c;
  }

  public String parse(String[] command) {

    if ("add".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      calcy.add(commandArg);
      return calcy.toString();
    }
    else if ("subtract".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      calcy.subtract(commandArg);
      return calcy.toString();

    }
    else if ("multiply".equals(command[0])) {
      int commandArg = Integer.parseInt(command[1]);
      calcy.multiply(commandArg);
      return calcy.toString();
    }
    else if ("divide".equals((command[0]))) {
      int commandArg = Integer.parseInt(command[1]);
      try {
        calcy.divide(commandArg);
      } catch (Exception e) {
        return e.getMessage();
      }
      return calcy.toString();
    }
    return "Invalid Command! Please re-enter.";
  }
}
