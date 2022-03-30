package com.example.bindingadapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url : String){

    //custom code that we want to run

        Glide.with(this.context).load(url).into(this)



}