package com.example.fourboxgame

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import com.example.fourboxgame.databinding.ActivityMainBinding
import java.util.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0;
        var gameState = true;

        val button1 = binding.button1.tag.toString()
        val button2 = binding.button2.tag.toString()
        val button3 = binding.button3.tag.toString()
        val button4 = binding.button4.tag.toString()
        Log.i("button", button1)





        val timer =  object: CountDownTimer(20000, 500) {
            override fun onTick(millisUntilFinished: Long) {

                var randomValue = Random().nextInt(5).toString()


                if (randomValue == button1) {
                    binding.button1.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.yellow))
                    binding.button2.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button3.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button4.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                } else if (randomValue == button2) {
                    binding.button1.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button2.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.yellow))
                    binding.button3.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button4.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                } else if (randomValue == button3) {
                    binding.button1.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button2.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button3.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.yellow))
                    binding.button4.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                } else if (randomValue == button4) {
                    binding.button1.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button2.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button3.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.black))
                    binding.button4.backgroundTintList =
                        ColorStateList.valueOf(resources.getColor(R.color.yellow))
                }

                    binding.button1.setOnClickListener {
                        if (gameState == true) {
                            if (randomValue == button1) {
                                counter++
                            }
                            binding.score.text = counter.toString()
                        }
                    }

                    binding.button2.setOnClickListener {
                        if (gameState == true) {
                            if (randomValue == button2) {
                                counter++
                            }
                            binding.score.text = counter.toString()
                        }
                    }

                    binding.button3.setOnClickListener {
                        if (gameState == true) {
                            if (randomValue == button3) {
                                counter++
                            }
                            binding.score.text = counter.toString()
                        }
                    }

                    binding.button4.setOnClickListener {
                        if (gameState == true) {
                            if (randomValue == button4) {
                                counter++
                            }
                            binding.score.text = counter.toString()
                        }
                    }
                }
            
            override fun onFinish() {
                binding.gameOver.visibility = View.VISIBLE
                binding.gameOver.text = "GAME OVER"
                gameState = false

            }
        }
        timer.start()



    }
}