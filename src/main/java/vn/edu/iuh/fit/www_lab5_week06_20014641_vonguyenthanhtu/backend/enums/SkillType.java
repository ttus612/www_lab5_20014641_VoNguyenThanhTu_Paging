package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.enums;

public enum SkillType {
    UNSPECIFIC(0),
    TECHNICAL_SKILL(1),
    SOFT_SKILL(2);

    private int value;
    SkillType(int value) {
        this.value = value;
    }
}
