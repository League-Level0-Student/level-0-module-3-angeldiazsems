package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	
	
	
	String input = JOptionPane.showInputDialog("What is your star sign?");
	
	
	
	
	if(input .equals ("Aries")) {
		
		JOptionPane.showMessageDialog(null, "You will be very rich one day");
	}
	
	
	
	
	else if(input .equals ("Taurus")){
		
		JOptionPane.showMessageDialog(null, "You will never become rich");
	}
	
	
	
	else if(input .equals ("Gemini")){
		
		JOptionPane.showMessageDialog(null, "You will trip one day");
	}
	
	
	else if(input .equals ("Cancer")) {
		JOptionPane.showMessageDialog(null, "You will never trip");
	}
	
	
	else if(input .equals ("Leo")) {
		
		JOptionPane.showMessageDialog(null, "You will always trip");
	}
	
	
	
else if(input .equals ("Virgo")) {
		
		JOptionPane.showMessageDialog(null, "You are the best man in the world and you always will be");
	}
	
	
	
else if(input .equals ("Libra")){
	JOptionPane.showMessageDialog(null, "You will always weigh things before bying them");
}
	
	
	
else if(input .equals ("Scorpio")) {
	
	
	JOptionPane.showMessageDialog(null, "You will always have a scoprian for a pet");
}
	
	
else if(input .equals ("Sagittarous")) {
	
	
JOptionPane.showMessageDialog(null, "People will never be able to pronouce your name without messing up at least once");
}
	
	
else if(input .equals("Capricorn"))	{
	
	JOptionPane.showMessageDialog(null, "You will turn into a goat when you are in your 30's");

}
	else if( input .equals ("Aquaruis")) {
		
	JOptionPane.showMessageDialog(null, "You will turn into a fish when you are 10 years old");
	}



	else if(input .equals ("Pices")) {
		
		JOptionPane.showMessageDialog(null, "You are actually a dolphin not a human");
	}

	else {
		JOptionPane.showMessageDialog(null, "Thats not a star sign");
	}

}
}