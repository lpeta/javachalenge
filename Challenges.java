public class Challenges {

  public Challenges() {
    // todo
  }

  public int sum(int x, int y) {
    return x + y;
  }

  public String firsFive(String name) {
    if(name.length() < 5) {
      return name;
    }

    return name.substring(0, 5);
  }

  public int timesFive(int number) {
    return number * 5;
  }

  public int times(int x, int y) {
    return x * y;
  }

}
