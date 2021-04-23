package com.example.mymvvmtest

class Event<out T>(private val content: T) {
    // 允许扩展类读，但是不能写
    var hasBeenHandled = false
        private set

    /**
     * 获取还没有处理的内容
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }


}