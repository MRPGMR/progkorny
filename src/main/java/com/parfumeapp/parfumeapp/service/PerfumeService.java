package com.parfumeapp.parfumeapp.service;

import com.parfumeapp.parfumeapp.model.Perfume;

import java.util.List;

public interface PerfumeService {
    public Perfume saveParfume(Perfume perfume);
    public List<Perfume> perfumes();
    public String deletePerfume (Integer id);
    public Perfume updatePerfume(Perfume perfume);
}
