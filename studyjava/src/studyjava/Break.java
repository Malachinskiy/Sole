package studyjava;

public class Break {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean t =true;
      
      first: {
    	  second: {
    	    third: {
    	      System.out.println("Перед оператором Break");
    	      if (t) break second;
    	      System.out.println("Не выполняется");
                    }
           System.out.println("не Выполняеться");
                   }
      System.out.println("Выполняется");
             }
	}

}
