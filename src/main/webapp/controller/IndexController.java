package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("exec");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "1234"); //jsp에서 사용할 데이터
		mv.setViewName("/WEB-INF/index.jsp"); //실행하려는 jsp파일
		return mv;
	}



}
