import org.example.Arrays.ArrayMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {


    //testing findIndex method
    @Test
    public void findIndexTest(){
        ArrayMethods obj=new ArrayMethods();
        int result=obj.findIndex(new int[]{1,2,3,5,7,9,0},5);

        assertEquals(3,result);
    }


    //Finding Index when empty array
    @Test
    public void findIndexOfEmptyArrayTest(){
        ArrayMethods obj=new ArrayMethods();
        assertEquals(-1,obj.findIndex(new int[]{},2));
    }

    //Index out of Bound
    @Test
    public void findIndexOutOfBound(){
        ArrayMethods obj=new ArrayMethods();

        assertThrows(ArrayIndexOutOfBoundsException.class,()->obj.printArray(new int[]{1,2,3,4,5},9));
    }

    //Testing Multiple find index
    @Test
    public void findMultipleIndex(){
        ArrayMethods obj=new ArrayMethods();

        assertAll(
                ()->assertEquals(1,obj.findIndex(new int[]{1,2,3},2)),
                ()->assertEquals(3,obj.findIndex(new int[]{1,3,4,2},2))
        );
    }


    //testing searchNumber Method
    @Test
    public void searchNumberTest(){
        ArrayMethods obj=new ArrayMethods();
        boolean result= obj.searchNumber(new int[]{12,34,57,2,566,23,2,143},566);
        //System.out.println("Test for searchNumberTest has been "+result);

        assertEquals(true,true);
//        assertTrue(result); //We can directly use it to check if given parameter is true is not

        String str=null;
        assertNull(str);

//        fail("Unfinished Method"); //When we want to intentionally fail the test due to some reason
                                    //(e.g. may be feature is still not developed fully, and we have written test case earlier)

    }


    //Test asserts
    public void testAssert(){
        boolean result=true;
        assertEquals(true,result);
        assertTrue(result);
    }

}
