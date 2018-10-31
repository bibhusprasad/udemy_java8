package ex12.optional;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Optional;

public class $01_OptionalExample {

    static String getStudentName(){
        //Student student = StudentDatabase.stdSupplier.get(); //OP: Name is : Adam
        Student student = null; //OP: Name is not present.
        if(null != student){
            return student.getName();
        }
        return null;
    }

    static Optional<String> getStudentNameOptional(){
        Optional<Student> stdOptional = Optional.ofNullable(StudentDatabase.stdSupplier.get());
        if(stdOptional.isPresent()){
            return stdOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if(null != name){
            System.out.println("Name is : "+ name);
        } else {
            System.out.println("Name is not present.");
        }

        Optional<String> nameOptional = getStudentNameOptional();
        if(nameOptional.isPresent()){
            System.out.println("Name Optional : "+nameOptional.get());
        }else{
            System.out.println("Name is not present.");
        }

    }
}
