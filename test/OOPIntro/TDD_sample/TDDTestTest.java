package OOPIntro.TDD_sample;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TDDTestTest {
    TDDTest test = new TDDTest();
    static int counter = 0;
    @BeforeClass
    public static void beforeClass(){
        counter = 100;
        System.out.println("Before class, counter "+ counter);

    }
    @Before
    public void before(){
        counter = 10;
        System.out.println("Before, counter "+ counter);
        System.out.println();
    }

    @Test
    public void testAdd(){
        counter += 10;
        System.out.println("testAdd, counter "+ counter);
    }

    @Test
    public void testMinus(){
        counter -= 10;
        System.out.println("testMinus, counter "+ counter);
    }


}