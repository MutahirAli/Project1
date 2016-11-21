package comsats.sc.decorator;

public class NonVegPizza implements Pizza {

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "Non Veg Pizza";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600;
	}

}
