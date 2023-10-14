package vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.www_lab5_week06_20014641_vonguyenthanhtu.backend.services.CandidateServices;

@RestController
@RequestMapping(path = "/${app.rest.path}")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
//    @GetMapping(path = "/candidate")
//    public String beat(){
//        return "OK ưef";
//    }

}
