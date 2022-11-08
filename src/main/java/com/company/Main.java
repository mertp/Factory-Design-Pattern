package com.company;
/*
Student Number:b201202049
Name:Mert Can
Surname: Pekdemir
Lecture Name:Design Patterns
Homework1
 */

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
	StudentInfo studentInfo=new StudentInfo("1","Mert","Pekdemir");
    SerializerFactory serializerFactory=new SerializerFactory();

    GenericSerialize genericSerialize1=serializerFactory.getType("json");
    genericSerialize1.serializeData(studentInfo);
    GenericSerialize genericSerialize2=serializerFactory.getType("xml");
    genericSerialize2.serializeData(studentInfo);



    }
}
