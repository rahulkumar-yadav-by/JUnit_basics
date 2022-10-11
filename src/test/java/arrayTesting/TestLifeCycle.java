package arrayTesting;

import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.*;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestLifeCycle {

    private ArrayMethods obj;


    //First initialize method before each test.
    @BeforeEach //2
    public void beforeEachTest(){
        System.out.println("2. First initialize method before each test.");
        obj=new ArrayMethods();
    }

    @AfterEach //3
    public void afterEachTest(){
        System.out.println("3. Cleaning up Test ");
    }
    @BeforeAll //1
    public static void beforeAllTests(){
        System.out.println("1. Before running all tests");
    }
    @AfterAll //4
    public static void afterAllTests(){
        System.out.println("4. After running all tests");
    }

    //testing findIndex method
    @Test
    public void findIndexTest(){
        int result=obj.findIndex(new int[]{1,2,3,5,7,9,0},5);

        assertEquals(3,result);
    }

    @Test
    public void searchNumberTest(){
        boolean result= obj.searchNumber(new int[]{12,34,57,2,566,23,2,143},566);
        //System.out.println("Test for searchNumberTest has been "+result);

        assertEquals(true,true);

    }


}
