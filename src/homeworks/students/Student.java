package homeworks.students;

public class Student {
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String phoneNumber;
    private String city;
    private String lesson;

    public Student(String name, String surname, String gender, int age, String phoneNumber, String city, String lesson) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
