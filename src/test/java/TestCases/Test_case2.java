package TestCases;

import org.testng.annotations.Test;

import BasePackage.baseClass;
import Baseclass.Staff_dashboard;

public class Test_case2 extends baseClass {
	@Test(groups = {"sanity "})
	public void staff_account() {
	Staff_dashboard sd = new Staff_dashboard(driver);
	sd.sendname("admin@admin.com1");
	sd.sendpassword("111111");
	sd.sendbutton();
	sd.sendstatus();
	sd.sendtable();
	sd.setstaffvalue();
	sd.sendsave();
	sd.sendtester(null);
	sd.sendsubmission();
}
}