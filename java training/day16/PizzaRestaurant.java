public class PizzaRestaurant {
	
	public void takeOrder(CheesePizza pizza){
		pizza.prepare();
		pizza.addCheese();
		pizza.bake();
	}

	public void takeOrder(NonCheesePizza pizza){
		pizza.prepare();
		pizza.addTopping();
		pizza.bake();
	}

}