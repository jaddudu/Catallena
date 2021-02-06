package Catallena_Air;

import java.util.ArrayList;

public class VO {

	// VO -> Value Object // 다른 말로 DTO -> Data Transfer Object
	// 아이디, 비밀번호, 이름, 나이 field 작성
	// 전부 private로 걸기

	// 회원 정보 담기
	private String id;
	private String pw;
	private String first_name;
	private String last_name;
	private String birth;
	private String phone;
	private String passport;

	// 노선 정보 담기
	private String departure;

	private String destination;
	private String day;

	private String price;
	private String departure_time; // 출발시간
	private String arrival_time; // 도착시간
	private String flight; // 편명

	public VO(String departure, String destination, String day) {
		super();
		this.departure = departure;
		this.destination = destination;
		this.day = day;
	}
	

	public VO(String price, String departure_time, String arrival_time, String flight) {
		super();
		this.price = price;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.flight = flight;
	}

	public String getday() {
		return day;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public VO(String destination) {
		super();
		this.destination = destination;
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

	public VO(String first_name, String last_name, String birth, String phone, String passport) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth = birth;
		this.phone = phone;
		this.passport = passport;
	}

	public VO(String id, String pw, String first_name, String last_name, String birth, String phone, String passport) {
		super();
		this.id = id;
		this.pw = pw;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth = birth;
		this.phone = phone;
		this.passport = passport;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	private String name;
	private int age;

	// 생성자
	public VO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// get, set 만들기

	public VO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
