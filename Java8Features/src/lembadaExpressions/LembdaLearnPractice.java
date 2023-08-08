package lembadaExpressions;
public class LembdaLearnPractice {
	public static void main(String[] args) {
		MyInterface myInter = new MyInterfaceImpl();
		System.out.println("------MY INTERFACE------------");
		myInter.hello();
		MyInterface myIntAnony = new MyInterface() {
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("this is my first anonymous class");
			}
		};
		myIntAnony.hello();
		MyInterface myIntAnony2 = new MyInterface() {
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("this is my second anonymous class");
			}
		};
		myIntAnony2.hello();
		MyInterface interLembda = () -> {
			System.out.println("this is using lembda expression");
		};
		interLembda.hello();
		System.out.println("------SUM INTERFACE------------");
		SumInterface sumTwoNo=(int no1,int no2)->{return no1+no2;};
		System.out.println(sumTwoNo.sumOfTwoNo(20, 50));
		System.out.println(sumTwoNo.sumOfTwoNo(50, 40));
		sumTwoNo=(no1,no2)->no1+no2;
		System.out.println(sumTwoNo.sumOfTwoNo(2, 5));
		System.out.println("------LENGTH INTERFACE------------");
		LengthInterface strLength=string->string.length();
		System.out.println(strLength.getLength("nikunj"));
		
	}
}
