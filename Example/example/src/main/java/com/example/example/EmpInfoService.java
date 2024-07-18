package com.example.example;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service("empInfoService")
public class EmpInfoService {
	
	private WebClient webClient = WebClient.builder()
											.baseUrl("http://127.0.0.1:5400/API_AGV")
											.build();

	public ResponseDto getEmpInfo() {
		// TODO Auto-generated method stub
		
		ResponseDto responseDto = new ResponseDto();
		
		
		responseDto.setName("1");
		responseDto.setSeqNo("2");
		responseDto.setSystemBytes("3");
		responseDto.setEventTime("4");
		responseDto.setWBit("5");
		responseDto.setBody();
		
		return webClient.post()
						.uri("http://192.168.0.30:5400/API_AGV")
						.bodyValue(responseDto)
						.retrieve()
						.bodyToMono(ResponseDto.class)
						.block();
		
		return null;
	}

}
