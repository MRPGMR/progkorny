package com.parfumeapp.parfumeapp.controller;

import com.parfumeapp.parfumeapp.model.Perfume;
import com.parfumeapp.parfumeapp.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

@RestController
@RequestMapping("/perfume")
public class PerfumeController {
    @Autowired
    private PerfumeService perfumeService;

    @PostMapping("/add")
    public String add (@RequestBody Perfume perfume){
        perfumeService.saveParfume(perfume);
        return "Új mentett Parfüm.";
    }
    @GetMapping("/get")
    public List<Perfume> getPerfumes(){
        return perfumeService.perfumes();

    }

    @DeleteMapping("/del/{id}")
    public String deletePerfume(@PathVariable Integer id){
        return perfumeService.deletePerfume(id);
    }
}
