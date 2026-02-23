package com.example.dreamdeal.ui.theme.data

data class CartItem(
    val productId: Int,
    val title: String,
    val price: Double,
    val quantity: Int,
    val imageUrl: String
) {
    companion object {
        fun fromProduct(product: Product, qty: Int) = CartItem(
            productId = product.id,
            title = product.title,
            price = product.price,
            quantity = qty,
            imageUrl = product.imageUrl
        )
    }
}

