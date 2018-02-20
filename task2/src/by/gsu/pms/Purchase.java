package by.gsu.pms;



public class Purchase implements Comparable<Purchase> {

	public final static String COMMODITY_NAME="Meat";
	public final static int COMMODITY_PRICE = 110 ;
	private int units;
	private WeekDay weekDay;
	public Purchase() {
		
	}
	public Purchase(int units, WeekDay weekDay) {
		this.units=units;
		this.weekDay=weekDay;
		
	}
	public Purchase(int units, int weekDay) {
		this(units,WeekDay.values()[weekDay]);
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public WeekDay getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay;
	}
	public int getCost(){
		double total;
	    total=COMMODITY_PRICE*units;
	    return (int) total ; 
	}
	@Override
	public String toString() {
		return units + ";"+weekDay+";"+ConvertToBYN.convertToByn(getCost(), 100, 2);	
		}
	
	public int compareTo(Purchase arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


}
