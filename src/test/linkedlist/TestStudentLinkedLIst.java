package test.linkedlist;

import com.kizhaku.learn.dsa.linkedlist.StudentLinkedList;
import com.kizhaku.learn.model.Student;

import java.util.List;

public class TestStudentLinkedLIst {

    public static void main(String[] args) throws IllegalAccessException {
        StudentLinkedList studentLinkedList = new StudentLinkedList();
        Student student1 = new Student("Arun", "1a", "Hindi");
        Student student2 = new Student("Kittu", "2a", "Mathematics");
        Student student3 = new Student("Ringo", "3a", "Science");

        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);

        List<Student> studentList = studentLinkedList.getAllNodes();

        studentList.forEach(x -> {
            System.out.println("Student id is: " +x.getId());
            System.out.println("Student name is: " +x.getName());
            System.out.println("Student course is: " +x.getCourse());
            System.out.println("-------------------------");
        });
    }
}
