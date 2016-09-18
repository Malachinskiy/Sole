package studyjava;

class Boxx {
	double height;
	double width;
	double depth;
	
	void volume () {
		System.out.println("־בüול נאגום ");
		System.out.println(height * width * depth);
	}
	
}

public class BoxDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxx mybox1 = new Boxx();
		Boxx mybox2 = new Boxx ();
		
		mybox1.height= 10;
		mybox1.width = 20;
		mybox1.depth = 15;
		
		mybox2.height = 3;
		mybox2.width = 6;
		mybox2.width = 9;
		
		mybox1.volume();
		mybox2.volume();
		

	}

}
