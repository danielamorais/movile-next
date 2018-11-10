package com.example.office.movilenext_day3_databinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.office.movilenext_day3_databinding.databinding.ActivityGameInfoBinding
import com.example.office.movilenext_day3_databinding.utils.contentView

class GameInfoActivity : AppCompatActivity() {

    val binding: ActivityGameInfoBinding by contentView(R.layout.activity_game_info)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val game = Game("Donkey Kong", 2010,
            "https://vignette.wikia.nocookie.net/liberproeliis/images/2/2d/DKMP8.png/revision/latest?cb=20161011111445&path-prefix=pt-br",
            2.0)
        binding.game = game
    }
}
