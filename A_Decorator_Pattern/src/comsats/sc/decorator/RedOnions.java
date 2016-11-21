package comsats.sc.decorator;

public class RedOnions extends PizzaDecorator {

	//private Pizza pizza;

	public RedOnions(Pizza pizza) {
		this.pizza=pizza;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 15.00;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return pizza.getDesc() + "    RedOnions";
	}

}
