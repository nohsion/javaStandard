package Ch06;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("main 시작");
        firstMethod(); // 인스턴스 생성 없이도 메서드를 호출하려면 메서드 앞에 static 붙여야 한다.
        System.out.println("main 종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod() 시작");
        secondMethod();
        System.out.println("firstMethod() 종료");
    }

    static void secondMethod() {
        System.out.println("secondMethod() 시작");
        System.out.println("secondMethod() 종료");
    }
}
