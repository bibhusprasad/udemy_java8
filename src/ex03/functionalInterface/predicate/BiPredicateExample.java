package ex03.functionalInterface.predicate;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >=3 && gpa >= 3.8;

    BiConsumer<String, List<String>> biConsumer = (s, strings) -> System.out.println("name : "+ s +" - activity :"+ strings);

    Consumer<Student> consumer = student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> stdList){
        stdList.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        new BiPredicateExample().printNameAndActivities(stdList);

        //OP:
        /*
        name : Emily - activity :[swimming, gymnastics, aerobics]
        name : Dave - activity :[swimming, gymnastics, soccer]
        name : James - activity :[swimming, basketball, baseball]
         */
    }
}
