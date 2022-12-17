package com.itspace.kinogospringcommon.service;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.FavoriteMovie;

import java.util.List;
import java.util.Optional;

public interface FavoriteService {

    void favoriteMovie(int movieId);
    List<FavoriteMovie> findAll();

    FavoriteMovie getById(int id) throws EntityNotFoundException;
}
