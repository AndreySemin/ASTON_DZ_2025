package Lesson_4;

public abstract class Animals {
    public static int countAnimal = 0;


    protected String name;
    Animals(){countAnimal++;}

    public Animals(String name){
        this.name = name;
        countAnimal ++;
    }
    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCountAnimal(){return countAnimal;}


}