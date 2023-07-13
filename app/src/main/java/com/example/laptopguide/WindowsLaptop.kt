package com.example.laptopguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laptopguide.databinding.ActivityMainBinding
import com.example.laptopguide.databinding.ActivityWindowsLaptopBinding

class WindowsLaptop : AppCompatActivity() {

        private lateinit var binding: ActivityWindowsLaptopBinding

        private lateinit var laptopAdapter: LaptopAdapter
        private lateinit var dataList:ArrayList<ItemsViewModel>
        private lateinit var urls:ArrayList<String>
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWindowsLaptopBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

        dataList = ArrayList<ItemsViewModel>()
        dataList.add(ItemsViewModel(R.drawable.hpvictus, "HP Victus", "i5 12th Generation (16 GB/512 GB SSD)", "Rs 69990", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.aceraspire5, "Acer Aspire 5", "i5 12th Generation (16 GB/512 GB SSD)", "Rs 56990", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.asustufa15, "ASUS TUF Gaming A15", "AMD Ryzen 5 4600H (8 GB/512 GB SSD)","Rs 50990", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.msigf63, "MSI GF63 Thin", "i5 11th Generation (8 GB/512 GB SSD)","Rs 64990", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.lenovoideapadg3, "Ideapad Gaming 3", "i7 11th Generation (8 GB/512 GB SSD)","Rs 54999", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.acernitro5, "Acer Nitro 5 ", "i5 12th Generation (16 GB/512 GB SSD)","Rs 73990", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.asusrogflow, "ASUS ROG Flow Z13", "i5 12th Generation (16 GB/512 GB SSD)","Rs 89590", "Buy Now"))
        dataList.add(ItemsViewModel(R.drawable.lenovoyogaslim7, "Lenovo Yoga Slim 7 Pro", "i5 11th Generation (16 GB/512 GB SSD)", "Rs 68990", "Buy Now"))


        urls =  ArrayList<String>()
        urls.add("https://www.amazon.in/HP-i5-12450H-GeForce-graphics-15-fa0666TX/dp/B0C2HZYM87/ref=sr_1_1_sspa?crid=4RY0YX9WKZBM&keywords=gaming%2Blaptop%2Bunder%2B70000&qid=1689225817&sprefix=gaming%2Blaptop%2Caps%2C825&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1")
        urls.add("https://www.amazon.in/Acer-12-Cores-Processor-Graphics-A515-57G/dp/B0B5KTSVTG/ref=sr_1_2_sspa?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1")
        urls.add("https://www.amazon.in/ASUS-15-6-inch-GeForce-Windows-FA506IHRZ-HN111W/dp/B0B5DZTNZQ/ref=sr_1_3?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-3")
        urls.add("https://www.amazon.in/MSI-i7-11800H-Gaming-Windows-11UC-866IN/dp/B0BGZL34XZ/ref=sr_1_4?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-4")
        urls.add("https://www.amazon.in/Lenovo-IdeaPad-i5-11320H-39-62cm-82K101L7IN/dp/B0C8J2K795/ref=sr_1_7?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-7")
        urls.add("https://www.amazon.in/Acer-i5-12500H-Processor-15-6-inch-AN515-58/dp/B09X79JDC5/ref=sr_1_11_sspa?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-11-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9tdGY&psc=1")
        urls.add("https://www.amazon.in/ASUS-Flow-13-4-34-03-GZ301ZA-LD049WS/dp/B0B3DP95QQ/ref=sr_1_22_sspa?crid=4RY0YX9WKZBM&keywords=gaming+laptop+under+70000&qid=1689225817&sprefix=gaming+laptop%2Caps%2C825&sr=8-22-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9idGY&psc=1")
        urls.add("https://www.amazon.in/dp/B0B56CVZVS?pd_rd_i=B0B56CVZVS&pf_rd_p=71f3e964-c052-406d-85d3-3536a795e6d0&pf_rd_r=GGCBS3ANG26HE7SFZB84&pd_rd_wg=mmHfk&pd_rd_w=ffO5A&pd_rd_r=2c19ebd9-ac26-4ddf-98d5-c88dcf743c58")

        laptopAdapter = LaptopAdapter(dataList,urls, this)
        binding.rvLaptop.layoutManager = LinearLayoutManager(this)
        binding.rvLaptop.adapter = laptopAdapter
    }
}

