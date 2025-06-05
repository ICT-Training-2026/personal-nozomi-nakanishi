package store;

public class NomalProduct extends AbsProduct implements Deliverable{

	public NomalProduct(String name, int price) {
		super(name, price);
	}

	@Override
	public void display() {
		System.out.println(getNameAndgetPrice());
	}
	public void displayDeliv() {
		System.out.println("【通常送料500円】" + getNameAndgetPrice());
	}
}
