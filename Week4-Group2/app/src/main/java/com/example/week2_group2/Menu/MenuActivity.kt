package com.example.week2_group2.Menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week2_group2.Data.ResInfo
import com.example.week2_group2.R
import com.example.week2_group2.databinding.ActivityMenuBinding



class MenuActivity : AppCompatActivity() {

    lateinit var  bind: ActivityMenuBinding
    lateinit var view : MenuViewModel
    lateinit var adapter : MenuAdapter
      // Thiết lập kiểu layout là Linear Layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_menu)

        bind = DataBindingUtil.setContentView(this, R.layout.activity_menu)
        view = ViewModelProvider(this).get(MenuViewModel::class.java)


        adapter = MenuAdapter() // Đưa list data vào adapter
        val layoutManager = LinearLayoutManager(this)
        bind.rcView.layoutManager = layoutManager
        bind.rcView.adapter = adapter



        registerDataListener()

        adapter.setOnItemClickListener(object :MenuAdapter.onItemClickListener{
            override fun onItemClick(postion: Int) {
               val builder = AlertDialog.Builder(this@MenuActivity)
                builder.apply {
                    setMessage("Xóa chứ ? ")
                    setPositiveButton("Xóa luôn"){dialog, _->
                        ResInfo.listOfRestaurant.removeAt(postion)
                        bind.rcView.adapter = adapter
                        dialog.dismiss()
                    }
                    setNegativeButton("Nghĩ lại rồi"){dialog, _->
                        dialog.dismiss()
                    }
                }
                builder.show()
            }


        })


        }







    fun registerDataListener(){
        view.listOfRestaurant.observe(this){ setData->
            adapter.submitList(setData)

        }
    }

    override fun onStart() {
        super.onStart()
        view.getDatafrom()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_restaurant,menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.layoutnew ->{
                Toast.makeText(this,"Please choose a layout",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.grid ->{
                val layoutManager = GridLayoutManager(this,2)
                bind.rcView.layoutManager = layoutManager
                bind.rcView.adapter = adapter
                true
            }
            R.id.linear ->{
                val layoutManager = LinearLayoutManager(this)
                bind.rcView.layoutManager = layoutManager
                bind.rcView.adapter = adapter
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }






    }


