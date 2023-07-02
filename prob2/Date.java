package week_3;

public class Date{
	public int day, month, year;
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String DateToString() {
		return new String("[" + day + ' ' + month + ' ' + year + ']');
	}
}
