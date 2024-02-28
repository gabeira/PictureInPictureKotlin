package com.example.android.pictureinpicture.data

import android.os.SystemClock
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


object TimerRepository {

    var startUptimeMillis = SystemClock.uptimeMillis()
    val timeMillis = MutableLiveData(0L)
    private val _started = MutableLiveData(false)
    val started: LiveData<Boolean> = _started

    fun checkStartOrPause(): Boolean {
        _started.value = _started.value?.not()
        return _started.value ?: false
    }

    fun start() {
        _started.value = true
        startUptimeMillis = SystemClock.uptimeMillis() - (timeMillis.value ?: 0L)
    }

    fun clear() {
        startUptimeMillis = SystemClock.uptimeMillis()
        timeMillis.value = 0L
    }
}