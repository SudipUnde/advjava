package day8;

public class Customer {
	private int customerId;
	private String name;
	private Address permanentAddress;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String name, Address permanentAddress) {
		this.customerId = customerId;
		this.name = name;
		this.permanentAddress = permanentAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", permanentAddress=" + permanentAddress + "]";
	}

}
