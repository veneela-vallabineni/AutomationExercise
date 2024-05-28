package Scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generics.BaseClass;
import pompages.Test_Class_Page;

public class Test_class extends BaseClass {
	
@Test
public void TestCases() {
	Test_Class_Page testcase = new Test_Class_Page(driver);
	SoftAssert softassert = new SoftAssert();
	softassert.assertTrue(testcase.webpage_logo().isDisplayed());
	testcase.testcase_module();
	softassert.assertEquals(testcase.test_case_header().getText(), "TEST CASES");
	softassert.assertAll();
}
}
