package com.scc.sdd.art.mycalculator2;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void add(){
        // onView
        // perform
        // check ( matches )

        onView( withId(R.id.text_op1) ).perform(typeText("2"));
        onView( withId(R.id.text_op2) ).perform(typeText("1"));
        onView( withId(R.id.btn_add) ).perform(click());
        onView( withId(R.id.txt_result) ).check( matches( withText("3.0") ) );
    }

    @Test
    public void sub(){
        onView( withId(R.id.text_op1) ).perform(typeText("2"));
        onView( withId(R.id.text_op2) ).perform(typeText("1"));
        onView( withId(R.id.btn_sub) ).perform(click());
        onView( withId(R.id.txt_result) ).check( matches( withText("1.0") ) );
    }


}
