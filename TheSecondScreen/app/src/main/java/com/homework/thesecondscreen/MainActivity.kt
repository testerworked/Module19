package com.homework.thesecondscreen

/**
 * Приложение «Второй экран»
 * На основе пройденного материала необходимо написать приложение
 * для перехода на второй экран с использованием стилизации к сегменту текста
 * и по нажатию на этот сегмент будет выполняться переход на следующий экран.
 * Переход можно выполнить через Intent.
 *
 * При создании второго класса необходимо его прописать в файле манифеста.
 *
 * Кроме того, для реализации работы этого приложения необходимо самостоятельно
 * изучить и интегрировать функцию withLink с имеющимся параметром,
 * который позволяет обрабатывать нажатие элемента, например,
 *
 * link = LinkAnnotation.Clickable(tag = "",
 * linkInteractionListener = {
 * логика обработки нажатия   },
 * styles = ... )
 *
 * В параметре styles выполняется стилизация сегмента текста.
 * Сегмент должен быть подчеркнут и выделен другим цветом.
 *
 * Примерный вариант отображения содержимого может выглядеть так:
 *
 * Первый экран
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