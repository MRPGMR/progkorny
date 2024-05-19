package com.parfumeapp.parfumeapp.controller;

import com.parfumeapp.parfumeapp.model.Perfume;
import com.parfumeapp.parfumeapp.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfume")
public class PerfumeController {
    @Autowired
    private PerfumeService perfumeService;

    @PostMapping("/add")
    public String add (@RequestBody Perfume perfume){
        perfumeService.saveParfume(perfume);
        return "Új mentett Parfüm.";
    };
}
