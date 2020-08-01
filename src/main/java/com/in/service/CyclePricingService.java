package com.in.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.in.model.CycleParts;

@Service
public class CyclePricingService {
	
	@Async
	public float cyclePrice(CycleParts cycleParts) {

		float priceOfCycle = 0.0f;

		priceOfCycle = cycleParts.getFrame() + cycleParts.getHandleBar() + cycleParts.getSeating()
		+ cycleParts.getChainAssembly() + cycleParts.getWheels().getRim() + cycleParts.getWheels().getSpokes()
		+ cycleParts.getWheels().getTube() + cycleParts.getWheels().getTyre();
     return priceOfCycle;
	}

}
