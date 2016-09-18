package studyjava;

class Shlushki {
	int suzana;
	int alissa;
	int andryu;


Shlushki () {
	suzana = 300;
	alissa = 400;
	andryu = 500;
}

int Count () {
	return suzana +alissa + andryu;
}
}
    public class Sutener1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shlushki prize = new Shlushki();
      System.out.println("Стоимость часа за три шлюхи: " + prize.Count());
	}

}
