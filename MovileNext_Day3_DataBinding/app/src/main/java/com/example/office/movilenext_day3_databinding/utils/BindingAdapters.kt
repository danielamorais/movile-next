package com.example.office.movilenext_day3_databinding.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

class BindingAdapters {
    companion object {
        @JvmStatic
        @BindingAdapter("image")
        fun loadImage(imageView: ImageView, imageUrl: String?) {
            // Carregamento da imagem
            Glide.with(imageView.context).load(imageUrl).into(imageView)
        }
    }
}