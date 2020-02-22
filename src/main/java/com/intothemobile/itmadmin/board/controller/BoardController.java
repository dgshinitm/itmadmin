package com.intothemobile.itmadmin.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intothemobile.itmadmin.board.dao.BoardMapper;

@Controller
public class BoardController {
	@Autowired
	private BoardMapper boardMapper;

	@RequestMapping(path = "/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello");
		
		mav.addObject("currentTime", boardMapper.currentDatetime());
		
		
		
		return mav;
	}
}
