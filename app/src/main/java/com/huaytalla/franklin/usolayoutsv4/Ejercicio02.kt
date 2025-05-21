package com.huaytalla.franklin.usolayoutsv4

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.huaytalla.franklin.usolayoutsv4.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val nombre = binding.etNombreCliente.text.toString().trim()
            val numero = binding.etNumeroCliente.text.toString().trim()
            val productos = binding.etProductos.text.toString().trim()
            val ciudad = binding.etCiudad.text.toString().trim()
            val direccion = binding.etDireccion.text.toString().trim()

            if (nombre.isEmpty() || numero.isEmpty() || productos.isEmpty() || ciudad.isEmpty() || direccion.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, PedidoActivity::class.java).apply {
                putExtra("NOMBRE", nombre)
                putExtra("NUMERO", numero)
                putExtra("PRODUCTOS", productos)
                putExtra("CIUDAD", ciudad)
                putExtra("DIRECCION", direccion)
            }
            startActivity(intent)
        }
    }
}