/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BreakInFunction
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// prints 1 to 10 except 5
		for (int i = 1; i <= 10; i++){
			double g = i;
			double n = g/8;
			if(n > 0.6){
				// return exits the function completely so write break
				//return;
				break;
			}
	
			System.out.println(n);	
			
			
		}
	}
}
