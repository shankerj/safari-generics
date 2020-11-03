package shopping;

public class ClothingPair<E extends Sized/*, String*/> extends Pair<E> {
//  String thingy = "Hello";
//  java.lang.String thingy = "Hello";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean isMatched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
