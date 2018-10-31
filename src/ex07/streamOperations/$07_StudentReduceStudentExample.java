package ex07.streamOperations;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Optional;

public class $07_StudentReduceStudentExample {

    public static Optional<Double> getTotalGpa(){
        return StudentDatabase.getAllStudentDetails().stream()
                .map(Student::getGpa)
                .reduce((student1, student2) -> student1 + student2);
    }

    public static Optional<Student> getHighestGpa(){
        /*return StudentDatabase.getAllStudentDetails().stream()
                .reduce((s1, s2) -> {
                    if(s1.getGpa() > s2.getGpa())
                        return s1;
                    else
                        return s2;
                });*/
        return StudentDatabase.getAllStudentDetails().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }


    public static void main(String[] args) {
        System.out.println(getTotalGpa().get()); //OP: 22.7
        System.out.println(getHighestGpa().get());
        //OP: Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics]}

    }
}
