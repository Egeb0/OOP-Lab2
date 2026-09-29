package Q4;

public class FamilyTest {

    public static void main(String[] args){

        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println(m.getFirstName());

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println(f.getFirstName());

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName());

        Child c = new Child(10, 150, 36);
        c.setGuardian(m);

        m.setChild(c);
        f.setChild(c);

        System.out.println(c.getGuardian().getFirstName());
        System.out.println(m.getChild() == c);
        System.out.println(f.getWife() == m);
    }
}
