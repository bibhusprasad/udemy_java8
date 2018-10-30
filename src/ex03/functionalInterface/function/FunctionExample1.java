package ex03.functionalInterface.function;

public class FunctionExample1 {

    static String performConcate(String str){
        return FunctionExample.addSome.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcate(" main");
        System.out.println(result);//OP: MAIN java8
    }
}
