package Ch05;

import java.util.Scanner;

public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열 bingo 값 채우기 (1 ~ 25)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bingo[i][j] = i*SIZE + j + 1;
            }
        }

        // 배열에 저장된 값을 뒤섞기 (shuffle)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE); // 0-4
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE * SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp); // 입력받은 문자열 tmp -> 숫자로 변환

            outer:
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer; // 2중 반복문 break
                    }
                }
            }

        } while (num != 0);

    }
}
