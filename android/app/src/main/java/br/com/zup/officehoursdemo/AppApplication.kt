package br.com.zup.officehoursdemo

import android.app.Application
import br.com.zup.beagle.scaffold.BeagleScaffold

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        BeagleScaffold(BeagleSetup()).init(this)
    }
}