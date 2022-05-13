/**
*@author Jimmeh Camara
*/
import java.util.*;
public class YoungMan{
	public static void main(String[] args){
	
 	Person individual1 = new Person();	
	individual1.setName("Jimmeh");
	System.out.println(individual1.getName() + " Yes!!! It Works! :)");
	
   }	
}
class Person{
	
	int age;
	String name;
	String eyeColour;

	public void setName(String newName){
	this.name = newName;
	}
	public String getName(){
	//System.out.println(name + " Yes! it works");
	return name;
	}
}





