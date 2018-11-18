/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair<k, v> {
	public k first;
	public v second;
	public String toString() {
		String s = "";
		s += first;
		s += second;
		return s;
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Pair<Integer, String> p = new Pair<Integer, String>();
		p.first = 10;
		p.second = "Name";
		System.out.println(p);
		// your code goes here
	}
}
