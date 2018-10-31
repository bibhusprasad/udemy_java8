package ex12.optional;

import ex00.studentdata.Bike;
import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Optional;

public class $05_OptinalMapFlatMapFilterExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.stdSupplier.get());
        studentOptional.filter(std -> std.getGpa() >= 3.5).ifPresent(System.out::println);
    }

    //map
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.stdSupplier.get());
        Optional<String> name = studentOptional
                .filter(std -> std.getGpa() >= 3.5)
                .map(Student::getName);
        System.out.println(name);
    }

    //flatMap
    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.stdSupplier.get());
        Optional<String> bikeName = studentOptional
                .filter(std -> std.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        System.out.println(bikeName.get());
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
