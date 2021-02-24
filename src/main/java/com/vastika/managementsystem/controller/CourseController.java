package com.vastika.managementsystem.controller;

import com.vastika.managementsystem.model.Course;
import com.vastika.managementsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/add_course")
    public String addCourse(Model model) {
        return "createCourse";
    }

    @GetMapping("/edit_course")
    public String editCourse(@RequestParam int id, Model model) {
        model.addAttribute("course", courseService.getCourseById(id));

        return "editCourse";
    }

    @PostMapping("/save_course")
    public String saveCourse(@ModelAttribute Course course) {
        courseService.saveCourse(course);
        return "redirect:/list_course";
    }

    @PostMapping("/update_course")
    public String updateCourse(@ModelAttribute Course course) {
        courseService.updateCourse(course);
        return "redirect:/list_course";
    }

    @GetMapping("/delete_course")
    public String deleteCourse(@RequestParam int id) {
        courseService.deleteCourse(id);
        return "redirect:/list_course";
    }

    @GetMapping("/list_course")
    public String getAllCourse(Model model) {
        model.addAttribute("Courses", courseService.getAllCourse());
        return "listCourse";
    }

}
