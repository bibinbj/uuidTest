package com.code.uuidTest;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table("reserve")
public class CReservation {

	@PrimaryKey
    private UUID uuid;
    private String orderId;
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
    
    
}
