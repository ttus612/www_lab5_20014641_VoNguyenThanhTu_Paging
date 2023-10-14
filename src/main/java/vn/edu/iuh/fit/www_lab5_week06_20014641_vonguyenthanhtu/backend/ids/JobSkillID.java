package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.ids;

import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Job;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Skill;

import java.io.Serializable;

public class JobSkillID implements Serializable {
    private Skill skill;
    private Job job;

    public JobSkillID() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkillID that = (JobSkillID) o;
        if (!skill.equals(that.skill)) return false;
        return job.equals(that.job);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + job.hashCode();
        return result;
    }
}
