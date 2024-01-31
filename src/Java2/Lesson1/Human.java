package Practice;

public class Human extends Participants implements Sportsmens{
    private final int lenght;
    private final int height;

    public Human(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }

    public int run(){
        System.out.print("Человек бежит " + lenght + " - ");
        return lenght;
    }
    public int jump(){
        System.out.print("Человек прыгает " + height+ " - ");
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
