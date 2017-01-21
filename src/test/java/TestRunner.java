import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        final TestNG tng = new TestNG();
        tng.addListener(new TestListener());
        tng.addListener(new SuiteListener());
       final XmlSuite suite = new XmlSuite();
        suite.setName("TestNG task suite");
        suite.setSuiteFiles(
                new ArrayList<String>(){{
                    add("./src/test/resources/suites/Multtest.xml");
                }}
        );

        tng.setXmlSuites(new ArrayList<XmlSuite>(){{
            add(suite);
        }});
    tng.run();
}
    }
