package builder1;

public class TestBuilder1 {

	public static void main(String[] args) {
		PizzaBuilder capricciosaBuilder = new CapricciosaBuilder();
		PizzaChef pizzaChef = new PizzaChef(capricciosaBuilder);
		
		pizzaChef.makePizza();
		
		Pizza pizza = pizzaChef.getPizza();
		
		System.out.println("We made: " + pizza);

	}

}
