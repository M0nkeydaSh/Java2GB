package Practice;

public class Track implements Barrier{
    private final int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }
    @Override
    public boolean doTraining(Sportsmens sportsmensParticipants) {
        int RunLenght = sportsmensParticipants.run();
        return RunLenght >= lenght;

    }
    @Override
    public boolean doTraining2(Sportsmens sportsmensParticipants) {
        int RunLenght = sportsmensParticipants.run2();
        return RunLenght >= lenght;

    }
}
