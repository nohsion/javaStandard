package Ch06;

class RefRetData {
    int x;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        RefRetData d = new RefRetData();
        d.x = 10;

        RefRetData d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static RefRetData copy(RefRetData data) {
        RefRetData tmp = new RefRetData();
        tmp.x = data.x;

        return tmp; // copy메서드 내에서 생성한 인스턴스를 main메서드에서 사용하기 위해서는 주소를 반환해줘야 한다.
    }
}
