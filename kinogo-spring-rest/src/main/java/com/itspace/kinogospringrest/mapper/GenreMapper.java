package com.itspace.kinogospringrest.mapper;

import com.itspace.kinogospringcommon.model.entity.Genre;
import com.itspace.kinogospringrest.dto.GenreCreateDto;
import com.itspace.kinogospringrest.dto.GenreResponseDto;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface GenreMapper {

    Genre map(GenreCreateDto genreCreateDto);
    GenreResponseDto map(Genre genre);
    List<GenreResponseDto> map(List<Genre> genreList);

}
