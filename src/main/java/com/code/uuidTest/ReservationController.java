package com.code.uuidTest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.driver.core.utils.UUIDs;

@RestController
@RequestMapping(value = "/")
public class ReservationController {
	
	private final CassandraReservationRepository cassandraReservationRepository;
	

	public ReservationController(CassandraReservationRepository cassandraReservationRepository) {
		this.cassandraReservationRepository = cassandraReservationRepository;
	}
	
	@RequestMapping(value = "/cassandra", method = RequestMethod.GET)
	public List<Request> getMAllUsers() {
		List<Request> req = new ArrayList<Request>();
		Request req1 = new Request();
		req1.setUuid(UUIDs.timeBased());
		req1.setOrderId("sdasda");
		Request req2 = new Request();
		req2.setUuid(UUIDs.timeBased());
		req2.setOrderId("qqqqq");
			req.add(req1);
			req.add(req2);
		return req;
	}
	
	@RequestMapping(value = "/cassandra/create", method = RequestMethod.POST)
	public CReservation addMNewUsers(@RequestBody CReservation reservation) {
		return cassandraReservationRepository.save(reservation);
	}
	
}
