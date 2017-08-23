public class Main {
	
	public static void main(String[] args){
		PizzaRestaurant restaurant = new PizzaRestaurant();
		restaurant.takeOrder(new CheesePizza());
		restaurant.takeOrder(new ThinCrustPizza());
	}

}