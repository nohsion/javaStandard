package Ch06;

class BlockTest {
    static {
        System.out.println("static 클래스 초기화 { }");
    }
    {
        System.out.println("인스턴스 초기화 { }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest blockTest = new BlockTest();
        System.out.println("BlockTest bt1 = new BlockTest(); ");
        BlockTest blockTest1 = new BlockTest();
    }
}
