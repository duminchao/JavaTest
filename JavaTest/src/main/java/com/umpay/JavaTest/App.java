package com.umpay.JavaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javassist.expr.Instanceof;

import org.junit.Test;

import com.umpay.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void test17(){
        String str = "11111";
        String[] split = str.split(",");
        System.out.println(split[0]);
    }
    //测试字符串+数字的结果  : 得到的为字符串
    @Test
    public void test16(){
        String str = "hello" + 0;
        System.out.println(str);
    }
    
    //map中取出value最大值对应的key
    @Test
    public void test15(){
        
        Map<String , Integer> map = new HashMap<String, Integer>();
        
        map.put("key1", 100);
        map.put("key2", 32);
        map.put("key3", 45);
        map.put("key4", 2);
        map.put("key5", 312);
        
        //获取到map中的value值
        Collection<Integer> values = map.values();
        //在collection中选出最大的vlaue值
        Integer max = Collections.max(values);
        
        String maxKey = null;  //用来保存最大值的key
        
        //通过EntrySet 找到对应的key
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() != null && entry.getValue() == max.intValue()){
                maxKey = entry.getKey();
            }
        }
        
        System.out.println(maxKey);
    }
    
    //测试日期的格式化
    @Test
    public void test14() throws ParseException{
        int day = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(format.parse("2015-10-07"));
        day = cal.get(Calendar.MONTH);
        day = day % 6;
        System.out.println(day);
    }
    
    //测试%s的意识，  %s相当于一个占位符， 用后面的字符串或变量填充
    @Test
    public void test13(){
        String str = String.format("Service.%s","123");
        System.out.println(str);
    }
   
}
