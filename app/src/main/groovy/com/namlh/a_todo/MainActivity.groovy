package com.namlh.a_todo

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.arasthel.swissknife.annotations.InjectView
import groovy.transform.CompileStatic

@CompileStatic
class MainActivity extends BaseActivity{

    @InjectView(R.id.recycle_view)
    RecyclerView recyclerView;

    protected void onCreate(Bundle savedBundle){
        super.onCreate(savedBundle)

        contentView = R.layout.activity_main

        recyclerView.with {
            layoutManager = new GridLayoutManager(this,1)
            adapter = new TasksAdapter()
        }

    }
}