package ex13.interfaceMethods;

import ex00.studentdata.Student;
import ex00.studentdata.StudentDatabase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExampleNull {

    static Comparator<String> comparator = Comparator.naturalOrder();
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Jenny", "Emily", "Dave", "Sophia", "James", null);

        Comparator<String> nullFirstComparator = Comparator.nullsFirst(comparator);
        names.sort(nullFirstComparator);
        System.out.println(names);//Op: [null, Adam, Dave, Emily, James, Jenny, Sophia]

        Comparator<String> nullLastComparator = Comparator.nullsLast(comparator);
        names.sort(nullLastComparator);
        System.out.println(names); //OP: [Adam, Dave, Emily, James, Jenny, Sophia, null]

    }
    //OP:

}
