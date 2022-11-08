package com.company;


//Factory class.
public class SerializerFactory {

    //Factory method. Creating instances of serializer object depending on the string
    public GenericSerialize getType(String type){
        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("json")){
            return new JSONSerialize();
        }
        else if(type.equalsIgnoreCase("xml")){
            return new XMLSerialize();
        }
        return null;
    }
}
