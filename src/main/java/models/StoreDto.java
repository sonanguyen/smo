package models;

import javax.validation.constraints.NotNull;

public class StoreDto {
	private Integer Id;

	@NotNull(message = "Store name cannot be empty!")
	private String name;

	private String address;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
