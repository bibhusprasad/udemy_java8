package ex13.interfaceMethods;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> c1 = System.out::println;
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> stdList){
        System.out.println("After sort by name.");
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
        stdList.sort(studentComparator);
    }

    public static void sortByGpa(List<Student> stdList){
        System.out.println("After sort by gpa.");
        Comparator<Student> studentComparator = Comparator.comparingDouble(Student::getGpa);
        stdList.sort(studentComparator);
    }

    public static void comparatorChaining(List<Student> stdList) {
        System.out.println("comparator chaining.");
        stdList.sort(gradeComparator.thenComparing(nameComparator));
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudentDetails();
        studentList.forEach(c1);
        sortByName(studentList);
        studentList.forEach(c1);
        sortByGpa(studentList);
        studentList.forEach(c1);
        comparatorChaining(studentList);
        studentList.forEach(c1);
    }

    //OP:
    /*
    Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11, bike=Optional.empty}
    Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12, bike=Optional.empty}
    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10, bike=Optional.empty}
    Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9, bike=Optional.empty}
    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15, bike=Optional.empty}
    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14, bike=Optional.empty}
    After sort by name.
    Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11, bike=Optional.empty}
    Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9, bike=Optional.empty}
    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10, bike=Optional.empty}
    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14, bike=Optional.empty}
    Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12, bike=Optional.empty}
    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15, bike=Optional.empty}
    After sort by gpa.
    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15, bike=Optional.empty}
    Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11, bike=Optional.empty}
    Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12, bike=Optional.empty}
    Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9, bike=Optional.empty}
    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14, bike=Optional.empty}
    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10, bike=Optional.empty}
    comparator chaining.
    Student{name='Adam', gradeLevel=2, gpa=3.6, gender='male', activities=[swimming, basketball, volleyball], noteBooks=11, bike=Optional.empty}
    Student{name='Jenny', gradeLevel=2, gpa=3.8, gender='female', activities=[swimming, gymnastics, soccer], noteBooks=12, bike=Optional.empty}
    Student{name='Dave', gradeLevel=3, gpa=3.9, gender='male', activities=[swimming, gymnastics, soccer], noteBooks=9, bike=Optional.empty}
    Student{name='Emily', gradeLevel=3, gpa=4.0, gender='female', activities=[swimming, gymnastics, aerobics], noteBooks=10, bike=Optional.empty}
    Student{name='James', gradeLevel=4, gpa=3.9, gender='male', activities=[swimming, basketball, baseball], noteBooks=14, bike=Optional.empty}
    Student{name='Sophia', gradeLevel=4, gpa=3.5, gender='female', activities=[swimming, dancing, football], noteBooks=15, bike=Optional.empty}
     */
}
