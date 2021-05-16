package com.upgrad.movie;

import com.upgrad.movie.Dao.MovieDao;
import com.upgrad.movie.entity.Customer;
import com.upgrad.movie.entity.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {

	 ApplicationContext applicationContext = SpringApplication.run(MovieApplication.class, args);

		MovieDao movieDao = applicationContext.getBean(MovieDao.class);

		Movie movie = new Movie();
		movie.setMovieName("KGF");
		movie.setMovieDesc("Gold Fields");
		movie.setReleaseDate("12/02/2003");
		movie.setDuration(2);
		movie.setCoverPhotoUrl("photo");

      Movie saved = movieDao.save(movie);

		movie.setDuration(3);

      Movie updated = movieDao.save(movie);

      Movie finding = movieDao.findById(movie.getMovieId()).get();

      movieDao.delete(movie);
	}

}
