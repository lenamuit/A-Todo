package com.namlh.a_todo

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import com.arasthel.swissknife.SwissKnife
import groovy.transform.CompileStatic;

@CompileStatic
class BaseActivity extends ActionBarActivity{

    protected void onCreated(Bundle savedBundle){
        super.onCreate(savedBundle)
        SwissKnife.restoreState(this,savedBundle)
    }

    void setContentView(int layoutId){
        super.setContentView(layoutId)
        SwissKnife.inject(this)
    }
}