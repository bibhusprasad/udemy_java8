package ex00.studentdata;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> stdSupplier = () -> {
        Bike bike = new Bike("Bajaj", "avenger220");
        Student student = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        student.setBike(Optional.ofNullable(bike));
        return student;
    };

    public static List<Student> getAllStudentDetails(){

        /*
         * 2nd Grade Student
         */
        Student std1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 11);
        Student std2 = new Student("Jenny", 2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer"), 12);

        /*
         * 3rd Grade Student
         */
        Student std3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics"), 10);
        Student std4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("swimming", "gymnastics", "soccer"), 9);

        /*
         * 4th Grade Student
         */
        Student std5 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("swimming", "dancing", "football"), 15);
        Student std6 = new Student("James", 4, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball"), 14);

        return Arrays.asList(std1, std2, std3, std4, std5, std6);
    }
}
