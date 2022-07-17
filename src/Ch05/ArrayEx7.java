package Ch05;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.printf("%d ", numArr[i]);
        }
        System.out.println();

        // 섞는 거를 <배열 길이 만큼!!> 반복 (위치 바꾸는 작업)
        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10); // 0~9 중 랜덤 값
            // 0번째와 n번째(랜덤 선택) 값을 스왑
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d ", numArr[i]);
        }
    }
}
