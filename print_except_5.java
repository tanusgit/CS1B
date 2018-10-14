/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrintExceptFive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// prints 1 to 10 except 5
		for (int i = 1; i <= 10; i++){
			/*if (i == 5){
				//i = i + 1;
				continue;
			}*/
			if (i != 5)
			{
				System.out.println(i);	
			}
			
		}
	}
}
