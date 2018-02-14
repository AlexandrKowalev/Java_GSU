package by.gsu.pms;

import by.gsu.pms.ConvertToBYN;

public class BusinessTrip {
	private String account;
	private int transport;
	private int days;
	private final static int DAILY_ALLOWANCE=600;
	
	public BusinessTrip() {
		
	}

	public BusinessTrip(String account, int transport, int days) {
		super();
		this.account = account;
		this.transport = transport;
		this.days = days;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getTransport() {
		return transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	private int getTotal() {
		double total;
		total = DAILY_ALLOWANCE*days+transport;
		return (int)Math.round(total/100)*100;
	}

	public void show() {
		System.out.println("rate= "+ConvertToBYN.convertToByn(DAILY_ALLOWANCE, 100, 2));
		System.out.println("account= "+account);
		System.out.println("transport= "+ConvertToBYN.convertToByn(transport, 100, 2));
		System.out.println("days= "+days);
		System.out.println("total= "+ConvertToBYN.convertToByn(getTotal(), 100, 2));
		System.out.println("=============================");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ConvertToBYN.convertToByn(DAILY_ALLOWANCE, 100, 2) +"; " + account +"; " + ConvertToBYN.convertToByn(transport, 100, 2) + "; "+ days+ "; "+ConvertToBYN.convertToByn(getTotal(), 100, 2);
	}

}
