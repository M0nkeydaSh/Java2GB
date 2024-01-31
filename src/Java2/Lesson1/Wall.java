package Practice;

public class Wall implements Barrier {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }



    @Override
    public boolean doTraining(Sportsmens sportsmensParticipants){
        int jumpHeight = sportsmensParticipants.jump();
        return jumpHeight >= height;
    }

    @Override
    public boolean doTraining2(Sportsmens sportsmensParticipants){
        int jumpHeight = sportsmensParticipants.jump2();
        return jumpHeight >= height;
    }
}
