package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int course;
    private int [] estimation;

    public Student(String name, int group, int course, int[] estimation){
        this.name = name;
        this.group = group;
        this.course = course;
        this.estimation =estimation;
    }

    public int[] getEstimation(){
        return estimation;
    }

    public static  boolean CheckEstimation(int[]estimation){
        float average_score = ((Arrays.stream(estimation).sum())/(float)estimation.length);
        return average_score >=3;
    }
    public static void dellStudent(ArrayList<Student> students){
        int lengthOfStudents = students.size();
        int i = 0;
        while (i < lengthOfStudents){
            if(!Student.CheckEstimation(students.get(i).estimation)){
                students.remove(i);
                lengthOfStudents--;
                students.get(i).course++;
            }
        else i++;
        }
    }
    public static void printStudent(ArrayList<Student>students,int course){
        for(Student student : students){
            if(student.course == course){
                System.out.println(student.name);
            }
        }

    }
    public static void print(ArrayList<Student>students){
        for(Student student : students){
            System.out.println(student.name + " " + student.course);
        }
        System.out.println();
    }







}
