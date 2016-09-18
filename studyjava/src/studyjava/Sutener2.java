package studyjava;

class Shaboldy {
	int susa;
	int musa;
	int dusya;

	Shaboldy(int q, int w, int e) {
		susa = q;
		musa = w;
		dusya = e;
	}

	int summa() {
		return susa + musa + dusya;
	}
}

public class Sutener2 {

	public static void main(String[] args) {
		Shaboldy count = new Shaboldy(300, 400, 500);
		System.out.println("Сумма в час за трьох шлюх " + count.summa());// TODO
																			// Auto-generated
																			// method
																			// stub

	}

}
