package br.com.zup.officehoursdemo

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

@BeagleComponent
class AppDesignSystem: DesignSystem() {
    override fun textStyle(id: String): Int? {
        return when(id) {
            "DesignSystem.Text" -> R.style.TextDescription
            else -> null
        }
    }

    override fun buttonStyle(id: String): Int? {
        return when (id) {
            "DesignSystem.Button" -> R.style.DesignSystem_Button
            else -> null
        }
    }

}