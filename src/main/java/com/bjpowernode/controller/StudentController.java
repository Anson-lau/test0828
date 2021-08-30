package com.bjpowernode.controller;


import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){



        String tip = "false";

        int num = studentService.insert(student);

        if (num > 0){
            tip = "success";
        }

        ModelAndView mv = new ModelAndView();

        mv.addObject("tip", tip);

        mv.setViewName("result");

        return mv;

    }


    @RequestMapping("/findmore.do")
    public ModelAndView selectStudent(){
        List<Student> studentList = studentService.select();
        ModelAndView mv = new ModelAndView();
        mv.addObject("studentList", studentList);

        mv.setViewName("findmore");

        return mv;
    }




}
