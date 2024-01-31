package Practice;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(300,2);
        Robot robot = new Robot(500,3);
        Cat cat = new Cat(400,1);
        Wall wall = new Wall(2);
        Track track = new Track(400);

        Barrier[] barriers = new Barrier[2];
        barriers[0] = wall;
        barriers[1] = track;

        Sportsmens[] sportsmen = new Sportsmens[3];
        sportsmen[0] = human;
        sportsmen[1] = cat;
        sportsmen[2] = robot;

        doTraining(barriers, sportsmen);
    }
    private static void doTraining(Barrier[] barriers, Sportsmens[] sportsmen) {
        for (Sportsmens sportsmens : sportsmen) {
            for (Barrier barrier : barriers)  {
                System.out.println(barrier.doTraining(sportsmens));
                if (!barrier.doTraining2(sportsmens)){
                    break;
                }
            }
        }
    }
}
