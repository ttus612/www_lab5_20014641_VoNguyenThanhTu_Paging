package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "dob", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate dob;

    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    @Column(name = "phone", nullable = false, length = 15, unique = true)
    private String phone;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    //  ==========================RELATIONSHIP====================================
    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<CandidateSkill> candidateSkills;

    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email, List<Experience> experiences, List<CandidateSkill> candidateSkills) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.experiences = experiences;
        this.candidateSkills = candidateSkills;
    }

    public Candidate(String fullName, LocalDate dob, Address address, String phone, String email) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
