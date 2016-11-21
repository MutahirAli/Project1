package comsats.sc.decorator;

public class Cheese extends PizzaDecorator {

	//private final Pizza pizza;

	public Cheese(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDesc() {

		return pizza.getDesc() + ", Cheese";

	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 20.00;

	}

}
