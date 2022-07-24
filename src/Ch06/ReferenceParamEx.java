package Ch06;

class ReferenceData {
    int x;
}

public class ReferenceParamEx {
    public static void main(String[] args) {
        ReferenceData d = new ReferenceData();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(ReferenceData d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
