package com.itspace.kinogospringrest.endpoint;

import com.itspace.kinogospringcommon.model.entity.Genre;
import com.itspace.kinogospringcommon.repository.GenreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@Profile(value = "test")
public class GenreEndPointTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private GenreRepository genreRepository;
    private static final String BASE_URL = "http://localhost:8082";
    @Test
    public  void testGetAllGenreEndpoint() throws Exception {
        addTestGenre();
        mvc.perform(get(BASE_URL + "/api/v1/kinogo/genre")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));

    }

    private void addTestGenre(){
        genreRepository.save(Genre.builder()
                        .name("Test")
                .build());

        genreRepository.save(Genre.builder()
                .name("Test2")
                .build());
    }

}