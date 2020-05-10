package com.cognizant.mercedes;

import com.cognizant.Factory;
import com.cognizant.Headlight;
import com.cognizant.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}


}
