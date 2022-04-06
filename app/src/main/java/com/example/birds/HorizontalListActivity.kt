package com.example.birds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.adapter.BirdCardAdapter
import com.example.birds.const.Layout
import com.example.birds.databinding.ActivityHorizontalListBinding

class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = BirdCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        binding.horizontalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}