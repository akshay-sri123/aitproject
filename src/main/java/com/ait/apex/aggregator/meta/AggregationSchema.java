package com.ait.apex.aggregator.meta;

import com.ait.apex.row.RowMeta;

public class AggregationSchema {
	
	public int id;
	public RowMeta rowSchema;
	
	public AggregationSchema() {
		rowSchema = new RowMeta();
	}
	
	@Override
	public String toString() {
		return "AggregationSchema{" +
				"id=" + id +
				", rowSchema=" + rowSchema +
				'}';
	}
}
