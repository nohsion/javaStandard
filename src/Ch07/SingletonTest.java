package Ch07;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}

class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();  --> Singleton() 은 private access 이므로 외부에서 접근 불가 (동일 클래스 내부에서만 가능)
        Singleton s = Singleton.getInstance();
    }
}
