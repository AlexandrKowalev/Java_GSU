package by.gsu.pms;

public class Ward {
	private String Surname;
	private int AllPlace;
	private int FreePlace;
  
	public Ward() {
	}
	public Ward(String Surname, int AllPlace,int FreePlace) {
		this.Surname=Surname;
		this.AllPlace=AllPlace;
		this.FreePlace=FreePlace;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getAllPlace() {
		return AllPlace;
	}
	public void setAllPlace(int allPlace) {
		AllPlace = allPlace;
	}
	public int getFreePlace() {
		return FreePlace;
	}
	public void setFreePlace(int freePlace) {
		FreePlace = freePlace;
	}
	@Override
	public String toString() {
		return "Surname= " + Surname +"; "+ "AllPlace= " + AllPlace +"; "+ "FreePlace= " + FreePlace;
	}
	
	
}
