package com.auto.models;

public class updateCostRequestModel {
	
	private int requestId;
	private String status;
	private double cost;
	
	public updateCostRequestModel() {
		super();
		
	}

	public updateCostRequestModel(int requestId, String status, double cost) {
		super();
		this.requestId = requestId;
		this.status = status;
		this.cost = cost;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "updateCostRequestModel [requestId=" + requestId + ", status=" + status + ", cost=" + cost + "]";
	}
	
}
