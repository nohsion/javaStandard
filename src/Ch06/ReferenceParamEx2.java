package Ch06;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = { 10 }; // int 배열타입의 참조변수
        System.out.println("main() : x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}
