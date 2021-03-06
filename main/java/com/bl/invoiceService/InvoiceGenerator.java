package com.bl.invoiceService;

public class InvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PERKM = 10;
	private static final double MimFare = 5;

	public double calculateFare(double distance, int time) {

		double totalFare = distance * MINIMUM_COST_PERKM + time * COST_PER_TIME;
		if (totalFare < MimFare)

			return MimFare;
		return totalFare;
	}

	public double calculateFare(Ride[] rides) {

		double totalfare = 0;

		for (Ride ride : rides) {
			totalfare += this.calculateFare(ride.distance, ride.time);
		}
		return totalfare;

	}


	
}
