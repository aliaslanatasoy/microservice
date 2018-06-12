package com.aslan.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aslan.atasoy on 06/07/2018.
 */
@RestController
@RequestMapping("/")
public class StudentController {

    @RequestMapping(value = "/get-all",method = RequestMethod.GET)
    public List<String> getAllStudents(){
        return Arrays.asList("aslan","ali");
    }

    @RequestMapping(value = "/get-one",method = RequestMethod.GET)
    public String getOne(){
        return "Aslan";
    }
}
