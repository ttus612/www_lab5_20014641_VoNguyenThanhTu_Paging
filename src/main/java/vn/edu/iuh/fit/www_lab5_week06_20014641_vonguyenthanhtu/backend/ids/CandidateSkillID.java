package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.ids;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Skill;

import java.io.Serializable;

public class CandidateSkillID implements Serializable {
    private Skill skill;
    private Candidate candidate;

    public CandidateSkillID() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkillID that = (CandidateSkillID) o;
        if (!skill.equals(that.skill)) return false;
        return candidate.equals(that.candidate);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + candidate.hashCode();
        return result;
    }
}
