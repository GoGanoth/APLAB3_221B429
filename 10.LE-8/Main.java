public class Main
{
	public static void main(String[] args) {
		Crow crow = new IndianCrow();
		CrowAdapter swan = new CrowAdapter(crow);
		client(swan);
	}
	
	public static void client(Swan swan) {
	    swan.swim();
	    swan.sing();
	    swan.eat();
	}
}
