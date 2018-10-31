package ex12.optional;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Optional;

public class $03_OptionalOrElseExample {

    public  static String orElse(){
        //Optional<Student> student = Optional.ofNullable(StudentDatabase.stdSupplier.get()); //OP: orElse : Adam
        Optional<Student> student = Optional.empty();//OP: orElse : Bibhu
        return student.map(Student::getName).orElse("Bibhu");
    }

    public  static String orElseGet(){
        //Optional<Student> student = Optional.ofNullable(StudentDatabase.stdSupplier.get()); //OP: orElse : Adam
        Optional<Student> student = Optional.empty();//OP: orElse : Bibhu
        return student.map(Student::getName).orElseGet(() -> "Bibhu");
    }


    public  static String orElseThrow(){
        //Optional<Student> student = Optional.ofNullable(StudentDatabase.stdSupplier.get()); //OP: orElse : Adam
        Optional<Student> student = Optional.empty();//OP: orElse : Bibhu
        return student.map(Student::getName).orElseThrow(() -> new NullPointerException());
    }

    public static void main(String[] args) {
        System.out.println("orElse : "+orElse());
        System.out.println("orElseGet : "+orElseGet());
        System.out.println("orElseGet : "+orElseThrow());
    }
}
