package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Data.Wheather;

@Controller
public class HomeController {
	@Autowired
	Wheather wheather;
	// url -> /aaa->aaa.jsp������ �䱸�ϰ� ����
	// url -> /test->test.jsp������ �䱸�ϰ� ����
	// ���ϰ��� ���� �Լ��� ������ ��� ���� ������ �����
	@RequestMapping("/test")
	void test() {
		System.out.println("test");
	}
	
	@RequestMapping("/test1")
	ModelAndView test1() {
		System.out.println("test1");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","test1");
		mv.setViewName("test");
		
		return mv;
	}
	
	@RequestMapping("/test2")
	ModelAndView test2() {
		System.out.println("test2");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","test2");
		mv.setViewName("test");
		return mv;
	}
	@RequestMapping("/test3")
	String test3() {
		return "test3";
	}
	
	
	
	
	
	//localhost:8080/weather -> setViewName("weather")를 이용해 weather.jsp로
	
	@RequestMapping("/weather") 
	ModelAndView wheather() { 
		ModelAndView mv = new ModelAndView(); 
		//mv.addObject("data",new Wheather().getweatherData());
		mv.addObject("data",wheather.getweatherData());
		mv.setViewName("weather");
	  
		return mv; 
	  }
	 
	
	
	
	/*localhost:8080/weather -> setViewName("weather")를 이용해 weather.jsp로*/
	
//	@RequestMapping("/weather") 
//	ModelAndView wheather(HttpServletRequest request, HttpServletResponse response) {
//		//추가사항
//		ServletContext context = request.getServletContext();
//		context.setAttribute("context", "context");
//		HttpSession session = request.getSession();
//		session.setAttribute("session", "session");
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("data",new Wheather().getweatherData());
//		mv.setViewName("weather");
//		
//		return mv;
//	}
	
}
