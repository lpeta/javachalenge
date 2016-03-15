public class Runner {

  public static void main(String[] args) {

    Challenges challenges = new Challenges();

    System.out.println("sum(3 + 3): " + challenges.sum(3, 3));
    System.out.println("5 first caracteres: " + challenges.firsFive("leo"));
    System.out.println("The number * 5 is: " + challenges.timesFive(5));
  }
}
