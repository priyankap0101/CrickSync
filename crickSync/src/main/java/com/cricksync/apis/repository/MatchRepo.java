package com.cricksync.apis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricksync.apis.entity.Match;



public interface MatchRepo extends JpaRepository<Match,Integer> {

	Optional<Match> findByTeamHeading(String teamHeading);
}
