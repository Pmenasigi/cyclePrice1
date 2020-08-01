package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.model.CycleParts;
import com.in.service.CyclePricingService;



@RestController
@RequestMapping("/api")

public class CyclePricingController {

	@Autowired
	CyclePricingService cyclePricingService;
	
	@PostMapping("/price")
	public float getCylcePrice (@RequestBody CycleParts cycleParts) {
		float price = cyclePricingService.cyclePrice(cycleParts);
		
		return price;
	}
}
