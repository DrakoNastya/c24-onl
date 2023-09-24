package Lesson13;
import java.util.ArrayList;
import java.util.List;

public class StudentList extends Student{


    public StudentList() {

    }

    public class StudentsList {
        private List<StudentList> list = new ArrayList<>();

        public List<StudentList> getList() {
            return list;
        }

        public void addStudent(StudentList student) {
            list.add(student);
        }
        public void studentCourse() {
            for (int i = 0; i < list.size(); ) {
                if (3 > list.get(i).getAverageScore()) {
                    list.remove(i);
                } else {
                    list.get(i).newCourse();
                    i++;
                }
            }
        }

        public void printStudents(int course) {
            for (StudentList student : list) {
                if (student.getCourse() == course) {
                    System.out.println(student);
                }

            }
        }

    }

}
