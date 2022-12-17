package com.itspace.kinogospringcommon.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "rated")
public class Rated {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

//    @Size(min = 1, max = 5, message = "Name should be between 1 and 5 character")
    private int rate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rated rated = (Rated) o;
        return id == rated.id && rate == rated.rate && Objects.equals(user, rated.user) && Objects.equals(movie, rated.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, movie, rate);
    }
}
