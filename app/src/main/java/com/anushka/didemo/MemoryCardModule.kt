package com.anushka.didemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize: Int) {
    @Provides
    fun providesMemoryCard() : MemoryCard{
        Log.i("MYTAG", "The size of memory card is $memorySize")
        return MemoryCard()
    }
}