package day05.DimaondProblem;

class SmartPhone implements Camera,Music{
    

    @Override
    public void feature(){
        Camera.super.feature();
        Music.super.feature();

        System.out.println("Smart phone features");
    }
    
}
