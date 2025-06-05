package store;

public abstract class AbsProduct {

	private String name;
	//価格
	private int price;

	protected AbsProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	public abstract void display() ; //抽象メソッド
	
	protected String getNameAndgetPrice() {
		return name + ":" + price + "円";
	}
	
	
		
}
