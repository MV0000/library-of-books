package practise.lesson_10_srp.lessoncode.v1;

public class Trader {
    private String fullName;
    private String city;
    private String country;


    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }
}
