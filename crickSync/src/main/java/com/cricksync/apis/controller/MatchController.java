package com.cricksync.apis.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricksync.apis.entity.Match;
import com.cricksync.apis.services.MatchServices;



@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

	@Autowired
	private MatchServices matchService;

	public MatchController(MatchServices matchService) {
		super();
		this.matchService = matchService;
	}

	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches()
	{
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatches(), HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Match>> getAllMatches()
	{
		return new ResponseEntity<List<Match>>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	}
}
