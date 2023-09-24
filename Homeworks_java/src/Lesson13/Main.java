package Lesson13;

import java.util.List;

public class Main  {
    public static void main(String[] args) {
       StudentList studentList = new StudentList();
        studentList.addStudent("Bob", 1, "5", new int[]{2, 1, 3});
        studentList.addStudent("Tom", 3, "1", new int[]{8, 8, 7});
        studentList.addStudent("Mary", 2, "2", new int[]{9, 6, 9});
        System.out.println(studentList);
        studentList.newCourse();
        System.out.println(studentList);

    }
}
