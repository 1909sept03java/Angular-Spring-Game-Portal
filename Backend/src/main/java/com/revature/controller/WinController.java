package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Game;
import com.revature.model.User;
import com.revature.model.Win;
import com.revature.service.P2Services;

@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/win")
public class WinController {

	private P2Services p2s;

	@Autowired // setter injection
	public void setP2Services(P2Services p2s) {
		this.p2s = p2s;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Win>> getAll() {
		return new ResponseEntity<>(this.p2s.getAllWins(), HttpStatus.OK);
	}
	
	//Not working
	@RequestMapping(value = "/top10", method = RequestMethod.GET)
	public ResponseEntity<List<Win>> getTop10(@RequestParam int id) {
		return new ResponseEntity<>(this.p2s.top10Wins(new Game(id, "")), HttpStatus.OK);
	}
	//REMOVED, JUST USE UPDATE
//	@RequestMapping(method=RequestMethod.POST)
//	public ResponseEntity<String> addWin(@RequestParam int count, @RequestParam int user_id, @RequestParam int id) {
//		ResponseEntity<String> resp = null;
//			try {
//				this.p2s.addWin(new Win(count, new User(user_id, "", ""), new Game(id, "")));
//				resp = new ResponseEntity<>("WIN CREATED SUCCESSFULLY", HttpStatus.OK);
//			} catch(Exception e) {
//				e.printStackTrace();
//				resp = new ResponseEntity<>("FAILED TO UPDATE, OR CREATED A NEW WIN", HttpStatus.BAD_REQUEST);
//			}
//		return resp;
//	}
	
	@RequestMapping(value = "/add",method=RequestMethod.GET)
	public ResponseEntity<String> updateWin(@RequestParam int user_id, @RequestParam int id) {
		System.out.println("here");
		ResponseEntity<String> resp = null;
			try {
				this.p2s.updateWin(new Win(0, new User(user_id, "", ""), new Game(id, "")));
				resp = new ResponseEntity<>("WIN UPDATED SUCCESSFULLY", HttpStatus.OK);
			} catch(Exception e) {
				e.printStackTrace();
				resp = new ResponseEntity<>("FAILED TO UPDATE WIN", HttpStatus.BAD_REQUEST);
			}
		return resp;
	}
	
	@RequestMapping(value = "/user", method=RequestMethod.GET)
	public ResponseEntity<List<Win>> userWin(@RequestParam int user_id, @RequestParam int id) {
		return new ResponseEntity<>(this.p2s.getUserWins(new User(user_id, "", ""), new Game(id, "")), HttpStatus.OK);
	}
}
