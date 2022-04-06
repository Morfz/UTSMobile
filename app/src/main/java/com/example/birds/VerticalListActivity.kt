package com.example.birds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birds.adapter.BirdCardAdapter
import com.example.birds.const.Layout
import com.example.birds.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = BirdCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        binding.verticalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}