package matome;

public class Sales {
	int id;
	int qty;
	
	public Sales(int id, int qty) {
		this.id = id;
		this.qty = qty; 
	}
	
	public String toString() {
		return "Sales[id:" + id + ", qty:" + qty + "]";
	}
}


