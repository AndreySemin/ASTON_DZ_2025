import lesson_3.Park;
import lesson_3.Product;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Lesson_3();

    }
    public static void Lesson_3() {
            Product[] product = new Product[5];
            product[0] = new Product("Redmi_14_Pro ", "10-05-2024", "Huavei ", "China ", 20000, "boked ");
            product[1] = new Product("Redmi_13_Pro ", "10-01-2024", "Huavei ", "China ", 18000, "boked ");
            product[2] = new Product("Redmi_12_Pro ", "10-12-2023", "Huavei ", "China ", 16000, "boked ");
            product[3] = new Product("Redmi_11_Pro ", "10-01-2023", "Huavei ", "China ", 15000, "boked ");
            product[4] = new Product("Redmi_10_Pro ", "10-03-2022", "Huavei ", "China ", 13000, "boked ");

            Arrays.stream(product).forEach(Product::printInfo);

            Park park = new Park("Планета", "ул. Николая Островского 148");
            Park.Attraction bigwheel = park.new Attraction("Большое Колесо", "C 9:00 - 20:00", "150 rub");
            bigwheel.printInfo();


        }
    }





