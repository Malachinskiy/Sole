package studyjava;

public class BreakLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      outer: for (int i = 0; i<3; i++) {
    	  System.out.print("Итаерация " + "i" + ": ");
    	  for (int j=0; j < 100; j++) {
    		  if (j==5) break outer;
    		  System.out.print(j + " ");
    	  }
    	  System.out.println("Эта строка не выводится");
      }
	System.out.println("Цикл завершен");
	}

}
