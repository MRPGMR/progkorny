package com.parfumeapp.parfumeapp.controller;

import com.parfumeapp.parfumeapp.model.Perfume;
import com.parfumeapp.parfumeapp.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;



import java.util.List;

@RestController
@RequestMapping("/perfume")
public class PerfumeController {
    @Autowired
    private PerfumeService perfumeService;

    @PostMapping("/add")
    public String add(@RequestBody Perfume perfume) {
        perfumeService.saveParfume(perfume);
        return "Új mentett Parfüm.";
    }

    @GetMapping("/get")
    public List<Perfume> getPerfumes() {
        return perfumeService.perfumes();

    }

    @DeleteMapping("/del/{id}")
    public String deletePerfume(@PathVariable Integer id) {
        return perfumeService.deletePerfume(id);
    }

    @PutMapping("/update")
    public Perfume updatePerfume(@RequestBody Perfume perfume) {
        return perfumeService.updatePerfume(perfume);
    }
}
