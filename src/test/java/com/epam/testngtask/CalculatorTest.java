package com.epam.testngtask;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Date;

public class CalculatorTest {
    protected Calculator testSubject;

    public CalculatorTest() {
        initCalc();
    }

    public void initCalc() {
        testSubject = new Calculator();
    }
    protected void checkTime(){
        System.out.println("Current Time:  "+ new Date(System.currentTimeMillis()));
    }

//    @BeforeClass (groups = {"positive", "negative"})
//    public void setUp(){
//       System.out.println("Starting execution ... ");
//    }
//    @AfterClass(groups = {"positive", "negative"})
//    public void showResult(){
//        System.out.println("Execution is done ...");
//    }

    @Test (groups = "positive", expectedExceptions = {java.lang.NumberFormatException.class})
    public void testDiv() {
        double res1 = testSubject.div(3,0);
        Assert.assertEquals(res1, 1.5, "Invalid result of division");
        checkTime();
        Timeout.sleep(2);
    }

    @Test (groups = "positive")
    public void testSqrt() {
        double res3 = testSubject.sqrt(10);
        Assert.assertEquals(res3, Math.sqrt(10), "Invalid result of sqrt");
        checkTime();
        Timeout.sleep(2);
    }

    @Test (groups = "positive")
    public void testSin() {
        double res4 = testSubject.sin(45);
        Assert.assertEquals(res4, Math.sin(45), "Invalid result of sin");
        checkTime();
        Timeout.sleep(2);
    }

    @Test (groups = "negative")
    public void testisNegative() {
        boolean res6 = testSubject.isNegative(5);
        Assert.assertNotEquals(res6, true, "Is not negative");
        checkTime();
    }

    @Test (groups = "negative")
    public void testisPositive() {
        boolean res7 = testSubject.isPositive(-5);
        Assert.assertFalse(res7, "Is positive");
        checkTime();
    }

    @Test (groups = "negative")
    public void testSub() {
        long res8 = testSubject.sub(8,6);
        Assert.assertNotEquals(res8,(long) 1, "Ivalid result of sub ");
        checkTime();
    }

    @Test (groups = "negative")
    public void testCtg() {
        double res9 = testSubject.ctg(90);
        Assert.assertNotEquals(res9, -5, "Ivalid result of sub ");
        checkTime();
    }

    @Test (dataProvider = "dataProviderForSum", groups = {"positive", "negative"})
    public void sumCheck (long first, long second, long expected){
        long sum = testSubject.sum(first, second);
        Assert.assertEquals(sum, expected);
        checkTime();
    }
    @DataProvider(name = "dataProviderForSum")
    public Object[][] dataProvider() {
        return new Object[][] {
                {3, 2, 5},
                {10, 100, -90}};
        }
    }
