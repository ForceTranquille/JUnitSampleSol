/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Sample JUnit-4-style test suite.
 *
 * @author marhoum
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({sample.VectorsJUnit4Test.class, sample.UtilsJUnit4Test.class})
public class JUnit4TestSuite {

}
