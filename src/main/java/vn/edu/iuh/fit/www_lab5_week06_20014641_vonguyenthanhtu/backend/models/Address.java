package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "zipcode", length = 7)
    private String zipCode;

    @Column(name = "country", length = 30)
    private CountryCode country;


    public Address(String number, String street, String city, String zipCode, CountryCode country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return number + ", " + street + ", " + city + ", " + zipCode + ", " + country.getName();
    }
}
