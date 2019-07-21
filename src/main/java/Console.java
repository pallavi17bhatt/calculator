import java.util.Scanner;

public class Console {
  Scanner sc;

  public Console() {
    sc = new Scanner(System.in);
  }

  public String getInput() {
    return sc.nextLine();
  }

  public void showOutput(String output) {
    System.out.println(output);
  }

  public void exit(){
    System.exit(0);
  }
}
