package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentLinkedList = new ArrayList();

    public List<Student> getList() {
        return studentLinkedList;
    }

    public void add(Student student) {
        studentLinkedList.add(student);
    }

    public void studentCourse() {
        for (int i = 0; i < studentLinkedList.size(); ) {
            if (3 > studentLinkedList.get(i).getAverageScore()) {
                studentLinkedList.remove(i);
            } else {
                studentLinkedList.get(i).newCourse();
                i++;
            }
        }
    }

    public void printStudents(int course) {
        for (Student student : studentLinkedList) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : studentLinkedList) {
            sb.append(student).append(", ");
        }
        return sb.toString();
    }

}

