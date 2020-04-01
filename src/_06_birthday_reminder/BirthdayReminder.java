
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Febuary 1st";
		String dadsBirthday = "June 24";
		String myBirthday = "September 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input = JOptionPane.showInputDialog("Whoose birthday do you want to see");
		// 3. Print out what the user typed
JOptionPane.showMessageDialog(null, input);	
		// 4. if user asked for "mom"
			//print mom's birthday
if(input .equals ("mom")) {
	
	JOptionPane.showMessageDialog(null, "Febuary 1st");
}
		// 5. if user asked for "dad"
			// print dad's birthday
else if(input .equals ("dad")) {
	JOptionPane.showMessageDialog(null, "June 24th");
	
}
		// 6. if user asked for your name
			// print myBirthday

else if(input .equals ("me")) {
	JOptionPane.showMessageDialog(null, "September 5th");
}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
else {
	JOptionPane.showMessageDialog(null, "Sorry, I don't remeber that person birthday");
}
	} 
}
