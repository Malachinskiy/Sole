package studyjava;

import java.io.IOException;

public class Menu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      char choice;
      
      do {
    	  System.out.println("Sravka");
    	  System.out.println(" 1. if");
    	  System.out.println(" 2. switch");
    	  System.out.println(" 3. while");
    	  System.out.println(" 4. do while");
    	  System.out.println(" 5. for");
    	  System.out.println("Vuderete razdel:");
    	  choice = (char) System.in.read();
      } while (choice < '1' || choice > '5');
      
      switch (choice) {
    	  case '1' :
    		  System.out.println("Uslovniy operator if");
    		  System.out.println("if (condition) statement1;");
    		  System.out.println("else statement2;");
    		  break;
    	  case '2' :
    		  System.out.println("Uslovniy operator if");
    		  System.out.println("if (condition) statement1;");
    		  System.out.println("else statement2;");
    		  break;
    	  case '3' :
    		  System.out.println("Uslovniy operator if");
    		  System.out.println("if (condition) statement1;");
    		  System.out.println("else statement2;");
    		  break;
    	  case '4' :
    		  System.out.println("Uslovniy operator if");
    		  System.out.println("if (condition) statement1;");
    		  System.out.println("else statement2;");
    		  break;	  
    	  case '5' :
    		  System.out.println("Uslovniy operator if");
    		  System.out.println("if (condition) statement1;");
    		  System.out.println("else statement2;");
    		  break;
      }
      
      }
	}

