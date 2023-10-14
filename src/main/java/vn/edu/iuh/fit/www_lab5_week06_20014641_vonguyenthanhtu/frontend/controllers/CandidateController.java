package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.services.CandidateServices;

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
}
