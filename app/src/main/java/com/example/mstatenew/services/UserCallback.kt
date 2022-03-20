package com.example.mstatenew.services

import com.example.mstatenew.models.AppUser

interface UserCallback {
    fun onPostExecute(dRef: String)
    fun onPostExecute(user: AppUser)
}


