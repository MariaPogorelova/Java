package overloading_methods;

public class ex2 {
    public static class SimpleStudent {
        private String firstName;
        private String lastName;
        private int age;
        // Конструктор 1: полный
        public SimpleStudent(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        // Конструктор 2: без возраста (age по умолчанию 0)
        public SimpleStudent(String firstName, String lastName) {
            this(firstName, lastName, 0); // вызов другого конструктора
        }
        // Конструктор 3: пустой
        public SimpleStudent() {
            this("Имя", "Фамилия", 0);
        }
        public String getFullName() {
            return lastName + " " + firstName;
        }
        public int getAge() {
            return age;
        }
        public static void main(String[] args) {
            SimpleStudent s1 = new SimpleStudent("Аня", "Петрова", 18);
            SimpleStudent s2 = new SimpleStudent("Иван", "Сидоров");
            SimpleStudent s3 = new SimpleStudent();
            System.out.println(s1.getFullName() + ", " + s1.getAge());
            System.out.println(s2.getFullName() + ", " + s2.getAge());
            System.out.println(s3.getFullName() + ", " + s3.getAge());
        }
    }
}
