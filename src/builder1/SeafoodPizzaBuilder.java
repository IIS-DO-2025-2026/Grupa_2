package builder1;

public class SeafoodPizzaBuilder implements PizzaBuilder{
	private Pizza pizza;
	
	public SeafoodPizzaBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void putDough() {
		pizza.setDough("integralno");
		
	}

	@Override
	public void putSauce() {
		pizza.setSauce("paradajz sos");
		
	}

	@Override
	public void putCheese() {
		pizza.setSauce("gauda");
		
	}

	@Override
	public void putMeat() {
		pizza.setMeat("morski plodovi");
		
	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
