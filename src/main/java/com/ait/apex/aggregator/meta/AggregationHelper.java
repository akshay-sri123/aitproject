package com.ait.apex.aggregator.meta;

import com.ait.apex.row.DataType;
import com.ait.apex.row.RowMeta;

import java.util.ArrayList;
import java.util.List;

public class AggregationHelper {
	
	public List<AggregationSchema> createAggregationSchema(RowMeta originalSchema, List<AggregationMetrics> aggregationMetrics) throws NoSuchFieldException, IllegalAccessException {
		
		List<AggregationSchema> schemaList = new ArrayList<>();
		
		for (AggregationMetrics aggregationMeta : aggregationMetrics) {
			
			AggregationSchema schema = new AggregationSchema();
			
			switch (aggregationMeta.getAggTypes()) {
				case COUNT:
					schema.rowSchema = originalSchema.subset(aggregationMeta.getParameters());
					break;
				
				case SUM:
					schema.rowSchema = originalSchema.subset(aggregationMeta.getParameters());
					break;
				
				case MIN:
					schema.rowSchema = originalSchema.subset(aggregationMeta.getParameters());
					break;
				
				case MAX:
					schema.rowSchema = originalSchema.subset(aggregationMeta.getParameters());
					break;
			}
			schemaList.add(schema);
		}
		return schemaList;
	}
}
