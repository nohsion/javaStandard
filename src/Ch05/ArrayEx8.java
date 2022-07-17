package Ch05;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 로또 번호 45개

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }
        int temp = 0;
        int j = 0;

        // i번째와 j번째(임의 선택) 스왑하기
        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 0~44 중 임의의 값
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 배열 ball 앞에서부터 6개 요소는 랜덤한 값
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
