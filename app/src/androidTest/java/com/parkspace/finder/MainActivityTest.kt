package com.parkspace.finder

import android.content.Intent
import androidx.activity.compose.setContent
import androidx.compose.ui.test.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Rule
import org.junit.Test
// Make sure this import is present

//class MainActivityTest {
//
//    @get:Rule
//    val composeTestRule = createAndroidComposeRule<MainActivity>()
//
//    @Test
//    fun uiElementsDisplayed() {
//        // Start the MainActivity
//        // composeTestRule.setContent is replaced with :
////        composeTestRule.activityRule.scenario.launchActivity(MainActivity::class.java)
//
//        // Simple Sample Assertion: Check if a specific text is displayed
//        // Assuming you have a composable with text "ParkSpace Finder" in your app:
//        composeTestRule.onNodeWithText("ParkSpace Finder").assertIsDisplayed()
//
//        // Replace the above assertion with checks for your actual UI elements
//    }
//}
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun uiElementsDisplayed() {
        // Launch the MainActivity (Using InstrumentationRegistry)
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val intent = context.packageManager.getLaunchIntentForPackage(context.packageName)
            ?.apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK )
            }
        context.startActivity(intent)

        // Simple Sample Assertion: Check if a specific text is displayed
        composeTestRule.onNodeWithText("ParkSpace Finder").assertIsDisplayed()

        // Replace with checks for your actual UI elements
    }
}
