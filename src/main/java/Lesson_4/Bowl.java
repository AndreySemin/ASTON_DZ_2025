package Lesson_4;

public class Bowl {
    private int food;

    public Bowl(int food){
        this.food = food;
    }
    public boolean minFood(int amount){
        if(amount <= 0){
            System.out.println("Количество еды должно быть больше 0 ");
            return false;
        }
        if (food >= amount){
            food -= amount;
            return true;
        }
        System.out.println("Недостаточно еды в миске " + food);
        return false;

    }
    public void addFood(int amount){
        if(amount > 0 ){
            food += amount;
            System.out.println("Добавили " + amount);
        }
        else {
            System.out.println("В миске не достаточно еды");
        }

    }
    public int getFood(){
        return food;
    }


}
