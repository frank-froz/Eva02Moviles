package com.huaytalla.franklin.usolayoutsv4

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.huaytalla.franklin.usolayoutsv4.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("NOMBRE") ?: ""
        val numero = intent.getStringExtra("NUMERO") ?: ""
        val productos = intent.getStringExtra("PRODUCTOS") ?: ""
        val ciudad = intent.getStringExtra("CIUDAD") ?: ""
        val direccion = intent.getStringExtra("DIRECCION") ?: ""

        binding.tvNombreCliente.text = nombre
        binding.tvNumeroCliente.text = numero
        binding.tvProductos.text = productos
        binding.tvUbicacion.text = "$ciudad - $direccion"

        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre, teléfono: $numero", Toast.LENGTH_SHORT).show()
        }

        binding.btnWsp.setOnClickListener {
            Toast.makeText(this, "Hola $nombre Tus productos: $productos están en camino a la dirección: $direccion", Toast.LENGTH_LONG).show()
        }

        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Mostrando ubicación: $ciudad - $direccion", Toast.LENGTH_SHORT).show()
        }
    }
}
