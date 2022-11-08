package com.company;

import javax.xml.bind.JAXBException;

public interface GenericSerialize {
    void serializeData(StudentInfo studentInfo) throws JAXBException;
}
