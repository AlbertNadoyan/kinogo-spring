package com.itspace.kinogospringrest.dto;

import com.itspace.kinogospringcommon.model.entity.CastCrewRole;
import com.itspace.kinogospringcommon.model.entity.Movie;
import com.itspace.kinogospringcommon.model.entity.Zodiac;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CastCrewCreateDto {
    private String name;
    private String career;
    private double height;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date dateBirth;
    private int age;
    @Enumerated(value = EnumType.STRING)
    private Zodiac zodiac;
    private String genre;
    private int totalFilm;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date firstFilm;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date latestFilm;
    @Enumerated(value = EnumType.STRING)
    private CastCrewRole castCrewRole;
    private String profilPic;
    private String biography;
    @ManyToOne
    private Movie movie;
}
