package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnMoveWithObject: Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveIntentWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Mahesh")
                moveIntentWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 34)
                startActivity(moveIntentWithData)
            }

            R.id.btn_move_activity_object -> {
//                val person = Person("John Doe", 32, "john.doe@email.org", "New York")
                val users = arrayListOf<Person>(
                    Person(101, "Ahmad Fasehan"),
                    Person(102, "Andris Firmansyah"),
                    Person(103, "Akhirudin Sudiyat"),
                    Person(104, "Bani Arham"),
                    Person(105, "Rido Raudho")
                )
                val moveIntentWithObject = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
                moveIntentWithObject.putParcelableArrayListExtra(MoveWithObjectActivity.EXTRA_PERSON, users)
                startActivity(moveIntentWithObject)
            }
        }
    }
}