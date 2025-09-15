package overloading_methods;

public class pz_3 {
    public static class ShowExample {
        public void show(Object o) { System.out.println("Object"); }
        public void show(String s) { System.out.println("String"); }
        public void show(Integer i) { System.out.println("Integer"); }
        public static void main(String[] args) {
            ShowExample ex = new ShowExample();
            ex.show("hello"); // String (точное соответствие)
            ex.show(new Object()); // Object
            ex.show(10); // Integer (auto-boxing int -> Integer)
            // ex.show(null); // КОМПИЛЯЦИЯ: ambiguous if both String and Integer подходят?
        }
    }
}
