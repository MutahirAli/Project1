package comsats.sc.decorator;

public abstract class PizzaDecorator implements Pizza {
	
    protected Pizza pizza;
	public String getDesc() {

		return "Toppings";

	}

}
