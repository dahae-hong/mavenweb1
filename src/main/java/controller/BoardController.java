package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import board.dao.BoardDAO;

@Controller
public class BoardController {
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("/board/list")
	public ModelAndView list() {
		System.out.println("modelAndView");
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageboard",dao.list(1));
		mv.setViewName("/board/list");
		
		return mv;
	}
	
	@RequestMapping("/board/testform")
	public String testform() {
		return "/board/testform";
	}
	
	@RequestMapping("/board/test")
	@ResponseBody
	public String testform(String p) {
		//System.out.println("p: "+p);
		
		return p;
	}
	
	@RequestMapping("/board/searchList")
	public ModelAndView searchList(String field, String search, int requestPage) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("pageboard", dao.searchList(field, search, requestPage));
		mv.setViewName("/board/list");
		
		return mv;
		
	}
	
}
