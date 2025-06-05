package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NomalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {

		AbsProduct[] prod = makeProductList();
		System.out.println("\n--- 商品リスト ---");
		displayProductList(prod);

		//インタフェース
		Deliverable[] deliv = getDeliverable(prod); //配送対象の抽出
		System.out.println("\n--- 配送可能商品 ---");
		displayDelivList(deliv);
	}

	static AbsProduct[] makeProductList() {
		AbsProduct[] prod = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特価キーボード", 3600, 4500),
				new LimitedProduct("Webカメラ", 3900, 7),
				new NomalProduct("マイク", 2800),
				new SpecialProduct("ディスプレイ", 15000, 20000),
				new NomalProduct("LED照明", 4200)
		};
		return prod;
	}

	static void displayProductList(AbsProduct[] absProd) {
		for (int i = 0; i < absProd.length; i++) {
			System.out.println();
			absProd[i].display();
		}
	}

	static void displayDelivList(Deliverable[] deliv) {
		for (int i = 0; i < deliv.length; i++) {
			if (deliv[i] == null) {
				break;
			}
			System.out.println();
			deliv[i].displayDeliv();
		}
	}

	static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] deliv = new Deliverable[prod.length];
		int dCnt = 0;
		for (int i = 0; i < prod.length; i++) {
			if (prod[i] instanceof Deliverable) {
				deliv[dCnt] = (Deliverable) prod[i];
				dCnt++;
			}
		}

		return deliv;
	}

}
