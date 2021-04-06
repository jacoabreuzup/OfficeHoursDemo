package com.example.bff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.context.Bind
import br.com.zup.beagle.widget.context.expressionOf
import br.com.zup.beagle.widget.core.AlignItems
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.JustifyContent
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text

object DetailsZipCodeScreenBuilder: ScreenBuilder {

    override fun build() = Screen(
        navigationBar = NavigationBar(
            title = "Details",
            showBackButton = true
        ),
        child = Container(
            children = listOf(
                createText(
                    text = expressionOf("Zip: @{global.data.zip}")
                ),
                createText(
                    text = expressionOf("Street: @{global.data.street}")
                ),
                createText(
                    text = expressionOf("Number: @{global.data.number}")
                ),
                createText(
                    text = expressionOf("Neighborhood: @{global.data.neighborhood}")
                ),
                createText(
                    text = expressionOf("City: @{global.data.city}")
                ),
                createText(
                    text = expressionOf("State: @{global.data.state}")
                ),
                createText(
                    text = expressionOf("Complement: @{global.data.complement}")
                )
            )
        ).applyFlex(Flex(
            grow = 1.0,
            justifyContent = JustifyContent.CENTER,
            alignItems = AlignItems.CENTER
        ))
    )

    private fun createText(text: Bind<String>) = Text(
        text = text,
        styleId = "DesignSystem.Text"
    ).applyStyle(Style(
        margin = EdgeValue(
            bottom = 10.unitReal()
        )
    ))



}