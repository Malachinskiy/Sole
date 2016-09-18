package studyjava;

class Shluhi {
int suzana;
int anjela;
int andruha;

int FermaCount (){
	return suzana + anjela + andruha;
}

void setPrise (int s,int j, int a) {
	suzana = s;
	anjela = j;
	andruha = a;
}
}

    public class Sutener {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Shluhi count = new Shluhi();
		count.setPrise(300, 400, 500);
		System.out.println("При заказе трьох, за час: " + count.FermaCount());
	}

}
