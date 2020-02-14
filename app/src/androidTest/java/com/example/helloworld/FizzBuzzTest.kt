package com.example.helloworld

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class FizzBuzzTest {

    @get:Rule var activityTestRule = ActivityTestRule(FizzBuzzActivity::class.java)

    @Test
    fun putText3AndClickButton() {
        onView(withId(R.id.textInput))
            .perform(typeText("3"))

        onView(withId(R.id.fb_button)).perform(click())

        onView(withId(R.id.textResult)).check(matches(withText("Fizz")))
    }


    @Test
    fun clickToMainActivity() {
        onView(withId(R.id.mainButton)).perform(click())

        onView(withId(R.id.textMain)).check(matches(withText("Hello World")))
    }
}