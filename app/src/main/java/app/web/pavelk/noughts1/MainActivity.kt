package app.web.pavelk.noughts1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var editTextNumber: EditText? = null; // объявление верхней записи
    private var button: Button? = null;
    private var textView: TextView? = null;

    private var num1 = -1;

    override fun onCreate(savedInstanceState: Bundle?) { //конструктор
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // устанавливает сцену

        editTextNumber = findViewById<EditText>(R.id.editTextNumber) // инициализация привязка записи
        button = findViewById(R.id.button) // инициализация привязка кнопки
        textView = findViewById(R.id.textView) // инициализация привязка кнопки
}

fun add1(view: View) { // кнопка
    println("add1 ++")
    editTextNumber?.setText((++num1).toString())
    button?.text = button?.text.toString() + " " + num1
    textView?.text = num1.toString() + "hi " + num1
}

}