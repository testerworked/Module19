package com.homework.informationpersonnel

/**
 * Домашнее задание по теме "Column Row Box Surface"
 * Приложение «Данные по персоналу»
 *   На основании всего пройденного материала необходимо написать
 *   приложение для вывода информации о персонале предприятия.
 *
 * Вывод должен быть следующим: ...
 * Для реализации программы необходимо написать класс Person
 * со свойствами имени и зарплаты.
 * Для каждого человека номер телефона создается рандомно.
 */
import android.os.Bundle
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
    }
}