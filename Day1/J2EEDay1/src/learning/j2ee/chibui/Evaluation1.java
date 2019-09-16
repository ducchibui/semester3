package learning.j2ee.chibui;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evaluation1 {
	public static void main(String args[]) {
		displayName("Chi Bui");
		displayCurrentTime();
	}	
	
	public static void displayName(String name) {
		System.out.println("my name is: " + name);
	}
	
	public static void displayCurrentTime() {
		Date date = new Date();
		SimpleDateFormat  simpleFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("The current date time is:" + simpleFormatter.format(date));
	}
}
