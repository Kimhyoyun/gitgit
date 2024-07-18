package com.example.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class UserInfoController {

	@Autowired
	private EmpInfoService empInfoService;
	
	@GetMapping("/empinfo")
	public ResponseDto GetEmpInfo() {
		
		ResponseDto result = empInfoService.getEmpInfo();
				
		log.info("name: " + result.getName() + "seqNo" + result.getSeqNo() + "systemBytes: " + result.getSystemBytes() + "eventTime: " + result.getEventTime() + "wBit: " + result.getWBit() + "body: " + result.getBody());
		
		return result;
	}
}
