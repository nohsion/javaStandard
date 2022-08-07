package Ch09;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb1 = new StringBuffer("abc");

        System.out.println("sb == sb1 ? " + (sb == sb1));
        System.out.println("sb.equals(sb1) ? " + (sb.equals(sb1)));

        String s = sb.toString();
        String s1 = sb1.toString();

        System.out.println("s.equals(s1) ? " + s.equals(s1));
    }
}
