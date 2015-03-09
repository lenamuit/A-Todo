package com.namlh.a_todo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.activeandroid.query.Select
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.namlh.a_todo.db.ATask
import groovy.transform.CompileStatic;

@CompileStatic
class TasksAdapter extends RecyclerView.Adapter<TaskViewHolder>{

    List<ATask> tasks

    public TasksAdapter(){
        tasks = new Select().from(ATask).execute()
    }

    @Override
    TaskViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TaskViewHolder(View.inflate(viewGroup.context,R.layout.item_task,null))
    }

    @Override
    void onBindViewHolder(TaskViewHolder taskViewHolder, int i) {
        taskViewHolder.with {
            tvName.text = tasks[i].name
            tvDate.text = tasks[i].createdAt.format("dd/MM/yyyy hh:ss a")
        }
    }

    @Override
    int getItemCount() {
        return tasks?.size()
    }

    static class TaskViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.tv_name)
        TextView tvName

        @InjectView(R.id.tv_date)
        TextView tvDate

        TaskViewHolder(View itemView) {
            super(itemView)
            SwissKnife.inject(this,itemView)
        }
    }
}