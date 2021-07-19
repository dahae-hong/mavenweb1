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
		mv.addObject("data", "1234"); //jsp���� ����� ������
		mv.setViewName("/WEB-INF/index.jsp"); //�����Ϸ��� jsp����
		return mv;
	}



}
