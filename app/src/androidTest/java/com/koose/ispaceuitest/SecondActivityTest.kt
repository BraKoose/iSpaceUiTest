package com.koose.ispaceuitest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {
    @Test
    fun textRootSecondPage(){
        //to test with with expresso
        // we need something called activityscenario
        //that will create that activity here for us
        val activityScenario = ActivityScenario.launch(SecondActivity2::class.java)

        Espresso.onView(ViewMatchers.withId(R.id.second))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testTextViewSecondPage(){
        //to test with with expresso
        // we need something called activityscenario
        //that will create that activity here for us
        val activityScenario = ActivityScenario.launch(SecondActivity2::class.java)

        Espresso.onView(ViewMatchers.withId(R.id.textView2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    // visibility
    @Test
    fun test_visibiliry_title_backButton(){
        val activityScenario = ActivityScenario.launch(SecondActivity2::class.java)

        Espresso.onView(ViewMatchers.withId(R.id.back))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(ViewMatchers.withId(R.id.back))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
    }

}

