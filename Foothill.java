package learnclass;



public class Foothill {
	public static void main (String args[])
	{
		student pamela = new student();
		food m = new food();
		
		room k = new room();
		
		//m.eat();
		//k.eat();
		pamela.eat();
		// student object or any other object cannot access the default constructor
		// of any class eventhough they inherited from that class
		String  s = pamela.getFoodname();
		String  o = pamela.setFoodname("apple");
		System.out.println(s);
		System.out.println(o);
		
		
		
		
	}
	public int square(int x)
	{
		return x*x;
	}
}

	class student extends food{
	//instance variable
	int age;
	char sex;
	int id;
	String name;
	 String eyecolor = "brown";
	student(){
		age = 25;
		sex = 'M';
		id = 12;
		
	}
	static void eat()
	{
		System.out.println("Studen's eat a lot of junk food");
	}
	student(int id, int age){
		this.id = id;
		this.age = age;
	}
	String getcolor(){
		return eyecolor;
	}
	String getname(){
		return name;
	}
	public String toString(){
		String retVal;
		   retVal = "Student's age = " + age + ", " + "student's id = "+ 
		id+ "eye color is " + eyecolor;;        
		   return retVal; 
		
	}
}
class food extends room
{
	int numberoffood;
	String foodname;
	food()
	{
		numberoffood =5;
		foodname = "kiwi";
	}
	static void eat()
	{
		System.out.println("Studen's eat a lot of junk food");
	}
	
	int getnumberofFood ()
	{
		return numberoffood;
	}
	int setnumberofFood ( int n)
	{
		numberoffood = n;
		return numberoffood;
	}
	String getFoodname ()
	{
		return foodname;
	}
	String setFoodname (String n)
	{
		foodname = n;
		return foodname;
	}
}
class room{
	int roomnumber;
	int numberofroom;
	room()
	{
		roomnumber = 95;
		numberofroom = 789;
	}
	static void eat()
	{
		System.out.println("Studen's eat a lot of junk food");
	}
	
}