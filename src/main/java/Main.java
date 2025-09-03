import lesson_6.Phonebook;
import lesson_6.Student;

import java.util.ArrayList;
import java.util.Arrays;


 Lesson_6
    public static void main(String[] args) {

        Student Alex = new Student("Alex", 51, 1, new int[]{3, 2, 4, 5, 3,2});
        Student Tom = new Student("Tom",51,1,new int[]{3, 4, 4, 4, 4, 5});
        Student Sam = new Student("Sam",51,1,new int[]{2, 2, 3, 3, 3, 2});
        Student Jerri = new Student("Jerri", 51,1, new int[]{5,4,4,5,3,4});

        ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(Alex,Tom,Sam,Jerri));

        Student.printStudent(arrayList,3);

        Student.dellStudent(arrayList);
        Student.print(arrayList);


        Phonebook.add("Орлов", "89632541122");
        Phonebook.add("Сидоров" , "89641234569");
        Phonebook.add("Орлов", "89547896111");
        Phonebook.add("Петухов" , "89571478523");
        Phonebook.get("Орлов");
        Phonebook.get("Сидоров");
        Phonebook.get("Смирнов");



    }

}
=======
 master


