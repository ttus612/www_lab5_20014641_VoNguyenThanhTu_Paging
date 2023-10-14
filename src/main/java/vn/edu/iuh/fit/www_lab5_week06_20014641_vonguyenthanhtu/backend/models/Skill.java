package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.enums.SkillType;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;

    @Column(name = "skill_name", nullable = false, length = 150)
    private String skillName;

    @Column(name = "skill_type", nullable = false)
    private SkillType type;

    @Column(name = "skill_dec", nullable = false, length = 300)
    private String skillDescription;

    //  ==========================RELATIONSHIP====================================
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}
