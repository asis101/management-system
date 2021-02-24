package com.vastika.managementsystem.controller;

import com.vastika.managementsystem.model.Student;
import com.vastika.managementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add_student")
    public String addStudent() {
        return "createStudent";
    }

    @GetMapping("/edit_student")
    public String editStudent(@RequestParam int id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "editStudent";
    }

    @PostMapping("/save_student")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/listStudent";
    }

    @PostMapping("/update_student")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.updateStudent(student);
        return "redirect:/list_student";
    }

    @GetMapping("/delete_student")
    public String deleteStudent(@RequestParam int id) {
        studentService.deleteStudent(id);
        return "redirect/list_student";
    }

    @GetMapping("/list_student")
    public String getAllStudent(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "listStudent";
    }
}
