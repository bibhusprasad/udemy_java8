package ex11.parallelStream;

public class Sum {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSome(int input){
        total += input;
    }
}
