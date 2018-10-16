package b;

import java.util.Scanner;
public class Learnarray{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		/*int[] mylist = new int [5];
		mylist[0] = 15;
		mylist[1] = 17;
		mylist[2] = 19;
		mylist[3] = 21;
		mylist[4] = 23;*/
		String[] mylist1 = new String [5];
		mylist1[0] = "Ram";
		mylist1[1] = "Neem";
		mylist1[2] = "Alex";
		mylist1[3] ="Adi";
		mylist1[4] = "Piya";
		char[] city = new char[4];
		city[0] = 'R';
		city[1] = 'O';
		city[2] = 'S';
		city[3] = 'E';
		try{
			System.out.println(city[5] + " ");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("dont print a value more than 4");
			
		}
		
		/*System.out.println("enter " + mylist.length + " values: ");
		for (int i = 0; i < mylist.length; i++)
			mylist[i] = input.nextInt();*/
		
		for (int i = 0; i < mylist1.length; i++)
			//mylist[i] = Math.random() * 100;
		System.out.println(mylist1[i] + " ");
		for (int i = 0; i < city.length; i++)
		System.out.println(city[i] + " ");
		
	}

}
