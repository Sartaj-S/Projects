
public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	public int numberofstores()
	{
		return stores.length;
	}
	
	public void calc(){
		for(int i=0;i<stores.length;i++){
			stores[i].analyze();
		}
		System.out.printf("Hello! Your data has been processed and is ready for access!\n");
	}
	
}
