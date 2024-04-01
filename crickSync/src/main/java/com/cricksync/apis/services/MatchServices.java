package com.cricksync.apis.services;

import java.util.List;

import com.cricksync.apis.entity.Match;



public interface MatchServices {

	List<Match> getAllMatches();

	List<Match> getLiveMatches();

	List<List<String>> getPointTable();
}

