import java.util.function.*;

public class FunctionalInterfaceMain {
    public interface MyFunctionalInterface {
        public void execute();
    }

    public static class AddThree implements Function<Long, Long> {
        @Override
        public Long apply(Long a) {
            return a + 3;
        }
    }
    public static class CheckForNull implements Predicate {

        @Override
        public boolean test(Object o) {
            return o != null;
        }
    }

    public static class Person{
        private String name;
        private int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String toString(){
            return "Name: " + name + " Age: " + age;
        }
    }
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = () -> {
            System.out.println("Hello World");
        };
        myFunctionalInterface.execute();

        Function<Long, Long> adder = new AddThree();
        System.out.println(adder.apply(100L));

        Predicate checker = new CheckForNull();
        System.out.println(checker.test(null));

        UnaryOperator<Person> personUnaryOperator = (Person p) -> {p.name="New Name"; return p;};
        Person p = new Person("Old Name", 20);
        System.out.println(p);
        System.out.println(personUnaryOperator.apply(p));
        System.out.println(p);

        Supplier<Integer> supplier = () -> {return 10;};
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (Integer i) -> {System.out.println(i);};
        consumer.accept(101);
    }
}
