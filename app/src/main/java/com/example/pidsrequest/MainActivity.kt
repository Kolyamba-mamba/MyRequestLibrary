package com.example.pidsrequest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.corenetworkapipid.Factory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

const val BASE_URL = "https://child-camp2.herokuapp.com/api/v1/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Example of working with queries
        btnRequest.setOnClickListener(){
            Factory.sharedUrl = BASE_URL
            val router = Factory.shared

            CoroutineScope(Dispatchers.IO).launch {
                var responseAll = router.getAllPids()
                var responseInId = router.getPidById(1)
                println(responseAll)
                println(responseInId)

                withContext(Dispatchers.Main) {
                    tvResponse.setText("$responseAll\n")
                }
            }
        }
    }
}
