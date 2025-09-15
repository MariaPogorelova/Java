package overloading_methods;

public class ex_4 {
    static class A {}
    static class B extends A {}
    public static class OverloadInheritance {
        public void test(A a) { System.out.println("test(A)"); }
        public void test(B b) { System.out.println("test(B)"); }
        public static void main(String[] args) {
            OverloadInheritance o = new OverloadInheritance();
            A a = new B(); // переменная типа A, объект типа B
            o.test(a); // ВЫЗОВИТСЯ test(A) — выбор по типу переменной(compile-time)
            o.test(new B()); // test(B)
        }
    }
}
