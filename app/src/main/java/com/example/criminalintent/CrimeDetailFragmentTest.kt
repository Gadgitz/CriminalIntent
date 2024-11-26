package com.example.criminalintent

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
class CrimeDetailFragmentTest {

    @Test
    fun testCrimeDetailFragment() {
        val scenario = launchFragmentInContainer<CrimeDetailFragment>()

        onView(withId(R.id.crime_title)).perform(typeText("Test Crime Title"))

        onView(withId(R.id.crime_solved)).perform(click())

        onView(withId(R.id.crime_title)).check(matches(withText("Test Crime Title")))
    }
}