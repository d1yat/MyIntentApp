package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView = findViewById(R.id.tv_object_received)

        val users = intent.getParcelableArrayListExtra<Person>(EXTRA_PERSON) as ArrayList<Person>
        users.forEach { user -> tvObject.text = tvObject.text.toString().plus("\nID: ${user.id}\nName: ${user.name}\n") }
    }
}