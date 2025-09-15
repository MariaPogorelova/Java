public class pz_2 {
    public static class StudentOverload {
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        public StudentOverload(String firstName, String lastName, String gender,
                               int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.age = age;
        }
        // 1) без параметров
        public void printInfo() {
            System.out.println(lastName + " " + firstName);
        }
        // 2) подробный/краткий
        public void printInfo(boolean detailed) {
            if (detailed) {
                System.out.println(lastName + " " + firstName + ", " + gender + ", " + age);
            } else {
                printInfo(); // повторно используем другой метод
            }
        }
        // 3) с префиксом
        public void printInfo(String prefix) {
            System.out.println(prefix + ": " + lastName + " " + firstName);
        }
        public static void main(String[] args) {
            StudentOverload s = new StudentOverload("Jhon", "Smith", "М", 20);
            s.printInfo(); // вызов №1
            s.printInfo(true); // вызов №2 — подробный
            s.printInfo("Студент"); // вызов №3\
            s.study();
            s.study("Математика");
            s.study(2);
        }
        public void study() {
            System.out.println(getFullName() + " учится.");
        }
        public void study(String subject) {
            System.out.println(getFullName() + " изучает " + subject + ".");
        }
        public void study(int hours) {
            System.out.println(getFullName() + " учится " + hours + " часов.");
        }
        private String getFullName() {
            return lastName + " " + firstName;
        }
    }
}
