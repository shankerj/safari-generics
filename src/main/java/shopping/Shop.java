package shopping;

public class Shop {
  public static void main(String[] args) {
    ClothingPair<Sock> ps = new ClothingPair<>(new Sock(9, "Red"), new Sock(10, "Red"));
    System.out.println("I bought this: " + ps);
    System.out.println("matches? " + ps.isMatched());
  }
}
