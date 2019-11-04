import javax.swing.JOptionPane;
public class TimeConversion {
	public static void main (String [] args) {
    	
    	String name;
	    int hrs, min, mins;  
	    char answer = 'Y'; 
		do{
	    	try{
				name = JOptionPane.showInputDialog("Input number of minutes: ");
				mins = Integer.parseInt(name);		      
				hrs = mins/60;
				min = mins%60;
	      
	      		JOptionPane.showMessageDialog(null,"There are "+hrs+" hours and "+min+" minutes");
	      		answer=JOptionPane.showInputDialog(null,"Do you want to try again? Type Y for yes or N for no").charAt(0);
	    	}catch(Exception e){
	    		JOptionPane.showMessageDialog(null,"----Invalid Input----");
	    		answer=JOptionPane.showInputDialog(null,"Type Y to try again or N to End ").charAt(0);
	    	}
	    s}while(answer == 'Y'|| answer == 'y');	    	      	      	      	      	      	   
	}
}