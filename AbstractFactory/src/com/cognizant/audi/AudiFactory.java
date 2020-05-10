package com.cognizant.audi;

import com.cognizant.Factory;
import com.cognizant.Headlight;
import com.cognizant.Tire;

public class AudiFactory extends Factory {

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

}
