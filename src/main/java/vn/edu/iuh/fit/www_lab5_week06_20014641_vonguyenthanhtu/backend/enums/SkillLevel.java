package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.enums;

public enum SkillLevel {
    MASTER(5),
    PROFESSIONAL(4),
    ADVANCED(3),
    IMTERMEDIATE(2),
    BEGINER(1);

    private int value;

    SkillLevel(int value) {
        this.value = value;
    }
}
