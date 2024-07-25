package Generic_Utilities;

import java.util.Random;

public class Java_Utility {

	/**
	 * its used to generate the random number with in the range of 1000
	 * @return
	 * @author Shobha
	 */
	public int getRandomNumber()
	{
		   Random ranNum = new Random();
	        int ranNumber = ranNum.nextInt(1000);
			return ranNumber;
	}
	//1st pull
//hello
}
