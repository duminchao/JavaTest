package com.umpay.JavaTest;

import java.util.List;
import org.apache.struts2.json.JSONUtil;
import org.junit.Test;

public class TestJSONUtil {
    
    @Test
    public void test11(){
        
        int[] a = { 1, 3, 8, 9, 2, 4, 5, 6, 7, 0};
        
        for(int i = 0 ; i < a.length; i++){
            for(int j = i + 1; j <  )
        }
        
    }

    @Test
    public void test(){
        List<String> asList = JSONUtil.asList("{'0':1,'1':hello}");
        System.out.println(asList);
    }
    
}
