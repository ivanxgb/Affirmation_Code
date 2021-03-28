package me.ivaangb.afirmation_codelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import me.ivaangb.afirmation_codelab.adapter.ItemAdapter
import me.ivaangb.afirmation_codelab.data.Datasource
import me.ivaangb.afirmation_codelab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmation()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset)
    }
}