package com.namlh.a_todo.db

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import groovy.transform.Immutable;

@Immutable
@Table(name = "tasks")
class ATask extends Model{
    @Column(name = "name")
    String name
    @Column(name = "created_at")
    Date createdAt
}