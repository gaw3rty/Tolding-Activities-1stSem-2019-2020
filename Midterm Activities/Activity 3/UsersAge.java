import java.util.Scanner;

public class UsersAge {

  public static void main (String [] args) { 
      Scanner sc = new Scanner(System.in);
			System.out.println("Enter Age number:");
			int age = sc.nextInt();
			
			while(true) {
			try {
				
      if(age < 0 || age > 122 ){      
        	System.out.println("----Invalid Age----");
        	break;
      }else if(age <= 3){      
        	System.out.println("You are a Baby!");
        	break;
      }else if(age <= 12){
      		System.out.println("You are a Child!");
      		break; 
      }else if(age <= 19){
      		System.out.println("You are a Teen!");
      		break;		
      }else if(age <= 32){
      		System.out.println("You are a Young Adult!");
      		break;
      }else if(age <= 45){
      		System.out.println("You are an Middle Aged!");
      		break;	
      }else if(age <= 59){
      		System.out.println("You are an Adult!");
      		break;
      }else if(age <= 122){
      		System.out.println("You are a Senior Citizen!");
      		break;
      }
      }		
      catch (Exception e){
    			System.out.println("Invalid Input!\nEnter Age Again!");
 				  sc.next();		        
}
}        
}
}   