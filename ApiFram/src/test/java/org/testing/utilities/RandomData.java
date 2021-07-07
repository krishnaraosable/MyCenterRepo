package org.testing.utilities;

import java.util.Random;

public class RandomData {
	
	public static Integer genrateRandomNumber() {
		Random rm = new Random();
		Integer rnum = rm.nextInt();
		return rnum;
	}

}
