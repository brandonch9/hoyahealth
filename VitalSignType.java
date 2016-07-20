package com.hh.common.care.domain;


public enum VitalSignType{
	RespiratoryRate("",0,"9","21-29","min"),
	BodyTemperature("Body Temperature",1,"35","39","c"),
	BloodPresureSystolic("",2,"81-90","200","mmHg"),
	LevelOfConsciousness("",3,"","P","domain"),
		//A = Alert
		//V= Rousable to voice
		//P = Rousable to pain
		//U = Unrousable
	PulseRate("",4,"40","111-120","min"),
	OxygenSaturations("",5,"85","","%"),//SpO2
	UrineOutput("",6,"11-20","",""),
	PainAssessment("",6,"","",""),
	BloodPresureDiastoic("",6,"","",""),
	BloodPressureMAP("",6,"","",""),
	BodyMassIndex("",6,"","",""),
	BloodSugar("",6,"","",""),//Glucose,
	hbA1c("",6,"","",""),
	FEV1("",6,"","",""),
	BedSoreIndicator("",6,"1","",""),
	FallIndicator("",6,"","","");
	
	private final String name;
	private final int value;
	private final String lowThreshold;
	private final String highThreshold;
	private final String uomSymbol;
	
	VitalSignType(String name,int value,String lowThreshold,String highThreshold,String uomSymbol){
		this.name = name;
		this.value = value;
		this.lowThreshold = lowThreshold;
		this.highThreshold = highThreshold;
		this.uomSymbol = uomSymbol;		
	}

	protected String getName() {
		return name;
	}

	protected int getValue() {
		return value;
	}

	protected String getLowThreshold() {
		return lowThreshold;
	}

	protected String getHighThreshold() {
		return highThreshold;
	}

	protected String getUomSymbol() {
		return uomSymbol;
	}
	
	
}
/**
 * NEWS (National Early Warning Score) –: 
 * The NEWS is a standardised physiological assessment tool, designed to monitor and track 
 * acutely and critically ill patients, which enforces the necessity of early escalation and 
 * clinical review. The NEWS is based on a simple scoring system in which a score is allocated
 *  to physiological measurements already undertaken when patients present to, or are being
 *  monitored in hospital.
 * Six simple physiological parameters form the basis of the NEWS scoring system: 
 * respiratory rate,
 * oxygen saturations, 
 * temperature, 
 * systolic blood pressure, 
 * pulse rate and 
 * level of consciousness
 * Body Tempature
 * Urine Output, an output of less than 0.5 ml/kg/hour for 2consecutive hours 
 * is a marker of renal hypoperfusion and should trigger assessment and further action
 * Height BMI (body mass index) evaluation BMI>25 -->A1,A2 adn A3\
 * Weight
 * Pulse Rate (A pulse rate measurement value range 60<pulseRate<100
 * BloodPressure (systolic) DP value<70 and SP value<100mmHg
 * BloodPressure(diastoic) DBValue>90 and SP value>140 mmHg
 * BlokPresure (MAP) DB>120 mmHg
 * SpO2 SpO2 <90%
 * FEV1 Testing with sprometry determines the presence and severity of the airw obstruction.
 * configure alarm FEV1<80% COPD SLIGHT
 * Glucose a glucose value of of this range will trigger an alarm glucose<80 or glucose >126 mgDl
*  respiratory rate
*   Blood Sugar
* Pain assessment
* level of consciousness.
* 
* Medication
* SmokedCigarettes
* PatientLocation
* BedSore
* RoomTemperature
* Room humididy
* Health Test Questionaire  - COPD specifiec test 
**/
