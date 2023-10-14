package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.enums.SkillLevel;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.ids.CandidateSkillID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_skill")
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

}
