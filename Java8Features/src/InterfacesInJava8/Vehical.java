package InterfacesInJava8;
public interface Vehical {
	default void runnig() {
		System.out.println("this vehical is running");
	}
	static String producer() {
		return "SUZUKI vehicals";
	}
	default String getOverview() {
		return "Ertiga made by " + producer();
	}
}
