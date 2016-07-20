package com.hh.common.care.domain;

import java.util.Date;

import com.hh.common.care.task.ControlInformation;
import com.hh.core.URI;

public interface VirtalSign extends ControlInformation {
	String getName();
	String getImageUrl();
	VirtalSign getVitalSignType();
	String getLowThreshold();
	String getHighThreshold();
	String getVirtalSignValue();
	Date lastMeasureDateTime();
	URI getHistoryLink();
	int getCurrentEWS();
	String getOwner();
	String getSourceType();
	String getSourceLocation();
	String getDevice();
	String getCurrentFrenquency();
}
