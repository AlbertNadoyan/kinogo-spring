package com.itspace.kinogospringcommon.service;

import com.itspace.kinogospringcommon.exception.BadRequestException;
import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    List<Genre> findAll() throws BadRequestException;
    Genre findById(int id) throws EntityNotFoundException;

}
