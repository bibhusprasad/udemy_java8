package ex13.interfaceMethods;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("Inside Interface3 methodC");
    }
}
