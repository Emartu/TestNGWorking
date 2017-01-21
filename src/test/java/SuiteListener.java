import org.testng.ISuite;
import org.testng.ISuiteListener;


public class SuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {System.out.println("Suite execution is started: " + suite.getName() );}

    @Override
    public void onFinish(ISuite suite) {System.out.println("Suite execution is finished.. " + suite.getName());}
}
