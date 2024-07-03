public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int no) {
        if (no < 2) {
            return no;
        }

        return fibo(no - 1) + fibo(no - 2);
    }
}
