package AmbiguityInInterfaces;

public interface MusicPlayer {
	default void feature() {
		System.out.println("Use MusicPlayer");
	}
}
