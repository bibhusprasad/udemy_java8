package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

public class StreamMapReduceExample {

    public static int noOfNoteBook(){
        return StudentDatabase.getAllStudentDetails().stream()
                .filter(std -> std.getGradeLevel() >= 3)
                .filter(std -> std.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBook());
    }
}
