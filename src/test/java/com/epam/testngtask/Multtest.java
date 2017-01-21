package com.epam.testngtask;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Multtest {
private Calculator testSubject;
    public Multtest() {
        initCalc();
    }

    public void initCalc() {
        testSubject = new Calculator();

    }
    @Parameters({"first", "second", "expected"})
    @Test(groups = "positive")
    public void testMult(@Optional("10") int first, @Optional("20") int second, @Optional("200.0") long expected) {
        double res10 = testSubject.mult(first, second);
        Assert.assertEquals((long)res10, expected);
    }
}
