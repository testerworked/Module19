package com.homework.randombuttons

/**
 *Игра «Случайные кнопки»
 *
 * На основе пройденного материала необходимо написать приложение-игру «Случайные кнопки».
 *
 * Суть игры заключается в том, что у нас есть три кликабельных Button.
 * При нажатии на одну из них, рандомно меняются параметры остальных двух.
 * Меняться должны следующие параметры: цвет контейнера кнопки (параметр colors),
 * толщина границы кнопки (параметр border), цвет границы кнопки (параметр border).
 * Победной ситуация считается в том случае, если у всех трех кнопок установились
 * одинаковые параметры. Эта игра не является головоломкой или игрой на логику:
 * здесь либо повезет, либо не повезет. Рекомпозиция элементов должна происходить моментально.
 *
 * При изменении ориентации экрана, состояние компонентов должно сохраняться.
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