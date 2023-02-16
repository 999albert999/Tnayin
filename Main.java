import model.Student;
import service.FileService;
import service.StudentService;

import java.util.Arrays;

public class Main {
    public static final String URL = "C:\\Users\\Albert\\IdeaProjects\\lesson\\src\\data\\cucak.txt";
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(FileService.read(URL)));
        Student[] students = StudentService.createStudents(FileService.read(URL));
        for (Student x: students) {
            System.out.println(x);
        }
        StudentService.oldestStudent(students);
        System.out.println();
        System.out.println(StudentService.sortStudents(students));
    }
}
