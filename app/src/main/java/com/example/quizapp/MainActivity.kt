package com.example.quizapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizapp.QuizQuestionsActivity
import com.example.quizapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import kotlinx.android.synthetic.main.activity_quiz_questions.view.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btnStart.setOnClickListener {


            if (editTextName.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}