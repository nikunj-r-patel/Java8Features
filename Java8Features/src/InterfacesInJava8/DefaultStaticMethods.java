package InterfacesInJava8;
public class DefaultStaticMethods {
	public static void main(String[] args) {
		Car car = new Car();
		car.runnig();
		String str = Vehical.producer();
		System.out.println(str);
		String newCar = car.getOverview();
		System.out.println(newCar);
	}
}
class Car implements Vehical {
}
