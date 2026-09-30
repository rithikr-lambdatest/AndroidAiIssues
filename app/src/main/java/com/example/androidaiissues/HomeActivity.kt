package com.example.androidaiissues

import android.app.Activity
import android.os.Bundle

// AndroidAiIssues — the whole fixture is the home layout; see activity_home.xml
// for the rule-by-rule rationale.
class HomeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}
