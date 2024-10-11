package com.example.pertemuan2

fun ContohList(){
    println("=== LIST ===")
    // List Read Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    print(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List Mutable
    shape[0] = "Oval"

    // List Read Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

    fun main(){
        ContohList()
        ContohSet()
        ContohMap()
    }

}