package studyjava;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		for (int i = 0; i < 10; i++)
			mystack1.push(i);
		for (int i = 0; i < 20; i++)
			mystack2.push(i);

		System.out.println("Stack in mysack1:");
		for (int i=0; i<10; i++)
			System.out.println(mystack1.pop());

		System.out.println("Stack in mystack2:");
		for (int i=0; i < 10; i++)
			System.out.println(mystack2.pop());
	}

}
