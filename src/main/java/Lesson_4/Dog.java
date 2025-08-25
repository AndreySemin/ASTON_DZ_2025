package Lesson_4;

public class Dog extends Animals {
    public static int countDog = 0;

    public static final int  MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_DISTANCE = 10;

    public Dog (String name){
        super(name);
        countDog ++;
    }
    public static int getCountDog(){return countDog;}

    @Override
    public void run(int distance) {
        if (distance<= MAX_RUN_DISTANCE){
            System.out.println(name + "бежит " + distance);
        }
        else {System.out.println(name + "может бежать не больше 500 метров");}

    }

    @Override
    public void swim(int distance) {
        if(distance<= MAX_SWIM_DISTANCE){
            System.out.println(name + "плывет " + distance);
        }
        else {
            System.out.println(name + " может плыть не больше 10 метров");
        }
    }
}
