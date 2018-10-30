package ex13.interfaceMethods;

public class InterfaceImpl123 implements Interface1, Interface2, Interface3 {

    public static void main(String[] args) {
        InterfaceImpl123 interfaceImpl = new InterfaceImpl123();
        interfaceImpl.methodA(); //OP: Inside Interface2 methodA
        interfaceImpl.methodB(); //OP: Inside Interface2 methodB
        interfaceImpl.methodC(); //OP: Inside Interface3 methodC

    }
}
