package study;

import org.testng.annotations.Test;

import java.util.Date;

/**
 *
 */
public class DateTimeTest {

    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test2(){
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime());
    }
}
