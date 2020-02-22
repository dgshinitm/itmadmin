package com.intothemobile.itmadmin.board.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intothemobile.itmadmin.board.dao.BoardMapper;

@RestController
public class BoardApiController {
	@Autowired
	private BoardMapper boardMapper;

	@GetMapping(path = "/currentDatetime")
	public String helloWorld() {
		return String.format("%s %s", boardMapper.currentDatetime(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
}
