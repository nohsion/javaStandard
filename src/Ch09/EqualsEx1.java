package Ch09;

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person)
            return id == ((Person) obj).id;
        else return false;
    }

    Person(long id) {
        this.id = id;
    }
}
public class EqualsEx1 {
    public static void main(String[] args) {
        Person person1 = new Person(8080L);
        Person person2 = new Person(8080L);

        if (person1 == person2) {
            System.out.println("p1 = p2");
        } else {
            System.out.println("p1 != p2");
        }
        if (person1.equals(person2)) {
            System.out.println("p1의 id와 p2의 id는 같다.");
        } else {
            System.out.println("p1의 id와 p2의 id는 다르다.");
        }
    }
}
