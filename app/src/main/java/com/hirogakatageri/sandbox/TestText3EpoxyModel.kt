package com.hirogakatageri.sandbox

import com.airbnb.epoxy.kotlinsample.helpers.ViewBindingKotlinModel
import com.hirogakatageri.sandbox.databinding.ItemSample3Binding
import java.util.*

data class TestText3EpoxyModel(
    val randomText: String = UUID.randomUUID().toString()
) : ViewBindingKotlinModel<ItemSample3Binding>(R.layout.item_sample3) {

    override fun ItemSample3Binding.bind() {
        textView.text = randomText
    }
}