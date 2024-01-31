package Practice;

public class Robot extends Participants implements Sportsmens{
    private final int lenght;
    private final int height;

    public Robot(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }

    public int run(){
        System.out.print("Робот бежит " + lenght + " - ");
        return lenght;
    }
    public int jump(){
        System.out.print("Робот прыгает " + height + " - ");
        return height;
    }
    @Override
    public int run2() {
        return lenght;
    }

    @Override
    public int jump2() {
        return height;
    }
}
