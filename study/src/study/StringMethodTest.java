package study;

import org.testng.annotations.Test;

/**
 *
 */
public class StringMethodTest {

    @Test
    public void test1(){
        String s1="HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        //System.out.println(s1.charAt(10));
        System.out.println(s1.isEmpty());

        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "  he llo  w orld";
        String s4 = s3.trim();
        System.out.println(s3);
        System.out.println(s4);

    }

    @Test
    public void Test2(){
        String s1 = "ABC";
        String s2 = "abc";
        System.out.println(s1.concat(s2));

        String s3 = "abc";
        String s4 = "abd";
        System.out.println(s3.compareTo(s4));

        String s7 = "abcdef";
        System.out.println(s7.substring(2,4));
    }

    @Test
    public void  Test3(){
        String str1 = "helloworld";
        System.out.println(str1.endsWith("ld"));
        System.out.println(str1.startsWith("H"));
        System.out.println(str1.startsWith("ll",2));
        System.out.println(str1.contains("LL"));
        System.out.println(str1.indexOf("lod"));
        System.out.println(str1.indexOf("lo",5));
        System.out.println(str1.lastIndexOf("or"));
        System.out.println(str1.lastIndexOf("or",5));
    }

    @Test
    public void Test4(){
        String str1 = "1a2b3c4d5e6f";
        String str2 = str1.replace('a','A');

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.replaceAll("\\d+",","));
        System.out.println(str1.matches("\\d+"));
        String[] strs = str1.split("\\d+");
        for (int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
}
