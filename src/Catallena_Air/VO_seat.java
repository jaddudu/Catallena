package Catallena_Air;

public class VO_seat {
	
	private String randon;
	private String name;
	private String date;
	private String seat;
	private String flight;
	private String passport;
	private String id;
	
	
	

	public VO_seat(String randon, String name, String date, String seat, String flight, String passport, String id) {
		super();
		this.randon = randon;
		this.name = name;
		this.date = date;
		this.seat = seat;
		this.flight = flight;
		this.passport = passport;
		this.id = id;
	}
	

	//ºñÈ¸¿ø
	public VO_seat(String randon, String name,String date, String seat, String flight, String passport) {
		super();
		this.randon = randon;
		this.name = name;
		this.date = date;
		this.seat = seat;
		this.flight = flight;
		this.passport = passport;
	}
	
	
	
	public String getRandon() {
		return randon;
	}


	public void setRandon(String randon) {
		this.randon = randon;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPassport(String passport) {
		this.passport = passport;
	}


	public String getPassport() {
		return passport;
	}
	
	
	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getRandom() {
		return randon;
	}


	public void setRandom(String random) {
		this.randon = random;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSeat() {
		return seat;
	}


	public void setSeat(String seat) {
		this.seat = seat;
	}


	public String getFlight() {
		return flight;
	}


	public void setFlight(String flight) {
		this.flight = flight;
	}

	
	
}
