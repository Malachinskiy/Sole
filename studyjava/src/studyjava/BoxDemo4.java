package studyjava;

class BoxFour {

	static double height;
	static double width;
	static double depth;

	private BoxFour() {
		// TODO Auto-generated constructor stub
	}

	static double volume() {
		return height * width * depth;

	}
}

public class BoxDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BoxFour mybox1 = new BoxFour();
		// BoxFour mybox2 = new BoxFour();


		BoxFour.height = 10;
		BoxFour.width = 20;
		BoxFour.depth = 15;

		BoxFour.height = 3;
		BoxFour.width = 6;
		BoxFour.depth = 9;

		double vol = BoxFour.volume();
		System.out.println("־בüול נאגום:" + vol);

		vol =BoxFour.volume();
		System.out.println("־בüול נאגום:" + vol);
	}

}
