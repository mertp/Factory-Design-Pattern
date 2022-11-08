package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.StringWriter;

public class XMLSerialize implements GenericSerialize{
    @Override
    //Converting to xml using JAXB converter.
    public void serializeData(StudentInfo studentInfo) throws JAXBException {
        JAXBContext jaxbContext= JAXBContext.newInstance(StudentInfo.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        //Required formatting??
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Print XML String to Console
        StringWriter sw = new StringWriter();

        //Write XML to StringWriter
        jaxbMarshaller.marshal(studentInfo, sw);

        //Verify XML Content
        String xmlContent = sw.toString();
        System.out.println( xmlContent );


    }
}
