import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentDemo {
	
	static ExtentReports reports;
	static ExtentTest logger;
	
	
	/*
	 *  This code i have shared with you over GITHub
	 */
	
	public static void main(String[] args) {
		
		String fileName=new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
		String path="C:\\Users\\aksha.LAPTOP-SGOR8S9O\\OneDrive\\Desktop\\ExtentReport\\"+fileName;
		
		reports = new ExtentReports(path);
		logger = reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO,"We have Entered valid email id");
		logger.log(LogStatus.PASS,"Enter email id");
		logger.log(LogStatus.INFO,"We have Entered valid password");
		logger.log(LogStatus.PASS,"Enter password");
		logger.log(LogStatus.PASS,"Click on Login");
		
		logger = reports.startTest("Remember Me");
		logger.log(LogStatus.INFO,"We have Entered valid email id");
		logger.log(LogStatus.PASS,"Enter email id");
		logger.log(LogStatus.INFO,"We have Entered valid password");
		logger.log(LogStatus.PASS,"Enter password");
		logger.log(LogStatus.FAIL,"Click on Remember Me");
		logger.log(LogStatus.FAIL,"Click on Login");
		
		reports.endTest(logger);
		reports.flush();
	}

}
