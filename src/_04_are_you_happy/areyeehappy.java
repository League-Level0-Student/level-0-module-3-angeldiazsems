package _04_are_you_happy;

import javax.swing.JOptionPane;

public class areyeehappy {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("Are you happy??");
	
	
	if(input .equals ("yes")) {
		
		
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
	}
	
	

	

	else if(input .equals ("no")) {
		
		
		JOptionPane.showInputDialog("Do you want to be happy?");
				
	}
	
	
	
	

	else if(input .equals ("yes")) {
		
		
		JOptionPane.showMessageDialog(null, "Change something"); 
	}
	
	
	
	
	
	
else if(input .equals ("no")) {
		
		
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
