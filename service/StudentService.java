package service;

import com.sun.tools.javac.Main;
import model.Student;

import java.util.Arrays;
import java.util.StringJoiner;

public class StudentService {
    public static Student[] createStudents(String[] data, String url) throws Exception {
        Student [] students = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            students[i] = new Student(data[i]);
        }
        return students;
    }

    public static void oldestStudent(Student[] students) {
        Student oldest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAge() > oldest.getAge()) {
                oldest = students[i];
            }
        }
        System.out.println("Oldest student is - " + oldest);
    }

    public static String sortStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                Student temp = null;
                if (students[j - 1].getAge() > students[j].getAge()) {
                    temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
        String sorted = students[0].toString();
        for (int i = 1; i < students.length; i++) {
            sorted = sorted + " " + students[i].toString() + " ";
        }
        return sorted;
    }
    public static void newFile(Student[] students) throws Exception{
        StringJoiner sj = new StringJoiner("");
        for (Student x:students) {
            sj.add(x.getName());
            sj.add(".txt");
            String url = sj.toString();
            FileService.write(url,x.toString());
        }
    }
}
