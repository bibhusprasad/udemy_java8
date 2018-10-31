package ex03.functionalInterface.function;

public class $01_FunctionExample1 {

    static String performConcate(String str){
        return $01_FunctionExample.addSome.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcate(" main");
        System.out.println(result);//OP: MAIN java8
    }
}
