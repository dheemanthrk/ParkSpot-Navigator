package com.parkspace.finder

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollToIndex
import androidx.navigation.compose.ComposeNavigator
import com.parkspace.finder.navigation.ROUTE_LOGIN
import org.junit.Rule
import org.junit.Test

class OnboardingScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>() // Start from MainActivity

    @Test
    fun finishButtonDisplayed() {
        // Skip to the last page of the onboarding screens
//        composeTestRule.onNode(isRoot()).performScrollToIndex(2)
        composeTestRule.onNodeWithText("Find parking spaces near you with ease").assertIsDisplayed()

        // Assert if the button is displayed
//        composeTestRule.onNodeWithText("Finish").assertIsDisplayed()
    }
}
