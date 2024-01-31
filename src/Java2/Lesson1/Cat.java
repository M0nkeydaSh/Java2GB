package Practice;

public class Cat extends Participants implements Sportsmens{
    private final int lenght;
    private final int height;

    public Cat(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }

    public int run(){
        System.out.print("Кот бежит " + lenght + " - ");
        return lenght;
    }
    public int jump(){
        System.out.print("Кот прыгает " + height + " - ");
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
