package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
