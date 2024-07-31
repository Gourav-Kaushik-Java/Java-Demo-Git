import java.util.function.Predicate;

public class MyClass3 {
    public static void main(String[] args) {
        Student s1 = new Student("Vipul", 1);
        Student s2 = new Student("Ram", 2);
        Predicate<Student> studentpredicate = x -> x.getId() > 1;
        System.out.println(studentpredicate.test(s1));
        System.out.println(studentpredicate.test(s2));
    }

    private static class Student{
        String name;
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        int id;
        @SuppressWarnings("unused")
        public String getName() {
            return name;
        }
        @SuppressWarnings("unused")
        public void setName(String name) {
            this.name = name;
        }
        public int getId() {
            return id;
        }
        @SuppressWarnings("unused")
        public void setId(int id) {
            this.id = id;
        }
        
    }
}
