package com.example.moduleb

import com.infinum.jsonapix.annotations.JsonApiX
import kotlinx.serialization.Serializable

@Serializable
@JsonApiX(type = "classB")
data class ClassB(
    val foo: String
)