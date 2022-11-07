package study;

import org.testng.annotations.Test;

/**
 *
 */
public class StringBufferBuilder {

    @Test
    public void test1(){

        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);
        System.out.println(sb1.length());

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());
    }

    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);
        s1.delete(2,3);
        System.out.println(s1);
        s1.replace(2,3,"c");
        System.out.println(s1);
        s1.insert(2,"c");
        System.out.println(s1);
        System.out.println(s1.length());
        s1.reverse();
        System.out.println(s1);
        String s2 = s1.substring(1,3);
        System.out.println(s1);
        System.out.println(s2);
    }
}
