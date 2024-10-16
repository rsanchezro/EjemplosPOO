package com.example.ejemplospoo

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var imagen:ImageView=findViewById(R.id.imageView)
       // imagen.cargarImagen("https://github.com/bumptech/glide/blob/master/benchmark/src/main/res/raw/huge_header.jpg")

    //   mostrar_mensaje("Mensaje", Toast.LENGTH_LONG)

    }
}