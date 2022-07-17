package Ch05;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // abc와 num 배열을 합친 result 배열 생성
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // abc를 num 첫번째 위치부터 해서 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // abc를 num 인덱스 6부터 3만큼 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
