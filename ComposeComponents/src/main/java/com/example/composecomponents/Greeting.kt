package com.example.composecomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * A composable function that displays a greeting message.
 *
 * @param name The name to be included in the greeting message.
 * @param modifier The modifier to be applied to the Text composable. It defaults to an empty Modifier.
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

fun crashTest(){
    fun internalMethod(){
        throw Error("This is a Crash Test called by com.example.composecomponents.GreetingKt.CrashTest.internalMethod")
    }
    internalMethod()
}