package com.itspace.kinogospringcommon.service;

import com.itspace.kinogospringcommon.model.entity.FilmComment;


import java.util.List;
import java.util.Optional;

public interface CommentMovieService {

    List<FilmComment> getAll();
    FilmComment getById(int id);
    List<FilmComment> findCommentByMovieId(int id);
}
