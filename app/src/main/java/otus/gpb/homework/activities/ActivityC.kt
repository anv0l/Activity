package otus.gpb.homework.activities

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_c)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_c)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonOpenA = findViewById<Button>(R.id.button_open_activity_a)
        buttonOpenA.setOnClickListener {

        }

        val buttonOpenD = findViewById<Button>(R.id.button_open_activity_d)
        buttonOpenD.setOnClickListener {

        }

        val buttonCloseC = findViewById<Button>(R.id.button_close_activity_c)
        buttonCloseC.setOnClickListener {

        }

        val buttonCloseStack = findViewById<Button>(R.id.button_close_stack)
        buttonCloseStack.setOnClickListener {

        }
    }
}