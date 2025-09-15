//Вариант 3. Класс «Пациент» и его возможные свойства: фамилия+; имя+;
//отчество+; пол+; национальность+; рост+; вес+; дата рождения (год, месяц, число)+;
//номер телефона+; домашний адрес (почтовый индекс, страна, область, район, город, улица, дом, квартира)+;
//номер больницы+; отделение+; номер медицинской карты+; диагноз+; группа крови.

public class Main {

    interface PatientAction {
        void printInfo();

        String getFullName();
        int getAge();
        String getGender();
        String getDiagnosis();
        void GetPatientStatus();
        void DonateBlood();
    }
    //-------класс Пациент ------//
    class Patient implements PatientAction{
        private String lastName;
        private String firstName; // имя
        private String middleName; // отчество
        private String gender;
        private int age;
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
        private boolean canDonateBlood;

        public Patient(String lastName,String firstName,String middleName,String gender,int age,
                       String nationality,int height,int weight,String birthDate,String phone,
                       String address,String hospital,String department,int numberMedCard,String diagnosis,String bloodType) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.gender = gender;
            this.age = age;
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
            this.canDonateBlood = true;
        }

        @Override
        public String getFullName() {
            return lastName + " " + firstName + " " + middleName;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public String getGender() {
            return gender;
        }

        @Override
        public String getDiagnosis() {
            return diagnosis;
        }
        @Override
        public void printInfo() {
            System.out.println(getFullName() +
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

        @Override
        public void GetPatientStatus() {
            System.out.println("===СТАТУС ПАЦИЕНТА===");
            System.out.println("ФИО: "  + getFullName());
            System.out.println("Возраст: "  + getAge() + " лет");
            System.out.println("Пол: "  + getGender());
            System.out.println("Рост: "  + height);
            System.out.println("Вес: "  + weight);

        }

        @Override
        public void DonateBlood() {

        }

    }

}




