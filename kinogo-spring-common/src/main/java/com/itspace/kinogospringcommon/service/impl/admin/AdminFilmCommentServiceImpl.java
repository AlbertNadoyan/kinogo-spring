package com.itspace.kinogospringcommon.service.impl.admin;

import com.itspace.kinogospringcommon.exception.EntityNotFoundException;
import com.itspace.kinogospringcommon.model.entity.FilmComment;
import com.itspace.kinogospringcommon.repository.CommentMovieRepository;
import com.itspace.kinogospringcommon.service.admin.AdminFilmCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminFilmCommentServiceImpl implements AdminFilmCommentService {
    private final CommentMovieRepository commentMovieRepository;


    @Override
    public FilmComment save(FilmComment filmComment) {
        return commentMovieRepository.save(filmComment);
    }

    @Override
    public void delete(int id) {
        commentMovieRepository.deleteById(id);
    }

    @Override
    public FilmComment edit(int id, FilmComment filmComment) throws EntityNotFoundException {
        boolean existsById = commentMovieRepository.existsById(id);
        if(!existsById){
            throw new EntityNotFoundException("FilmComment not found for this is :: "+ id);
        }
        return commentMovieRepository.save(filmComment);
    }
}
