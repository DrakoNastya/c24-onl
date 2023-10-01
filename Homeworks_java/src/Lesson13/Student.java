package Lesson13;

import java.util.List;
import java.util.ArrayList;

public class Student {

    //Задача 3:
    //Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
    //оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
    //Написать метод, который удаляет студентов со средним баллом <3. Если средний
    //балл>=3, студент переводится на следующий курс. Дополнительно написать метод
    //printStudents(List<Student> students, int course), который получает список студентов и
    //номер курса. А также печатает на консоль имена тех студентов из списка, которые
    //обучаются на данном курсе.
    private String name;
    private int course;
    private int group;
    private List<Integer> subjectGrades = new ArrayList<>();


    public Student(String name, int course, int group, int... subjectGrades) {
        this.name = name;
        this.course = course;
        this.group = group;
        for (int subjectGrade : subjectGrades) {
            this.subjectGrades.add(subjectGrade);
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }


    public List<Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void newCourse() {
        System.out.println("Student transferred to a new course");
        course++;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int subgectGrade : subjectGrades) {
            sum += subgectGrade;

        }
        return (double) sum / subjectGrades.size();
    }


    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + ", group=" + group + '}';
    }
}