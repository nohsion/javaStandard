package Ch07;

class SuperTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
