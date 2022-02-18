package stiw3034.group2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import stiw3034.group2.testcases.*;

/**
Class : STIW3034 SOFTWARE TESTING & QUALITY ASSURANCE
 */
@RunWith(Suite.class)
@SuiteClasses({
        // written by ilham
        SearchFlightTest.class,
        SearchHotelTest.class,
        SavedListTest.class,
       // written by Idah
       LoginTest.class,
       RegisterTest.class,
       // written by ida ayu
       JRSearchTest.class,
       XperienceSearchTest.class

})
public class TestRunner {
}
