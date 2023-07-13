package com.studies.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
