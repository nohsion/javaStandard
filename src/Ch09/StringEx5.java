package Ch09;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class StringEx5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "가,나,다,라,마,바";

        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytes1 = str.getBytes("CP949");

        System.out.println("UTF8: " + joinByteArr(bytes));
        System.out.println("CP949: " + joinByteArr(bytes1));

        System.out.println("UTF8: " + new String(bytes, "UTF-8"));
        System.out.println("CP949: " + new String(bytes1, "CP949"));

    }

    static String joinByteArr(byte[] bytes) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bytes) {
            sj.add(String.format("%02X", b));
        }

        return sj.toString();
    }
}
