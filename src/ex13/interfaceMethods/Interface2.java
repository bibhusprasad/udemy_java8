package ex13.interfaceMethods;

public interface Interface2 extends Interface1{

    default void methodB(){
        System.out.println("Inside Interface2 methodB");
    }

    default void methodA(){
        System.out.println("Inside Interface2 methodA");
    }
}
