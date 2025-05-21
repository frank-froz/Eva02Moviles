package com.huaytalla.franklin.usolayoutsv4

class Contacto(
    val nombre: String,
    val telefono: String,
    val email: String
) {
    override fun toString(): String {
        return "Nombre: $nombre, Teléfono: $telefono, Email: $email"
    }
}

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEach { println(it) }
        }
    }

    fun buscarPorNombre(nombre: String): List<Contacto> {
        return contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
    }
}

fun main() {
    val agenda = Agenda()
    var salir = false

    while (!salir) {
        println("\n-------- Agenda ---------")
        println("1. Agregar contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto por nombre")
        println("4. Salir")
        print("Opción: ")

        when (readln()) {
            "1" -> {
                print("Nombre: ")
                val nombre = readln()
                print("Teléfono: ")
                val telefono = readln()
                print("Email: ")
                val email = readln()
                agenda.agregarContacto(Contacto(nombre, telefono, email))
                println("Contacto agregado")
            }

            "2" -> {
                agenda.listarContactos()
            }

            "3" -> {
                print("Nombre a buscar: ")
                val buscar = readln()
                val encontrados = agenda.buscarPorNombre(buscar)
                if (encontrados.isEmpty()) {
                    println("No se encontraron contactos")
                } else {
                    println("Contactos encontrados:")
                    encontrados.forEach { println(it) }
                }
            }

            "4" -> {
                println("Saliendo de la agenda...")
                salir = true
            }

            else -> {
                println("Opción inválida.")
            }
        }
    }
}
