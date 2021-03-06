/*
 * oxCore is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */package org.xdi.model.metric.counter;

import java.util.Date;

import org.gluu.site.ldap.persistence.annotation.LdapAttribute;
import org.gluu.site.ldap.persistence.annotation.LdapJsonObject;
import org.xdi.model.metric.ldap.MetricEntry;

/**
 * Metric entry which represents numeric value
 *
 * @author Yuriy Movchan Date: 07/27/2015
 */
public class CounterMetricEntry extends MetricEntry {

    @LdapJsonObject
    @LdapAttribute(name = "oxData")
	private CounterMetricData metricData;

	public CounterMetricEntry() {}

	public CounterMetricEntry(String dn, String id, Date creationDate, CounterMetricData metricData) {
		super(dn, id, creationDate);

		this.metricData = metricData;
	}

	public CounterMetricData getMetricData() {
		return metricData;
	}

	public void setMetricData(CounterMetricData metricData) {
		this.metricData = metricData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CounterMetricEntry [metricData=").append(metricData).append(", toString()=").append(super.toString()).append("]");
		return builder.toString();
	}

}
