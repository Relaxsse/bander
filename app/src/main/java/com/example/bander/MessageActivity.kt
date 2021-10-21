package com.example.bander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        // Получаем объект Intent, который запустил данную activity
        Intent intent  getIntent();
        // Получаем сообщение из объекта intent
        String messageintent getStringExtra("message");
        // Получаем TextView по его id
        TextView messageText  (TextView) findViewById(R.id.messageText);
        // устанавливаем текст для TextView
        messageText.setText(message);
    }
}