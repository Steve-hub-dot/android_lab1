package hu.bme.aut.android.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class   GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
}