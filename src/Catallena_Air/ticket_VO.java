package Catallena_Air;

public class ticket_VO {
	private String name;
	private String date;
	private String flight;
	private String departure;
	private String destination;
	private String departure_time;
	private String arrival_time;
	private String seat_number;
	private String reserved_number;

	public ticket_VO(String reserved_number) {
		super();
		this.reserved_number = reserved_number;
	}

	public ticket_VO(String last_name, String first_name, String date, String flight, String departure,
			String destination, String departure_time, String arrival_time, String seat_number) {

		this.name = last_name + first_name;
		this.date = date;
		this.flight = flight;
		this.departure = departure;
		this.destination = destination;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.seat_number = seat_number;
	}

	public String getReserved_number() {
		return reserved_number;
	}

	public void setReserved_number(String reserved_number) {
		this.reserved_number = reserved_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(String seat_number) {
		this.seat_number = seat_number;
	}

}
