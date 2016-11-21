package comsats.sc.decorator;

public class GreenOlives extends PizzaDecorator {
	//private final Pizza pizza;

	public GreenOlives(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public String getDesc() {

		return pizza.getDesc() + ",  GreenOlives";

	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 25.00;

	}

}
