package com.ycc.redbaby;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import com.ycc.redbaby.net.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    private static final String TAG = "ApplicationTest";

    public ApplicationTest() {
        super(Application.class);
    }

    /**
     * 测试post请求
     */
    public void testHttpPost(){
        HttpClientUtil util = new HttpClientUtil();
        Map<String,String> params = new HashMap<String,String>();
        params.put("version","1");
        String address = ConstantValue.CATEGORY;
        String json = util.sendPost(address,params);
        System.out.println("===================json:"+json);
        Log.i(TAG,json);
    }
}