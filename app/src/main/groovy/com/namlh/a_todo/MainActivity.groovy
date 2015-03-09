package com.namlh.a_todo

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.ActionBarActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.activeandroid.query.Select
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.namlh.a_todo.db.ATask
import groovy.transform.CompileStatic;

@CompileStatic
class MainActivity extends ActionBarActivity{

    @InjectView(R.id.refresh_layout)
    SwipeRefreshLayout refreshLayout;
    @InjectView(R.id.recycle_view)
    RecyclerView recyclerView;

    protected void onCreate(Bundle savedBundle){
        super.onCreate(savedBundle)

        contentView = R.layout.activity_main
        SwissKnife.inject(this)
        SwissKnife.restoreState(this,savedBundle)

        recyclerView.layoutManager = new GridLayoutManager(this,1)
    }
}