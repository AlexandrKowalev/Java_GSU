package by.gsu.pms;

public class AbstaractPurchase {
	private int commodity;
	private int units;
	public AbstaractPurchase() {
		
	}
	public AbstaractPurchase(int commodity, int units) {
		super();
		this.commodity = commodity;
		this.units = units;
	}
	
	public int getCommodity() {
		return commodity;
	}
	public void setCommodity(int commodity) {
		this.commodity = commodity;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public void getCost() {
		return;
	}
	 void compareTo(AbstaractPurchase purchase){} ;
	@Override
	public String toString() {
		return "commodity"+";"+"units"+";"+"getCost()";
	}
    
}
