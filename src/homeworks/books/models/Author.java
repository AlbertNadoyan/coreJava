package homeworks.books.models;

import homeworks.books.Gender;

public class Author {
    private String  authorName;
    private String nationality;
    private Gender gender;
    private String email;
    private String birthDay;
    private String placeOfBirth;
    private String dateOfDeath;

    public Author(String authorName, String nationality, Gender gender, String email, String birthDay, String placeOfBirth, String dateOfDeath) {
        this.authorName = authorName;
        this.nationality = nationality;
        this.gender = gender;
        this.email = email;
        this.birthDay = birthDay;
        this.placeOfBirth = placeOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public Author() {
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfDeath='" + dateOfDeath + '\'' +
                '}';
    }
}
