package com.vastika.managementsystem.controller;

import com.vastika.managementsystem.model.College;
import com.vastika.managementsystem.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/add_college")
    public String addCollege() {
        return "createCollege";
    }

    @GetMapping("/edit_college")
    public String editCollege(@RequestParam int id, Model model) {
        model.addAttribute("college", collegeService.getCollegeById(id));
        return "editCollege";
    }

    @PostMapping("/save_college")
    public String saveCollege(@ModelAttribute College college) {
        collegeService.saveCollege(college);
        return "redirect:/list_college";
    }

    @PostMapping("/update_college")
    public String updateCollege(@ModelAttribute College college) {
        collegeService.updateCollege(college);
        return "redirect:/list_college";
    }

    @GetMapping("/delete_college")
    public String deleteCollege(@RequestParam int id) {
        collegeService.deleteCollege(id);
        return "redirect:/list_college";
    }

    @GetMapping("/list_college")
    public String getAllCollege(Model model) {
        model.addAttribute("colleges", collegeService.getAllCollege());
        return "listCollege";
    }

}
