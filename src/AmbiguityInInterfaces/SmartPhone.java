package AmbiguityInInterfaces;

public class SmartPhone implements Camera,MusicPlayer {
	@Override
	public void feature() {
		
		System.out.println("Use SmartPhone Features");
		Camera.super.feature();
		MusicPlayer.super.feature();
		
	}
  
}
