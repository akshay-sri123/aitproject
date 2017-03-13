package com.ait.apex.aggregator.operations;

import com.ait.apex.aggregator.meta.AggregationMetrics;
import com.ait.apex.aggregator.meta.AggregationSchema;
import com.ait.apex.row.EntryField;
import com.ait.apex.row.Row;
import com.ait.apex.row.RowValueFunctions;

import java.util.Map;

public class Operations
{
	long max;
	public Map<Row, Row> operations(Row rowEntry, AggregationMetrics metrics, AggregationSchema schema, Map<Row, Row> resultMap)
	{
		Row valRow;
		RowValueFunctions rowValueFunctions = new RowValueFunctions();
		switch (metrics.getAggTypes())
		{
			case MAX:
				if(resultMap.containsKey(rowEntry))
				{

				}
				else
				{
				}
				break;
			case MIN:
				
				break;
			case COUNT:
								
				break;
			case SUM:
			{
				
			}
			case AVG:
				break;
		}
		return resultMap;
	}
}
