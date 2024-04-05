package com.example.Harshal.watchlist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Harshal.watchlist.Entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
