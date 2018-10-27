package com.example.office.movilenext_day1_room.ViewModel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.example.office.movilenext_day1_room.model.Word
import com.example.office.movilenext_day1_room.model.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = WordRepository(application)

    private val allWords = repository.allWords

    fun insert(word: Word) {
        repository.insert(word)
    }
}