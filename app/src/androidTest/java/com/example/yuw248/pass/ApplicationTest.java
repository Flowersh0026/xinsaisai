package com.example.yuw248.pass;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

import java.io.Console;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public ApplicationTest() {
        super(MainActivity.class);
    }

    MainActivity mainActivity;

    public void test_first(){
        mainActivity = getActivity();
        final EditText et1 = (EditText) mainActivity.findViewById(R.id.number1);
        final EditText et2 = (EditText) mainActivity.findViewById(R.id.number2);
        final Button bt = (Button) mainActivity.findViewById(R.id.myButton);
        final TextView tv = (TextView) mainActivity.findViewById(R.id.sum);

        final int cand1 = 8;
        final int cand2 = 7;

        int expectedSum = 15;

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                et1.requestFocus();
                et1.setText(cand1 + "");
                et2.requestFocus();
                et2.setText(cand2 + "");
                bt.performClick();
            }
        });
        getInstrumentation().waitForIdleSync();

        assertEquals(expectedSum,Integer.parseInt(tv.getText().toString()));
    }
}