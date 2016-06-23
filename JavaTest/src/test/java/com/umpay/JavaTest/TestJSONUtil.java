package com.umpay.JavaTest;

import java.util.List;
import org.apache.struts2.json.JSONUtil;
import org.junit.Test;

public class TestJSONUtil {
    
    @Test
    public void test11(){
       Integer i = null ; 
       String j = i + "";
       
       System.out.println(j==null ? true : false);
        
    }

    @Test
    public void test(){
        List<String> asList = JSONUtil.asList("{'0':1,'1':hello}");
        System.out.println(asList);
    }
    
}
