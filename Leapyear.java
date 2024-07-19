package firstproject;

public class Leapyear {

	public static void main(String[] args) {
 int year = 2014;
 if(year%4==0)
 {
	 System.out.print("Entered year is leapyear");
 }
 else if(year%400==0) {
	 System.out.println("Entered year is leapyear");
 }
 else
 {
	 System.out.println("Entered year is not leapyear");
 }

	}

}
