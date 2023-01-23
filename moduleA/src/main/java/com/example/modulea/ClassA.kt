package com.example.modulea

import com.example.moduleb.ClassB
import com.infinum.jsonapix.annotations.HasOne
import com.infinum.jsonapix.annotations.JsonApiX
import kotlinx.serialization.Serializable

@Serializable
@JsonApiX(type = "classA")
data class ClassA(
    @HasOne(type="classB")
    val classB: ClassB
)