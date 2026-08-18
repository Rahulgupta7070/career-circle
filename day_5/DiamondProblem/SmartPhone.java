public class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void feature() {
        //InterfaceName.super.methodName();
        Camera.super.feature();   //means call the default feature() from Camera.
        MusicPlayer.super.feature();    //means call the default feature() from MusicPlayer.
        System.out.println("SmartPhone Feature");   //Use the feature() method from SmartPhone.
    }
}