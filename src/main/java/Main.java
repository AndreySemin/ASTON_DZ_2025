import Lesson_4.Animals;
import Lesson_4.Bowl;
import Lesson_4.Cat;
import Lesson_4.Dog;
import Lesson_4_tack_2.Circle;
import Lesson_4_tack_2.Rectangle;
import Lesson_4_tack_2.Shapes;
import Lesson_4_tack_2.Triangle;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Тузик "), new Dog("Бобик "), new Dog("Шарик "), new Dog("Цезарь ")};
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("Всего собак " + Dog.getCountDog());

        dogs[0].run(500);
        dogs[1].run(600);
        dogs[2].swim(10);
        dogs[3].swim(20);

        Cat[] cats = {new Cat("Пушок "), new Cat("Котяра "), new Cat("Самец "), new Cat("Подлец ")};
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Всего котов  " + Cat.getCountCat());
        cats[0].run(100);
        cats[1].run(250);
        cats[2].swim(10);
        cats[3].swim(5);

        System.out.println("Всего животных " + Animals.getCountAnimal());

        Bowl bowl = new Bowl(20);
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            System.out.println("Еды осталось " + bowl.getFood());
        }
        bowl.addFood(30);
        System.out.println("Добавили еды " + bowl.getFood());
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт " + cat.isFull());
            }
            System.out.println("Остаток еды в миске " + bowl.getFood());
        }

        System.out.println("Фигуры");
        Shapes circle = new Circle(10, "red", "blue");
        System.out.println("Круг");
        circle.printSpecifications();

        Shapes rectangle = new Rectangle(10, 15, "white", "black");
        System.out.println("Прямоугольник");
        rectangle.printSpecifications();

        Shapes triangle = new Triangle(10, 10, 10, "Green", "Grey");
        System.out.println("Треугольник");
        triangle.printSpecifications();

    }
}
