public class MyClass0 {
    public static void main(String[] args) {
        MyInterface0 mio = () -> {
            return "Software Engineer";
        };
        System.out.println(mio.getName()); 
    }
}
