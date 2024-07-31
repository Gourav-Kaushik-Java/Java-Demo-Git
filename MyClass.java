import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    public static void main(String[] args){
       Student s1 = new Student(2,"Vipul");
       Student s2 = new Student(3,"Raj");
       Student s3 = new Student(33,"Akshit");
       List<Student> li = new ArrayList<>();
       li.add(s1);
       li.add(s2);
       li.add(s3);
       Collections.sort(li, (a,b) -> b.id - a.id);
       System.out.println(li);
    }

    static class Student{
        public Integer id;
        public String name;
        public Student(Integer id, String name){
            this.id = id;
            this.name = name;
        }

        public String toString(){
            return this.id + " : " + this.name;
        }
    }
} 