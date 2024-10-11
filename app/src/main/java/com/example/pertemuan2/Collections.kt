package com.example.pertemuan2

// List adalah Kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf
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

    // Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
    // Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
    // Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
    // Set Read-Only menggunakan setOf
    // Set Mutable menggunakan mutableSetOf

    fun ContohSet(){
        println()
        println("=== Set ===")

        // Set Read-Only
        val readOnlyAbjad = listOf("A", "B", "C")
        println(readOnlyAbjad)

        // Set Mutable
        val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
        print(shape)

        // Menambahkan data ke dalam List Mutable
        shape.add("Recteangle")
        println(shape)

        // Menghapus data dari List Mutable
        shape.remove("Circle")
        println(shape)


        // List Read Only
        val shapesLocked: Set<String> = shape
        println(shapesLocked)
    }

    fun main(){
        ContohList()
        ContohSet()
        ContohMap()
    }

}