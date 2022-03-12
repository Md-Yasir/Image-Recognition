package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rabbitmq.service.RecieveService;;

@Controller
@RequestMapping("/mq")
public class RecieveControler {


	@Autowired
	private RecieveService receiveService;
	
//	@Autowired
//	private DriverService driveService;
//	
//	@Autowired
//	private ResourceLoader resourceLoader;

	@Autowired
//	private CloudVisionTemplate cloudVisionTemplate;
	
	
	@RequestMapping(value = "/recieve", method = RequestMethod.GET)
	@ResponseBody
	public String recieve() throws Exception {
		
		return receiveService.recieve();
	}

	
}
