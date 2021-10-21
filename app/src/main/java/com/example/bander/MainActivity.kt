package com.example.helloapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.bander.MessageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_)
    }
    

    // Метод обработки нажатия на кнопку
    fun sendMessage(view: View?) {
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        val intent = Intent(this, MessageActivity::class.java)
        // Получаем текстовое поле в текущей Activity
        val editText = findViewById<View>(R.id.editText) as EditText
        // Получае текст данного текстового поля
        val message = editText.text.toString()
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra("message", message)
        // запуск activity
        startActivity(intent)
    }
}