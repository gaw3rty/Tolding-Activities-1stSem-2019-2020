import javax.swing.JOptionPane;

public class UsersAgeJ {
	public static void main (String [] args) { 
	

	
	int age = 0;
    while(true) {
    try {
	
	age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
	
	if(age < 0 || age > 122 ){      
    JOptionPane.showMessageDialog(null,"----Invalid Age----");
	}else if(age <= 3){      
		JOptionPane.showMessageDialog(null,"You are a Baby!");
		break;
	}else if(age <= 4){
		JOptionPane.showMessageDialog(null,"You are a Child!");
		break;
	}else if(age <= 13){
		JOptionPane.showMessageDialog(null,"You are a Teen!");
		break;		
	}else if(age <= 20){
		JOptionPane.showMessageDialog(null,"You are a Young Adult!");
		break;
	}else if(age <= 33){
		JOptionPane.showMessageDialog(null,"You are an Middle Aged!");
		break;	
	}else if(age <= 46){
		JOptionPane.showMessageDialog(null,"You are an Adult!");
		break;
	}else if(age <= 60){
		JOptionPane.showMessageDialog(null,"You are a Senior Citizen!");
		break;
    }
    }
    catch (Exception e){
    JOptionPane.showMessageDialog(null, "Invalid Input!\nEnter Age Again!");
  }
  }
 }
}  