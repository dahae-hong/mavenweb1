package Data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Service;
@Service
public class Wheather {
	public String getweatherData() {
		  String address="http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=3NPPDDvPzl0%2Bev18WY4gCmAIFBR7nfr6ydtRl0%2FxchfgSSm9zxBsUuUWQM%2FPOaS9vzKDXuWUersuHIXg3bmF2g%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
		  String data="";
		  try { 
			  URL url = new URL(address); //url 분리
			  URLConnection uc = url.openConnection();
			  BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); //줄단위로 읽어오기
			  String line;
			  while((line=in.readLine())!=null) { //한줄만읽어서 line에 저장 
				  data+=line;
			  } 
			  in.close();
			  return data;
		 
		  }catch (MalformedURLException e) { 
			  e.printStackTrace(); 
		  }catch (Exception e) { 
			  e.printStackTrace(); 
		  }
		  return data;

	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * String address
	 * ="http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=3NPPDDvPzl0%2Bev18WY4gCmAIFBR7nfr6ydtRl0%2FxchfgSSm9zxBsUuUWQM%2FPOaS9vzKDXuWUersuHIXg3bmF2g%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2021071516&HOUR=24&COURSE_ID=1";
	 * try { URL url = new URL(address); URLConnection uc = url.openConnection();
	 * BufferedReader in = new BufferedReader(new
	 * InputStreamReader(uc.getInputStream())); String line;
	 * 
	 * while((line=in.readLine())!=null) { System.out.println(line); } in.close(); }
	 * catch (MalformedURLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }catch (Exception e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
}
