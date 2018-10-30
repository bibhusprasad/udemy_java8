package ex03.functionalInterface.consumer;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static void printNameAndActivity(){
        BiConsumer<String, List<String>> biConsumer = (s, strings) -> System.out.println(s + strings);
        List<Student> stdList = StudentDatabase.getAllStudentDetails();
        stdList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a : " + a + " b : " + b);
        biConsumer.accept("bibhu", "java8"); //OP: a : bibhu b : java8

        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println("Multiple : "+ a*b);
        biConsumer1.accept(2,10); //OP: Multiple : 20

        printNameAndActivity();
        //OP:
        /*
        Adam[swimming, basketball, volleyball]
        Jenny[swimming, gymnastics, soccer]
        Emily[swimming, gymnastics, aerobics]
        Dave[swimming, gymnastics, soccer]
        Sophia[swimming, dancing, football]
        James[swimming, basketball, baseball]
         */
    }
}
