package app.web.pavelk.noughts1

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var editTextNumber: EditText? = null; // объявление верхней записи
    private var button: Button? = null;
    private var textView: TextView? = null;
    private var myArray = arrayOf("new", "one", "go")
    private var index1 = 0;

    private var num1 = -1;

    override fun onCreate(savedInstanceState: Bundle?) { //конструктор
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // устанавливает сцену

        editTextNumber =
            findViewById<EditText>(R.id.editTextNumber) // инициализация привязка записи
        button = findViewById(R.id.button) // инициализация привязка кнопки
        textView = findViewById(R.id.textView) // инициализация привязка кнопки

        textView?.text = myArray[0]

        //set listener
        editTextNumber?.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            println("" + index1 + " ---- " + myArray.size )

            if(myArray.size == index1)return@OnKeyListener true

            if(myArray[index1].length != 0){
                if(event.getUnicodeChar().toChar() == myArray[index1][0]){
                    println("event " + event.number)
                    println("event " + myArray[index1][0])
                    println("event " + myArray[index1].substring(1))
                    myArray[index1] = myArray[index1].substring(1)
                    textView?.text = myArray[index1]
                }
            }
            if(myArray[index1].length == 0){
                index1++
                if(myArray.size == index1)return@OnKeyListener true
                textView?.text = myArray[index1]
            }

            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                println("KEYCODE_ENTER !!!!!!!!!!!!!!!!!!!!!! ")
                return@OnKeyListener true
            }
            false
        })
    }

    fun add1(view: View) { // кнопка
        println("add1 ++")
        editTextNumber?.setText((++num1).toString())
        button?.text = button?.text.toString() + " " + num1
        textView?.text = num1.toString() + "hi " + num1
    }

    fun button2(view: View) { // кнопка
        println("button2 clear")
        editTextNumber?.setText("")
        button?.text = ""
        textView?.text = ""
    }

    fun editText1(view: View) {
        println("editText1 ")
    }

}


