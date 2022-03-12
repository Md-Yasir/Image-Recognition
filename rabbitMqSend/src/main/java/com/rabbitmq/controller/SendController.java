package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rabbitmq.service.SendService;

@Controller
@RequestMapping("/mq")
public class SendController {


	@Autowired
	private SendService sendService;
	
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload() {
		
		return sendService.addImage();
	}
	
}
