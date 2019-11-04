import java.io.*;
public class UsersAgeB{
  public static void main(String[] args)throws IOException {
	  	
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int age;
 
    while(true){
    try{ 	
    System.out.println("Enter Your age: ");
    age = Integer.parseInt(read.readLine());
	
    if (age <0 || age >122){
        System.out.println("----Invalid Age----!");
    }else if (age <=3){
        System.out.println("You are a Baby!");
        break;
    }else if (age <=12){
        System.out.println("You are a Child!");
        break;
    }else if (age <=19){
        System.out.println("You are a Teen!");
        break;
    }else if (age <=32){
        System.out.println("You are an Adult!");
    break;
        }else if (age <=45){
        System.out.println("You are Middle Aged!");
        break;
    }else if (age <=59){
        System.out.println("You are an Adult!");
        break;
    }else if (age <=122){
        System.out.println("You are a Senior!");
        break;
    }	    		
    }	
    catch (Exception ex){
        System.out.println("Invalid Input!\nEnter Age Again!");
 				   	
 	}						  
	}

}
}
