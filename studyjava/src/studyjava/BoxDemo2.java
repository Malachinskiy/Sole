package studyjava;

class Boxe {
	double height;
	double width;
	double depth;
}

public class BoxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Boxe mybox1 = new Boxe ();
      Boxe mybox2 = new Boxe ();
      double vol;
      
      mybox1.height = 10;
      mybox1.width = 20;
      mybox1.depth = 15;
      
      mybox2.height = 3;
      mybox2.width = 6;
      mybox2.depth = 9;
      
      vol = mybox1.height * mybox1.width * mybox1.depth;
      System.out.println(vol);
      
      vol = mybox2.height * mybox2.width * mybox2.depth;
      System.out.println(vol);
	}

}
