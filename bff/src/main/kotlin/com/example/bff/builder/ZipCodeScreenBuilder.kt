package com.example.bff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.*
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

data class Address(val data: Data)

data class Data(
    val zip: String,
    val street: String,
    val number: String,
    val neighborhood: String,
    val city: String,
    val state: String,
    val complement: String
)

object ZipCodeScreenBuilder: ScreenBuilder {

    override fun build() = Screen (
        navigationBar = NavigationBar(
            title = "Zip Code",
            showBackButton = true
        ),
        child = Container(
            children = listOf(
                ScrollView(
                    children = listOf(
                        Text(
                            text = "Fill the form"
                        ).applyStyle(
                            Style(
                                margin = EdgeValue(vertical = 20.unitReal()),
                                flex = Flex(alignSelf = AlignSelf.CENTER)
                            )
                        ),
                        createZip()
                    ),
                    context = ContextData(
                        id = "address",
                        value = Address(
                            data = Data(
                                zip = "",
                                street = "",
                                number = "",
                                neighborhood = "",
                                city = "",
                                state = "",
                                complement = ""
                            )
                        )
                    )
                )
            )
        ).applyFlex(
            Flex(grow = 1.0)
        )
    )

    private fun createZip() = TextInput(
        placeholder = "Zip",
        value = "@{address.data.zip}",
        type = TextInputType.NUMBER,
        styleId = "DesignSystem.TextInput",
        onChange = listOf(
            SetContext(
                contextId = "address",
                path = "data.zip",
                value = "@{onChange.value}"
            )
        ),
        onBlur = listOf(
            SendRequest(
                url = "https://viacep.com.br/ws/@{onBlur.value}/json",
                method = RequestActionMethod.GET,
                onSuccess = listOf(
                    SetContext(
                        contextId = "address",
                        path = "data",
                        value = Data(
                            zip = "@{onBlur.value}",
                            street = "@{onSuccess.data.logradouro}",
                            number = "@{address.data.number}",
                            neighborhood = "@{onSuccess.data.bairro}",
                            city = "",
                            state = "",
                            complement = ""
                        )
                    )
                )

            )
        )
    )

}