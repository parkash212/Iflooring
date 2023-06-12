package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports report;
	public ExtentTest test;
	String repName;
	
	 public void onStart(ITestContext context) {
		    String timestamp = new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
		    repName = "Test-Report-" + timestamp + ".html";
		    sparkReporter = new ExtentSparkReporter(".\\Reports\\" + repName); //specify location of report
		    sparkReporter.config().setDocumentTitle("iflooring Test Report"); // title of the report
		    sparkReporter.config().setReportName("iflooring customer dashboard");
		    sparkReporter.config().setTheme(Theme.DARK);
		  }


	      public void onTestSuccess(ITestResult result) {
		    // not implemented
		  }

	      public void onTestFailure(ITestResult result) {
		    // not implemented
		  }

	      public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

	     
	      public void onFinish(ITestContext context) {
		    // not implemented
		  }
		}


