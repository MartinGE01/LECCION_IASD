package com.example.myapplicationpruebalec.ui.leccion

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationpruebalec.R

class leccion2 : AppCompatActivity() {

    private lateinit var answerEditText1: EditText
    private lateinit var answerEditText2: EditText
    private lateinit var answerEditText3: EditText
    private lateinit var answerEditText4: EditText
    private lateinit var answerEditText5: EditText
    private lateinit var answerEditText6: EditText
    private lateinit var answerEditText7: EditText

    private lateinit var answerTextView1: TextView
    private lateinit var answerTextView2: TextView
    private lateinit var answerTextView3: TextView
    private lateinit var answerTextView4: TextView
    private lateinit var answerTextView5: TextView
    private lateinit var answerTextView6: TextView
    private lateinit var answerTextView7: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leccion2)

        answerEditText1 = findViewById(R.id.answerEditText1)
        answerEditText2 = findViewById(R.id.answerEditText2)
        answerEditText3 = findViewById(R.id.answerEditText3)
        answerEditText4 = findViewById(R.id.answerEditText4)
        answerEditText5 = findViewById(R.id.answerEditText5)
        answerEditText6 = findViewById(R.id.answerEditText6)
        answerEditText7 = findViewById(R.id.answerEditText7)

        answerTextView1 = findViewById(R.id.answerTextView1)
        answerTextView2 = findViewById(R.id.answerTextView2)
        answerTextView3 = findViewById(R.id.answerTextView3)
        answerTextView4 = findViewById(R.id.answerTextView4)
        answerTextView5 = findViewById(R.id.answerTextView5)
        answerTextView6 = findViewById(R.id.answerTextView6)
        answerTextView7 = findViewById(R.id.answerTextView7)

        // Cargar las respuestas guardadas al abrir la aplicación
        loadSavedAnswers()
    }

    fun onSaveButtonClick1(view: View) {
        saveAnswer(answerEditText1, answerTextView1, "answer1")
    }

    fun onSaveButtonClick2(view: View) {
        saveAnswer(answerEditText2, answerTextView2, "answer2")
    }

    fun onSaveButtonClick3(view: View) {
        saveAnswer(answerEditText3, answerTextView3, "answer3")
    }

    fun onSaveButtonClick4(view: View) {
        saveAnswer(answerEditText4, answerTextView4, "answer4")
    }

    fun onSaveButtonClick5(view: View) {
        saveAnswer(answerEditText5, answerTextView5, "answer5")
    }

    fun onSaveButtonClick6(view: View) {
        saveAnswer(answerEditText6, answerTextView6, "answer6")
    }
    fun onSaveButtonClick7(view: View) {
        saveAnswer(answerEditText7, answerTextView7, "answer7")
    }
    private fun saveAnswer(answerEditText: EditText, answerTextView: TextView, key: String) {
        val answer = answerEditText.text.toString().trim()

        if (answer.isNotEmpty()) {
            // Guardar la respuesta en SharedPreferences
            val sharedPreferences: SharedPreferences =
                getSharedPreferences(packageName + "_preferences", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString(key, answer)
            editor.apply()

            // Actualizar el TextView para mostrar la respuesta guardada
            answerTextView.text = "Respuesta guardada: $answer"
        }
    }

    private fun loadSavedAnswers() {
        // Cargar las respuestas guardadas desde SharedPreferences
        val sharedPreferences: SharedPreferences =
            getSharedPreferences(packageName + "_preferences", Context.MODE_PRIVATE)

        answerTextView1.text = "Respuesta guardada: ${sharedPreferences.getString("answer1", "")}"
        answerTextView2.text = "Respuesta guardada: ${sharedPreferences.getString("answer2", "")}"
        answerTextView3.text = "Respuesta guardada: ${sharedPreferences.getString("answer3", "")}"
        answerTextView4.text = "Respuesta guardada: ${sharedPreferences.getString("answer4", "")}"
        answerTextView5.text = "Respuesta guardada: ${sharedPreferences.getString("answer5", "")}"
        answerTextView6.text = "Respuesta guardada: ${sharedPreferences.getString("answer6", "")}"
        answerTextView7.text = "Respuesta guardada: ${sharedPreferences.getString("answer7", "")}"
    }
}
