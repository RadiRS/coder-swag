package com.radirusadi.coderswag.Service

import com.radirusadi.coderswag.Model.Category
import com.radirusadi.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Hat 01", "Rp 12000", "hat1"),
            Product("Hat 02", "Rp 13000", "hat2"),
            Product("Hat 03", "Rp 11000", "hat3"),
            Product("Hat 04", "Rp 10000", "hat4")
    )

    val hoodies = listOf(
            Product("Hoodie 01", "Rp 30000", "hoodie1"),
            Product("Hoodie 02", "Rp 20000", "hoodie2"),
            Product("Hoodie 03", "Rp 23000", "hoodie3"),
            Product("Hoodie 04", "Rp 21000", "hoodie4")
    )

    val shirts = listOf(
            Product("Shirt 01", "Rp 40000", "shirt1"),
            Product("Shirt 02", "Rp 42000", "shirt2"),
            Product("Shirt 03", "Rp 34000", "shirt3"),
            Product("Shirt 04", "Rp 44000", "shirt4"),
            Product("Shirt 05", "Rp 50000", "shirt5")
    )

}