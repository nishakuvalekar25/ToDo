package com.app2.todo.Model;


import androidx.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

public class TaskId {
    @Exclude
    public String TaskId;

    public  <T extends  TaskId> T withId(@NonNull final String id){
        this.TaskId = id;
        return  (T) this;
    }

}
