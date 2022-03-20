package com.example.mstatenew.services

import com.example.mstatenew.models.HistoryItem

interface HistoryCallback {
    fun onPostExecute(histories: List<HistoryItem>?)
}


