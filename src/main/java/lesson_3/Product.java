package lesson_3;

public class Product {
        private String name;
        private String productionDate;
        private String manufacturer;
        private String country;
        private int price;
        private String booking;
        public Product(String name, String productionDate,String manufacturer,String country, int price,String booking){
            this.name = name;
            this.productionDate = productionDate;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.booking = booking;
        }
        public void printInfo(){
          System.out.printf("Название: %s \n Дата производства: %s \n Производитель: %S \n Страна: %S \n Цена: %s \n Бронь: %s \n" ,
                  name, productionDate, manufacturer, country, price, booking);
            System.out.println();
        }
    }

