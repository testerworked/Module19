package com.homework.dynamiclist

/**
 * TextField
 * Приложение «Динамический список»
 * На основе пройденного материала необходимо написать приложение для вывода
 * прокручиваемого динамического списка с возможностью добавлять и удалять элементы.
 * Добавление элементов производится при помощи ввода текста
 * в OutlineTextField по нажатию на Text “Добавить”.
 *
 * Удаление элементов производится по нажатию на Text item’а в списке.
 * Рекомпозиция компонентов должна происходить моментально.
 *
 * При реализации списка необходимо использовать ArrayList.
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