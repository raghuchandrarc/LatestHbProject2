package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.test.Sampletest;

public class Constants {
	//static String Fpath = " ";
	
/*	public static String setScenario(String path) {
		String Fpath = " ";
		
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("F:/rc/Hybrid Keyword Driven/Hybrid Keyword Driven/src/config/scenarioName");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			Fpath = prop.getProperty("" + path);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("assssssssssssssssssss "+Fpath);
		 
		return Fpath;

	}*/

	//System Variables
	//public static final String URL = "http://www.store.demoqa.com";
	//public static final String Path_TestData = "F:/rc/Hybrid Keyword Driven/Hybrid Keyword Driven/src/dataEngine/DataEngine.xlsx";
	public static final String Path_TestData = Sampletest.setScenario();
	public static final String Path_OR = "F:/rc/Hybrid Keyword Driven/Hybrid Keyword Driven/src/config/OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	
	//Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4 ;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_RunMode =2 ;
	public static final int Col_Result =3 ;
	public static final int Col_DataSet =6 ;
	public static final int Col_TestStepResult =7 ;
 	
	// Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases = "Test Cases";
	//public static final String Sheet_TestCases = "scenario name";
	/*
	public static final String Sheet_TestCases = "scenario name";
	public static final String Sheet_TestSteps = "scenario steps";*/
	
	// Test Data
	public static final String UserName = "testuser_3";
	public static final String Password = "Test@123";



}
