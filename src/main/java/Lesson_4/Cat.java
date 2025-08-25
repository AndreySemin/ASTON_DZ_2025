package Lesson_4;

public class Cat extends Animals {
    private boolean isFull = false;

    public static int countCat = 0;

    public static final int MAX_RUN_DISTANCE = 200;


    public Cat(String name){
        super(name);
        countCat ++;
    }
    public static int getCountCat(){return countCat;};

    @Override
    public void run(int distance) {
        if(distance<= MAX_RUN_DISTANCE){
            System.out.println(name + "бежит " + distance + "метров");

        }
        else {
            System.out.println(name + " не может бежать больше 200 метров");

        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");


    }
    public void eat(Bowl bowl, int amount){
        if(bowl.minFood(amount)){
            this.isFull = true;
            System.out.println(name + " Кот сыт");
        }
        else {
            System.out.println(name + "мало еды в миске");
        }
    }

    public boolean isFull() {
        return isFull;
    }
    public String getName(){return name;
    }
}