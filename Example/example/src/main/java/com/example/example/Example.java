package com.example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
	
	
	@GetMapping("/calllocalname")
	public String callLocalName() {
		
		String name = new String();  //지역변수
		
		name = "김구월";
		
		takeLocalName(name); //요러케 메서드 괄호 안에 넘겨줄 파라미터 넣기
		
		return name;
	}
	
	
	public String takeLocalName(String name) { //String name이 넘겨받은 매개변수=파라미터
		

			String takeName = new String(name);
			
			System.out.println(takeName);

		return takeName;
	}
	
	
	
	
	
	
	//인스턴스 변수
	CatDto dto;
	
	//클래스 변수
	static String name;
	
	 @GetMapping("/call")
	public CatDto call() {
		
		 dto = new CatDto(); //new로 선언해줘야돼
		 
		 dto.setName("구월");
		 dto.setAge(8);
		
		return dto;
	}
	 
	 @GetMapping("/callname")
	 public String callName() {
		 
		 name = "구월"; //안해도 쓸 수 있어
		 
		 return name; 
	 }
	 
	 
}
