package homeworks.books.models;

public class Registration {
    private String name;
    private String surname;
    private int years;
    private String username;
    private String password;

    public Registration(String name, String surname, int years, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.years = years;
        this.username = username;
        this.password = password;
    }

    public Registration() {
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", years=" + years +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
