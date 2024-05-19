package com.parfumeapp.parfumeapp.service;

import com.parfumeapp.parfumeapp.model.Perfume;
import com.parfumeapp.parfumeapp.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfumeServiceImpl implements PerfumeService{
    @Autowired
    private PerfumeRepository perfumeRepository;
    @Override
    public Perfume saveParfume(Perfume perfume) {
        return perfumeRepository.save(perfume);
    }

    @Override
    public List<Perfume> perfumes() {
        return perfumeRepository.findAll();
    }
}
