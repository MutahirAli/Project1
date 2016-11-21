package comsats.sc.decorator;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza pizza = new VegPizza();
        
		pizza = new RedOnions(pizza);

		pizza = new GreenOlives(pizza);

		pizza = new Cheese(pizza);

		System.out.println("Desc: " + pizza.getDesc());

		System.out.println("Price: " + pizza.getPrice());

		pizza = new NonVegPizza();

		pizza = new Chicken(pizza);

		pizza = new GreenOlives(pizza);

		pizza = new Cheese(pizza);

		System.out.println("Desc: " + pizza.getDesc());

		System.out.println("Price: " + pizza.getPrice());

	}

}
