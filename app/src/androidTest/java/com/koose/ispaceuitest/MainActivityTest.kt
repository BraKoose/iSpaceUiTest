package com.koose.ispaceuitest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    @Test
    fun textRootHomePage(){
        //to test with with expresso
        // we need something called activityscenario
        //that will create that activity here for us
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main_root_layout))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testTextViewHomePage(){
        //to test with with expresso
        // we need something called activityscenario
        //that will create that activity here for us
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.textView))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

// visibility
    @Test
    fun test_visibiliry_title_nextButton(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.clickbutton))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.clickbutton))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
    }
}
