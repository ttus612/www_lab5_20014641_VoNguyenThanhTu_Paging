package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;

    @Column(name = "company", nullable = false, length = 120)
    private String companyName;

    @Column(name = "from_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fromDate;

    @Column(name = "to_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate toDate;

    @Column(name = "role", nullable = false, length = 100)
    private String role;

    @Column(name = "work_desc", nullable = false, length = 400)
    private String workDescription;

    //  ==========================RELATIONSHIP====================================
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

}
