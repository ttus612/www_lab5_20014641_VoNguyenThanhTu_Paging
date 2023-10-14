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
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;

    @Column(name = "job_name", nullable = false)
    private String name;

    @Column(name = "job_dec", length = 2000, nullable = false)
    private String description;
    //====================RELATIONSHIS=================
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;

}
