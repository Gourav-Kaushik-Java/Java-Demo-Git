public class MyClass1 {
    public static void main(String[] args) {
        MyInterface1 mi = new MyInterface1() {

            @Override
            public String getSalary() {
                return "10";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
            
        };
        System.out.println(mi.getSalary());
        System.out.println(mi.getDesignation());
    }
}
