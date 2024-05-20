/*package com.parfumeapp.parfumeapp.controller;

import com.parfumeapp.parfumeapp.model.Perfume;
import com.parfumeapp.parfumeapp.service.PerfumeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PerfumeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private PerfumeService perfumeService;

    @InjectMocks
    private PerfumeController perfumeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(perfumeController).build();
    }

    @Test
    public void testAddPerfume() throws Exception {
        Perfume perfume = new Perfume();
        perfume.setId(1);
        perfume.setName("Test Perfume");

        when(perfumeService.saveParfume(any(Perfume.class))).thenReturn(perfume);

        mockMvc.perform(MockMvcRequestBuilders.post("/perfume/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(perfume)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Új mentett Parfüm."));
    }

    @Test
    public void testGetPerfumes() throws Exception {
        Perfume perfume1 = new Perfume();
        perfume1.setId(1);
        perfume1.setName("Test Perfume 1");

        Perfume perfume2 = new Perfume();
        perfume2.setId(2);
        perfume2.setName("Test Perfume 2");

        when(perfumeService.perfumes()).thenReturn(Arrays.asList(perfume1, perfume2));

        mockMvc.perform(MockMvcRequestBuilders.get("/perfume/get"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Test Perfume 1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Test Perfume 2"));
    }

    @Test
    public void testDeletePerfume() throws Exception {
        when(perfumeService.deletePerfume(1)).thenReturn("Perfume deleted successfully");

        mockMvc.perform(MockMvcRequestBuilders.delete("/perfume/del/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Perfume deleted successfully"));
    }

    @Test
    public void testUpdatePerfume() throws Exception {
        Perfume perfume = new Perfume();
        perfume.setId(1);
        perfume.setName("Updated Perfume");

        when(perfumeService.updatePerfume(any(Perfume.class))).thenReturn(perfume);

        mockMvc.perform(MockMvcRequestBuilders.put("/perfume/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(perfume)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Updated Perfume"));
    }

    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
*/