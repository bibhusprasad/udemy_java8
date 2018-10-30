package ex13.interfaceMethods;

public class InterfaceImpl14 implements Interface1, Interface4 {

    public void methodA(){
        System.out.println("Inside InterfaceImpl114 methodA");
    }

    public static void main(String[] args) {
        InterfaceImpl14 interfaceImpl = new InterfaceImpl14();
        interfaceImpl.methodA(); //OP: Inside Interface2 methodA
    }
}
