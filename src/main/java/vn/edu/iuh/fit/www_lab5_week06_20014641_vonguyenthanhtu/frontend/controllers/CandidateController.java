package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.services.CandidateServices;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/list")
    public String showCan(Model model){
        model.addAttribute("candidates",  candidateRepository.findAll());
        return "candidates/candidates";
    }

    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        Pageable pageable = PageRequest.of(page.orElse(0), size.orElse(10));
        Page<Candidate> candidates = candidateServices.findPaginated(pageable);
        model.addAttribute("candidates", candidates);
        return "candidates/candidates-paging";
    }
}
