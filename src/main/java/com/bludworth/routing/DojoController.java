package com.bludworth.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/{dojo}")
	public String showDojo(@PathVariable("dojo")String dojo) {
		if(dojo.equals("burbank-dojo") ) {
			return "Burbank Dojo is located in Souther California";
		}
		else if(dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		
		return "the " + dojo + " is awesome";
	}

	
}
