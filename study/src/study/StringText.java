package study;

import org.testng.annotations.Test;

/**
 *String 的使用
 */
public class StringText {

    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

    }

    public static void main(String[] args) {

    }
}
