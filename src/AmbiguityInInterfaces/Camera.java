package AmbiguityInInterfaces;

public interface Camera {
  default void feature() {
	  System.out.println("Use Camera");
  }
}
