package Lesson13;
public class Task3 {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("Bob", 1, 5, 2, 1, 2));
        studentList.add(new Student("Tom", 3, 1, 10, 10, 10, 10));
        studentList.add(new Student("Mary", 2, 3, 9, 8, 6));
        System.out.println(studentList);
        studentList.printStudents(2);
        studentList.studentCourse();
        System.out.println(studentList);

    }

}
