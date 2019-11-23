/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author marhoum
 */
public class JUnit3TestSuite extends TestCase {

    public JUnit3TestSuite(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("JUnit3TestSuite");
        suite.addTest(new TestSuite(sample.VectorsJUnit3Test.class));
        suite.addTest(new TestSuite(sample.UtilsJUnit3Test.class));
        return suite;
    }

}
