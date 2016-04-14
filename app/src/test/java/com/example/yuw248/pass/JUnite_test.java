package com.example.yuw248.pass;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by wangy on 4/13/2016.
 */
public class JUnite_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnite_test(){
        super((MainActivity.class));
    }

    public void test_first(){
        mainActivity = getActivity();
        EditText et1 = (EditText) mainActivity.findViewById(R.id.number1);
        EditText et2 = (EditText) mainActivity.findViewById(R.id.number2);
        Button bt = (Button) mainActivity.findViewById(R.id.myButton);
        bt.performClick();
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int s = mainActivity.sum(n1,n2);
        TextView tv = (TextView) mainActivity.findViewById(R.id.sum);
        String s3 = tv.getText().toString();
        int n3 = Integer.parseInt(s3);

        assertEquals(3,4);
    }

}
