package lesson_3;

public class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public class Attraction {
        private String nameAttraction;
        private String workTime;
        private String price;

        public Attraction(String nameAttraction, String workTime, String price) {
            this.nameAttraction = nameAttraction;
            this.workTime = workTime;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название атракциона:" + nameAttraction);
            System.out.println("Время работы: " + workTime);
            System.out.println("Стоимость:  " + price);


        }
    }
}















