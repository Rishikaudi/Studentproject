package com.example.StudentprojectInfo.controller;

import com.example.StudentprojectInfo.dto.Projectrequest;
import com.example.StudentprojectInfo.model.project;
import com.example.StudentprojectInfo.service.Projectservice;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class Projectcontroller {
    @Autowired
    private Projectservice projectservice;
    @PostMapping("/addproject")
    public ResponseEntity<project> saveproject(@RequestBody Projectrequest projectrequest){
        return new ResponseEntity<>(projectservice.saveproject(projectrequest), HttpStatus.OK);
    }
}
