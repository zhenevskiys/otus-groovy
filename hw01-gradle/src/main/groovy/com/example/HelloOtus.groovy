package com.example

import com.google.common.base.CaseFormat

static void main(String[] args) {
    println "Working with guava collection"
    println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"))

}