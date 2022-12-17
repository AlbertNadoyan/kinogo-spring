package com.itspace.kinogospringcommon.service.impl;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.Genre;
import com.itspace.kinogospringcommon.repository.GenreRepository;
import com.itspace.kinogospringcommon.service.GenreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Log4j2
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    public List<Genre> findAll(){
        log.info("Get all genres.");
        return genreRepository.findAll();
    }
    public Genre findById(int id) throws EntityNotFoundException {
        log.info("Get genre by id.");
        return genreRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
