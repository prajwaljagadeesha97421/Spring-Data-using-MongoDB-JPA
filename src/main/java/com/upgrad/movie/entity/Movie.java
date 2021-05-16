package com.upgrad.movie.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "MOVIE")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_ID")
    private int movieId;

    @Column(name = "MOVIE_NAME",unique = true,length = 50)
    @NotNull
    private String movieName;

    @Column(name = "MOVIE_DESC" ,length = 500)
    @NotNull
    private String movieDesc;

    @Column(name = "RELEASE_DATE")
    @NotNull
    private String releaseDate;

    @Column(name = "DURATION")
    @NotNull
    private int duration;

    @Column(name = "COVER_PHOTO_URL")
    @NotNull
    private String coverPhotoUrl;

    @Column(name = "TRAILER_URL")
    private String trailerUrl;

}
