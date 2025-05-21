package com.huaytalla.franklin.usolayoutsv4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.huaytalla.franklin.usolayoutsv4.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            binding.greenView.visibility = android.view.View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.greenView.visibility = android.view.View.GONE
        }
    }
}
