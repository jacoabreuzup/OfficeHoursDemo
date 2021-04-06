package br.com.zup.officehoursdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ScreenRequest
import br.com.zup.beagle.android.view.ServerDrivenActivity
import br.com.zup.beagle.scaffold.BeagleIntent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = this.newServerDrivenIntent<ServerDrivenActivity>(ScreenRequest(url = "/zipCode"))
        startActivity(intent)
        finish()
    }
}