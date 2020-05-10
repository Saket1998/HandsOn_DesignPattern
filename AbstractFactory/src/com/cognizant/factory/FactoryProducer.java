package com.cognizant.factory;

import com.cognizant.Factory;
import com.cognizant.audi.AudiFactory;
import com.cognizant.mercedes.MercedesFactory;

public class FactoryProducer {
	public static Factory getFactory(String brand) {
		
		if (brand.equalsIgnoreCase("Audi")) {
			return new AudiFactory();

		} else {
			return new MercedesFactory();
		}

	}
}
