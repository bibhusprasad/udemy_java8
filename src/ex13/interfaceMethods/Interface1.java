package ex13.interfaceMethods;

public interface Interface1 {

    default void methodA(){
        System.out.println("Inside Interface1 methodA");
    }
}
