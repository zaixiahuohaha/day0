package study;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 */
public class StringTest1 {

    @Test
    public void test1(){
        String str1 = "123";
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);
        String str3 = num + "";

        System.out.println(str1 == str3);
    }

    /*
    String 与 char[] 之间的转换
     */
    @Test
    public void test2(){
        String str1 = "abc123";

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    /*
    String 与 byte[] 之间的转换
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str1.getBytes("gbk");
        System.out.println(Arrays.toString(bytes1));

        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(bytes1);
        System.out.println(str3);

        String str4 = new String(bytes1,"gbk");
        System.out.println(str4);

    }
}
