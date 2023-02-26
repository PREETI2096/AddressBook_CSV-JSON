package com.bridgelabz.addressbookcsvjson;

public class Contacts {
	private int count;
	private String f_name; // first name
	private String l_name; // last name
	private String address;
	private String city;
	private String state;
	private String zip;
	private String ph_no; // phone number
	private String email;

	public Contacts(int count2, String f_name2, String l_name2, String address2, String city2, String state2,
			String zip2, String ph_no2, String email2) {
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacts [count=" + count + ", f_name=" + f_name + ", l_name=" + l_name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", ph_no=" + ph_no + ", email=" + email
				+ "]";
	}

}
