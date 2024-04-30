package com.example.todolist

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton: Button = findViewById(R.id.addButton)
        val delButton: Button = findViewById(R.id.deleteButton)
        val userInputData: EditText = findViewById(R.id.userInputData)
        val taskList = findViewById<ListView>(R.id.listView)

        val todos: MutableList<String> = mutableListOf()

        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, todos)
        taskList.adapter = adapter

        addButton.setOnClickListener {
            val text = userInputData.text.toString().trim()
            if (text != "") {
                adapter.insert(text, 0)

            }
        }

        }
    }
