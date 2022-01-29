package stiw3034.group2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({

//call your classes that contain the test cases
        //  by ilham
        SearchFlightTest.class,
        SearchHotelTest.class,
        SavedListTest.class,
        //  by Idah
        LoginTestcase.class,
        RegisterTestCase.class,
        // by ida mera
        JRSearchTest.class,

})
public class TestRunner {
}
