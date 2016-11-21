package comsats.sc.decorator;

public class Chicken extends PizzaDecorator {

	//private Pizza pizza;

	public Chicken(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 100.00;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc() + "   Chicken";
	}

}
