package capstone.product.tim.majorsmatch.view.majorsmatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import capstone.product.tim.majorsmatch.R
import capstone.product.tim.majorsmatch.databinding.ActivityMajorsMatchBinding

class MajorsMatch : AppCompatActivity() {

    private lateinit var binding: ActivityMajorsMatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.Home.setOnClickListener {
            setContentView(R.layout.activity_majors_match)
        }
    }
}