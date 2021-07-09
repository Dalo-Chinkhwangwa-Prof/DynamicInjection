package com.dynamicdevz.dynamicinjection.model

import android.util.Log
import javax.inject.Inject


class Radio @Inject constructor() {
    fun playSong(songName: String){
        Log.d("TAG_X", "Radio Now playing $songName")
    }
}