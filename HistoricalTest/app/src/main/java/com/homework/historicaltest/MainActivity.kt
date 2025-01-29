package com.homework.historicaltest

/**
 *Исторический тест
 *
 * На основе пройденного материала необходимо написать приложение «Исторический тест».
 *
 * Приложение должно состоять из 4 экранов:
 *
 * главное меню,
 * первый вопрос,
 * второй вопрос,
 * третий вопрос,
 * результаты.
 * На экране главного меню должно располагаться название приложения, и кнопка «Начать»,
 * которая переносит пользователя на экран с первым вопросом.
 *
 * Экран первого вопроса должен включать в себя:
 *
 * 1.Text с самим вопросом на историческую тему;
 *
 * 2.Checkbox’ы с вариантами ответов;
 *
 * 3.Button «Ответить», которая переносит пользователя к следующему экрану с вопросом.
 * Правильных ответов должно быть несколько.
 *
 * Экран второго вопроса должен включать в себя:
 *
 * 1.Text с самим вопросом на историческую тему;
 *
 * 2.Checkbox’ы с вариантами ответов;
 *
 * 3.Button «Ответить», которая переносит пользователя к следующему экрану с вопросом.
 * Правильных ответов должно быть несколько.
 * Все идентично экрану первого вопроса, кроме содержания.
 *
 * Экран третьего вопроса должно включать в себя:
 *
 * 1.Text с самим вопросом на историческую тему;
 *
 * 2.selectable компоненты, которые представляют собой варианты ответа;
 *
 * 3.Button «Ответить», которая переносит пользователя на экран с результатами теста.
 *
 * В данном случае правильный ответ должен быть только один.
 * В качестве вариантов ответа должны быть представлены изображения.
 *
 * Экран с результатами должен включать в себя:
 *
 * 1. Text с результатами в формате: «Ваш результат: (значение) из 3»;
 *
 * 2. Button, который возвращает пользователя в главное меню.
 *
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