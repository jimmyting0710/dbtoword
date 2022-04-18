package com.example.demo.ThisIsEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@Entity
@Table(name = "testcase")
public class TestCase {

	private String SPRINT;
	private String TESTCASE;
	private String SYSTEMTYPE;
	private String CHTOWNER;
	private String JOBNAME;
	private String AD;
	private String ADDESC;
	private String JCL;
	private String JCLDESC;
	@Id
	private String TID;
	private String TEST_TYPE;
	private String TESTER_ID;
	private String STATUS;
	private String PARA;
	private String SYSTEM_OPERATION;
	private String WORKSTATION_ID;
		
	
	public String getPARA() {
		return PARA;
	}
	public void setPARA(String pARA) {
		PARA = pARA;
	}
	public String getSYSTEM_OPERATION() {
		return SYSTEM_OPERATION;
	}
	public void setSYSTEM_OPERATION(String sYSTEM_OPERATION) {
		SYSTEM_OPERATION = sYSTEM_OPERATION;
	}
	public String getWORKSTATION_ID() {
		return WORKSTATION_ID;
	}
	public void setWORKSTATION_ID(String wORKSTATION_ID) {
		WORKSTATION_ID = wORKSTATION_ID;
	}
	
	
	public String getSPRINT() {
		return SPRINT;
	}
	public void setSPRINT(String sPRINT) {
		SPRINT = sPRINT;
	}
	public String getTESTCASE() {
		return TESTCASE;
	}
	public void setTESTCASE(String tESTCASE) {
		TESTCASE = tESTCASE;
	}
	public String getSYSTEMTYPE() {
		return SYSTEMTYPE;
	}
	public void setSYSTEMTYPE(String sYSTEMTYPE) {
		SYSTEMTYPE = sYSTEMTYPE;
	}
	public String getCHTOWNER() {
		return CHTOWNER;
	}
	public void setCHTOWNER(String cHTOWNER) {
		CHTOWNER = cHTOWNER;
	}
	public String getJOBNAME() {
		return JOBNAME;
	}
	public void setJOBNAME(String jOBNAME) {
		JOBNAME = jOBNAME;
	}
	public String getAD() {
		return AD;
	}
	public void setAD(String aD) {
		AD = aD;
	}
	public String getADDESC() {
		return ADDESC;
	}
	public void setADDESC(String aDDESC) {
		ADDESC = aDDESC;
	}
	public String getJCL() {
		return JCL;
	}
	public void setJCL(String jCL) {
		JCL = jCL;
	}
	public String getJCLDESC() {
		return JCLDESC;
	}
	public void setJCLDESC(String jCLDESC) {
		JCLDESC = jCLDESC;
	}
	public String getTID() {
		return TID;
	}
	public void setTID(String tID) {
		TID = tID;
	}
	public String getTEST_TYPE() {
		return TEST_TYPE;
	}
	public void setTEST_TYPE(String tEST_TYPE) {
		TEST_TYPE = tEST_TYPE;
	}
	public String getTESTER_ID() {
		return TESTER_ID;
	}
	public void setTESTER_ID(String tESTER_ID) {
		TESTER_ID = tESTER_ID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	
}