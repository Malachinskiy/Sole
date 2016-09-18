package studyjava;

class Box {
	double width;
	double height;
	double depth;
}

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Box mybox = new Box();
      double vol;
      
      mybox.width = 100;
      mybox.height = 20;
      mybox.depth = 15;
      
      vol= mybox.width * mybox.height * mybox.depth;
      System.out.println("־בüול נאגום " + vol);
	}

}
