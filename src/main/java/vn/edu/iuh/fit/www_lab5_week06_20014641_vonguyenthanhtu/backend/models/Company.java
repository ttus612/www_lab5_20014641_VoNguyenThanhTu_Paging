package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;

    @Column(name = "comp_name", nullable = false)
    private String name;

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "web_url")
    private String webURL;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

}
