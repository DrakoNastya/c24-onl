package Lesson13;

import java.util.ArrayList;
import java.util.List;

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
    private String group;
    private List<Integer> subjectGrades = new ArrayList<>();
private double averageScore;
    public Student(String name, int course, String group, int[] subjectGrades) {
        this.name = name;
        this.course = course;
        this.group = group;
        for (int subjectGrade : subjectGrades){
        this.subjectGrades.add(subjectGrade);}
    }

    public Student() {
    }

    public String addStudent(String name, int course, String group, int[] subjectGrades) {
        return "Name: " + name + ", course: " + course + ", group: " + group +", marks: " + subjectGrades;
    }
public  double averageScore(List<Integer> subjectGrades){
        double averageScore = 0;
        int counter = 0;
        for(int subjectGrade : subjectGrades){
            averageScore += subjectGrade;
            counter++;
        }
        averageScore = averageScore/ counter;
        return averageScore;

        }
    public  String newCourse(){
        if(averageScore >= 3){
            course++;
        }
        return "Student transferred to the next course, new course: " + course;
    }
    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public List<Integer> getSubjectGrades() {
        return subjectGrades;
    }

}



