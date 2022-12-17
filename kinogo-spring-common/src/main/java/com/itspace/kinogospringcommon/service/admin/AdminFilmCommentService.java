package com.itspace.kinogospringcommon.service.admin;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.FilmComment;

public interface AdminFilmCommentService {
    FilmComment save(FilmComment filmComment);

    void delete(int id);

    FilmComment edit(int id, FilmComment filmComment) throws EntityNotFoundException;
}
