public class TestCalc {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		c1.setValue(4,3);
		c1.add();
		System.out.println(c1.showResult());

	}

}
