package studyjava;

public class Break {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean t =true;
      
      first: {
    	  second: {
    	    third: {
    	      System.out.println("����� ���������� Break");
    	      if (t) break second;
    	      System.out.println("�� �����������");
                    }
           System.out.println("�� ������������");
                   }
      System.out.println("�����������");
             }
	}

}
