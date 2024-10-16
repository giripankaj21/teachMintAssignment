package com.example.teachmintassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val searchEditText = findViewById<EditText>(R.id.searchEditText)
        //val userRepoEditText = findViewById<EditText>(R.id.userRepoEditText)

        val button = findViewById<Button>(R.id.searchButton)
        button.setOnClickListener {
            val intent = Intent(this, searchResultActivity::class.java)
            intent.putExtra("searchTerm", searchEditText.text.toString())
            startActivity(intent)

        }

       // val viewRepoButton = findViewById<Button>(R.id.userRepoButton)
       // viewRepoButton.setOnClickListener {
       //     val intent = Intent(this, SearchResultActivity::class.java)
       //     intent.putExtra("username", userRepoEditText.text.toString())
       //     startActivity(intent)
        //}
    }
}