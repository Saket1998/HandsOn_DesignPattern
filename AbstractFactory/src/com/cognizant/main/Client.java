package com.cognizant.main;

import com.cognizant.audi.AudiFactory;
import com.cognizant.audi.AudiHeadlight;
import com.cognizant.audi.AudiTire;
import com.cognizant.factory.FactoryProducer;
import com.cognizant.mercedes.MercedesFactory;
import com.cognizant.mercedes.MercedesHeadlight;
import com.cognizant.mercedes.MercedesTire;

public class Client {
	public static void main(String[] args) {
		AudiFactory audiFactory = (AudiFactory) FactoryProducer.getFactory("Audi");
		AudiTire audiTire = (AudiTire) audiFactory.makeTire();
		audiTire.show();
		AudiHeadlight audiHeadlight = (AudiHeadlight) audiFactory.makeHeadlight();
		audiHeadlight.show();
		MercedesFactory mercedesFactory = (MercedesFactory) FactoryProducer.getFactory("Mercedes");
		MercedesTire mercedesTire = (MercedesTire) mercedesFactory.makeTire();
		mercedesTire.show();
		MercedesHeadlight mercedesHeadlight = (MercedesHeadlight) mercedesFactory.makeHeadlight();
		mercedesHeadlight.show();

	}
}
