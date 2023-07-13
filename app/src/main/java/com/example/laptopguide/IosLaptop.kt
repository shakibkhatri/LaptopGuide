package com.example.laptopguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laptopguide.databinding.ActivityIosLaptopBinding

class IosLaptop : AppCompatActivity() {

    private lateinit var laptopAdapter: LaptopAdapter
    private lateinit var dataList: ArrayList<ItemsViewModel>
    private lateinit var urls:ArrayList<String>

    private lateinit var binding:ActivityIosLaptopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIosLaptopBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

        dataList = ArrayList<ItemsViewModel>()

        dataList.add(ItemsViewModel(R.drawable.apple2020air, "Apple 2020 MacBook Air","M1 chip Retina Display, 8GB RAM, 256GB SSD Storage", "Rs 81990","Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.apple2023air, "Apple 2023 MacBook Air","Liquid Retina display, 8GB RAM 256GB SSD storage", "Rs 126806","Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.apple2022air, "Apple 2022 MacBook Air","M2 chip liquid Retina Display, 8GB RAM, 256GB SSD Storage", "Rs 106990","Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.apple2022pro, "Apple 2022 MacBook Pro","M2 chip Retina Display, 8GB RAM, 512GB SSD Storage", "Rs 137990","Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.apple2023pro, "Apple 2023 MacBook Pro","M2 Max chip with 12‑core CPU and 30‑core GPU 32GB Unified Memory, 1TB SSD Storage", "Rs 285490","Buy Now"))


        urls = ArrayList<String>()

        urls.add("https://www.amazon.in/Apple-MacBook-Chip-13-inch-256GB/dp/B08N5XSG8Z/ref=sr_1_4?keywords=best+apple+laptop&qid=1689234409&sprefix=best+apple+%2Caps%2C311&sr=8-4")
        urls.add("https://www.amazon.in/Apple-2023-MacBook-laptop-chip/dp/B0C75N3M8W/ref=sr_1_5?keywords=best+apple+laptop&qid=1689234409&sprefix=best+apple+%2Caps%2C311&sr=8-5")
        urls.add("https://www.amazon.in/2022-Apple-MacBook-Laptop-chip/dp/B0B3BQ11LP/ref=sr_1_6?keywords=best+apple+laptop&qid=1689234409&sprefix=best+apple+%2Caps%2C311&sr=8-6")
        urls.add("https://www.amazon.in/2022-Apple-MacBook-Laptop-chip/dp/B0B3B8VZW2/ref=sr_1_7?keywords=best+apple+laptop&qid=1689234409&sprefix=best+apple+%2Caps%2C311&sr=8-7")
        urls.add("https://www.amazon.in/Apple-MacBook-Laptop-12%E2%80%91core-30%E2%80%91core/dp/B0BSJ1Y4YX/ref=sr_1_14?keywords=best+apple+laptop&qid=1689234409&sprefix=best+apple+%2Caps%2C311&sr=8-14")



        laptopAdapter = LaptopAdapter(dataList,urls, this)
        binding.rvLaptop.layoutManager = LinearLayoutManager(this)
        binding.rvLaptop.adapter = laptopAdapter


    }
}