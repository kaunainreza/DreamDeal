package com.example.dreambuy.ui.theme.data

data class ProductsResponse(
    val products: List<ProductDto>
)

data class ProductDto(
    val id: Int,
    val title: String,
    val price: Double,
    val rating: Double,
    val thumbnail: String
)