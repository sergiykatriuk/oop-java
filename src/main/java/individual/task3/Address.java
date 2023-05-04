package individual.task3;

import java.io.Serializable;

public class Address implements Serializable {

    private final Integer postCode;
    private final String city;
    private final String street;

    public Address(Integer postCode, String city, String street) {
        this.postCode = postCode;
        this.city = city;
        this.street = street;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode=" + postCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
