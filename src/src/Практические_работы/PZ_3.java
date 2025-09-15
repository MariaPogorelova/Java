package Практические_работы;

public class PZ_3 {
//Вариант 3. Класс «Пациент» и его возможные свойства: фамилия+; имя+;
//отчество+; пол+; национальность+; рост+; вес+; дата рождения (год, месяц, число)+;
//номер телефона+; домашний адрес (почтовый индекс, страна, область, район, город, улица, дом, квартира)+;
//номер больницы+; отделение+; номер медицинской карты+; диагноз+; группа крови.
// ---------- КЛАСС ЧЕЛОВЕК ----------
    static class Person{
        private String lastName;
        private String firstName; // имя
        private String middleName; // отчество
        private String gender;
        private int age;
        // --------- КОНСТРУКТОР ---------
        public Person(String lastName, String firstName, String middleName, String gender, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.gender = gender;
            this.age = age;
        }

        public String getLastName() { return lastName; }
        public String getFirstName() { return firstName; }
        public String getMiddleName() { return middleName; }
        public String getGender() { return gender; }
        public int getAge() { return age; }

        public void printInfo() {
            System.out.println(lastName + " " + firstName + " " + middleName +
                    ", Пол: " + gender +
                    ", Возраст: " + age);
        }
    }

        //-------класс Пациент ------//
        static class Patient extends Person{
            private String nationality;
            private int height;
            private int weight;
            private String birthDate; // строка в формате "ГГГГ-ММ-ДД"
            private String phone;
            private String address;
            private String hospital;
            private String department;
            private int numberMedCard;
            private String diagnosis;
            private String bloodType;

            public Patient(String lastName,String firstName,String middleName,String gender,int age,
                   String nationality,int height,int weight,String birthDate,String phone,
                   String address,String hospital,String department,int numberMedCard,String diagnosis,String bloodType) {
                super(lastName,firstName,middleName,gender,age);
                this.nationality = nationality;
                this.height = height;
                this.weight = weight;
                this.birthDate = birthDate;
                this.phone = phone;
                this.address = address;
                this.hospital = hospital;
                this.department = department;
                this.numberMedCard = numberMedCard;
                this.diagnosis = diagnosis;
                this.bloodType = bloodType;
            }

            @Override
            public void printInfo() {
                System.out.println(getLastName() + " " + getFirstName() + " " + getMiddleName() +
                        ", Пол: " + getGender() +
                        ", Возраст: " + getAge() +
                        ", Национальность: " + nationality +
                        ", Рост: " + height +
                        ", Вес: " + weight +
                        ", Дата рождения: " + birthDate +
                        ", Номер телефона: " + phone +
                        ", Домашний адрес: " + address +
                        ", Название больницы: " + hospital +
                        ", Отделение: " + department +
                        ", Номер медицинской карты: " + numberMedCard +
                        ", Диагноз: " + diagnosis +
                        ", Группа крови: " + bloodType);
            }

        }


        public static void main(String[] args) {
            Patient[] patient = {
                    new Patient("Иванов", "Иван", "Иванович", "М", 25, "Русский", 170, 60,
                            "2000-12-12", "+7-111-222-33-44", "123456, Россия, Ростов-на-Дону, улица Садовая, д. 1, кв. 65",
                            "Больница №1", "Хирургическое", 12345, "Перелом руки", "2-ая +"),
                    new Patient("Петров", "Петр", "Петрович", "М", 65, "Русский", 180, 80,
                            "1960-12-12", "+7-111-222-33-44", "123456, Россия, Ростов-на-Дону, улица Пушкинская, д. 1, кв. 65",
                            "Больница №2", "Ожоговое", 12345, "Ожог руки", "2-ая -"),
                    new Patient("Соловьева", "Ирина", "Петровна", "Ж", 35, "Русский", 155, 50,
                            "1990-12-12", "+7-111-222-33-44", "123456, Россия, Ростов-на-Дону, улица Советская, д. 1, кв. 65",
                            "Поликлиника №1", "Стоматология", 12345, "Установка пломбы", "3-ая +"),
                    new Patient("Семенова", "Анна", "Ивановна", "Ж", 15, "Русский", 170, 60,
                            "2009-12-12", "+7-111-222-33-44", "123456, Россия, Ростов-на-Дону, улица Свободы, д. 1, кв. 65",
                            "Поликлиника №2", "Хирургическое", 12345, "Перелом ноги", "1-ая +"),

            };

            System.out.println("===ВСЕ ПАЦИЕНТЫ===");
            for (Patient p : patient) {
                p.printInfo();
            }

            System.out.println("\n=== ВЫБОРКА: пациенты в хирургическом отделении ===");
            for (Patient p : patient) {
                if(p.department.equals("Хирургическое")){
                    p.printInfo();
                }
            };

            System.out.println("\n=== ВЫБОРКА: пациенты старше 18 лет ===");
            for (Patient p : patient) {
                if(p.getAge() > 18){
                    p.printInfo();
                }
            }
        }
    }
