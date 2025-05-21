package com.huaytalla.franklin.usolayoutsv4

data class Contact(
    val name: String,
    val phone: String,
    val email: String
)
fun main() {

    val contacts = mutableListOf<Contact>()
    var continueAdding = true

    while (continueAdding) {
        println("\n--- Agregar un nuevo contacto ----")
        print("Nombre: ")
        val name = readLine() ?: ""
        print("Teléfono: ")
        val phone = readLine() ?: ""
        print("Email: ")
        val email = readLine() ?: ""

        val newContact = Contact(name, phone, email)
        contacts.add(newContact)

        println("Contacto agregado.")

        println("\n¿Agregar otro contacto? (sí/no)")
        val response = readLine()?.trim()?.toLowerCase()
        if (response != "sí" && response != "s") {
            continueAdding = false
        }
    }
    println("\nLista final de contactos:")
    if (contacts.isEmpty()) {
        println("No se agregaron contactos")
    } else {
        for (contact in contacts) {
            println("Nombre: ${contact.name}, Teléfono: ${contact.phone}, Email: ${contact.email}")
        }
    }
}
