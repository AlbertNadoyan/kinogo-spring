package com.itspace.kinogospringcommon.repository;

import com.itspace.kinogospringcommon.model.entity.FilmComment;
import liquibase.pro.packaged.id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentMovieRepository extends JpaRepository<FilmComment, Integer> {
    FilmComment findById(int id);
    List<FilmComment> findAllByMovieId(int id);

}
