package com.hao.base;

import com.hao.base.common.MicroServiceApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MybatisApplicationTests {

    /**
     * 添加多个api接口静态常量
     */
    @Test
    public void contextLoads() {
        //方法名数组
        String[] arrs = {"add1", "ddd2"};
        String news = "";
        String activity = "";
        String competition = "";
        String user = "";
        String chat = "";
        for (int i = 0; i < arrs.length; i++) {
            news += "public final static String API_NEWS_"+ arrs[i].toUpperCase() +" = \"http://\" + NEWS_SERVICE_NAME + \"/news/"+ arrs[i].toLowerCase() +"\";";
            activity += "public final static String API_ACTIVITY_"+ arrs[i].toUpperCase() +" = \"http://\" + ACTIVITY_SERVICE_NAME + \"/activity/"+ arrs[i].toLowerCase() +"\";";
            competition += "public final static String API_COMPETITION_"+ arrs[i].toUpperCase() +" = \"http://\" + COMPETITION_SERVICE_NAME + \"/competition/"+ arrs[i].toLowerCase() +"\";";
            user += "public final static String API_USER_"+ arrs[i].toUpperCase() +" = \"http://\" + USER_SERVICE_NAME + \"/user/"+ arrs[i].toLowerCase() +"\";";
            chat += "public final static String API_CHAT_"+ arrs[i].toUpperCase() +" = \"http://\" + CHAT_SERVICE_NAME + \"/chat/"+ arrs[i].toLowerCase() +"\";";
        }
        System.err.println(news);
        System.err.println(activity);
        System.err.println(competition);
        System.err.println(user);
        System.err.println(chat);
    }

}
