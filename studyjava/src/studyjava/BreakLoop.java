package studyjava;

public class BreakLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int i = 0; i<100; i++) {
    	  if (i==10) break;
    	  System.err.println("i:" + i);
      }
	}

}
