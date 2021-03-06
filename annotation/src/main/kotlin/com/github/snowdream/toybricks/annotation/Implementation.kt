package com.github.snowdream.toybricks.annotation


import kotlin.reflect.KClass

/**
 * Created by snowdream on 17/2/10.
 */
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class Implementation(val value: KClass<*>, val global: Boolean = false, val singleton: Boolean = false)
