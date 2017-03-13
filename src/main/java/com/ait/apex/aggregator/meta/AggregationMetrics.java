package com.ait.apex.aggregator.meta;

import java.util.Arrays;

public class AggregationMetrics
{
	String[] parameters;
	AggregationTypes aggTypes;
	
	public AggregationMetrics(String[] parameters, AggregationTypes aggTypes) {
		this.parameters = parameters;
		this.aggTypes = aggTypes;
	}
	
	public String[] getParameters() {
		return parameters;
	}
	
	public void setParameters(String[] parameters) {
		this.parameters = parameters;
	}
	
	public AggregationTypes getAggTypes() {
		return aggTypes;
	}
	
	public void setAggTypes(AggregationTypes aggTypes) {
		this.aggTypes = aggTypes;
	}
	
	@Override
	public String toString() {
		return "AggregationMetrics{" +
				"parameters=" + Arrays.toString(parameters) +
				", aggTypes=" + aggTypes +
				'}';
	}
}
