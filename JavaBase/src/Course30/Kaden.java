package Course30;

public class Kaden {
	private String name;
	private int price;
	private String category;

	public String getName() {
		return name;
	}

	//名前設定用メソッド
		public void setName(String name) {
			//もし設定予定のパラメータが「マウス」なら
			//在庫切れ商品のためNGとする
			if(name.equals("マウス")) {
			this.name = "設定NG";
			
			} else {
				//そうでないなら受け取った名前を設定
				this.name = name;
			}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	
	
	//↑教科書p243.244くらいの内容
	
}
