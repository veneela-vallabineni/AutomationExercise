package generics;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListeners  extends BaseClass implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		getScreenShot(result.getMethod().getMethodName() + ".jpg");
	}
	
	
	
	
	
	
	
	
	
}
