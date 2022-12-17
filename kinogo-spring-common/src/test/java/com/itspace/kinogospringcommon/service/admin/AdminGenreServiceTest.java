package com.itspace.kinogospringcommon.service.admin;

import com.itspace.kinogospringcommon.model.entity.Genre;
import com.itspace.kinogospringcommon.model.entity.Movie;
import com.itspace.kinogospringcommon.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
class AdminGenreServiceTest {
    @MockBean
    private GenreRepository genreRepository;

    @Autowired
    private AdminGenreService adminGenreService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
        Genre genre = Genre.builder()
                .id(1)
                .name("GenreExample")
                .movie(new Movie())
                .build();
        when(genreRepository.save(any())).thenReturn(genre);

        adminGenreService.save(Genre.builder()
                .name("GenreExample")
                .movie(new Movie())
                .build());
        verify(genreRepository, times(1)).save(any());

    }

    @Test
    void edit() {
    }

    @Test
    void getById() {
    }
}