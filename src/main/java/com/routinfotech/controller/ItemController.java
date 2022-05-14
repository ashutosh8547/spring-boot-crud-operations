package com.routinfotech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

	@GetMapping("/getItem")
	public String getItem() {
		return "SUCCESS";
	}
}
