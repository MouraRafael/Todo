package com.example.todo.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todo.databinding.ActivityListTasksBinding

class ListActivity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val binding = ActivityListTasksBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}