package com.company;

import com.google.gson.Gson;

public class JSONSerialize implements GenericSerialize {
    @Override
    //Json serializaton using gson library
    public void serializeData(StudentInfo studentInfo) {
        Gson gson = new Gson();
        String json = gson.toJson(studentInfo);
        System.out.println(json);
        System.out.println("\n");
    }
}
