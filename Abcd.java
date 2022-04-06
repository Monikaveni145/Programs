package tamilnadu.chennai;

public class Abcd implements pqr {
	private int no1, no2, no3, no4;

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int getNo3() {
		return no3;
	}

	public void setNo3(int no3) {
		this.no3 = no3;
	}

	public int getNo4() {
		return no4;
	}

	public void setNo4(int no4) {
		this.no4 = no4;
	}

	public static void main(String[] args) {
		System.out.println("welcome to java ");
		System.out.println("idiot");
		Abcd aa = new Abcd();
		Abcd bb = new Abcd(11, 12, 13, 14);
		aa.display(5, "Praveen");
	}

	public Abcd(int no1, int no2, int no3, int no4) {
		super();
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
		this.no4 = no4;
	}

	public Abcd() {
		// TODO Auto-generated constructor stub
	}

	private void display(int no, String name) {
		// TODO Auto-generated method stub
		System.out.println(no);
		System.out.println(name);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

}
