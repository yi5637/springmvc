package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectnznt {

        ProjectnzntDelegate projectnzntDelegate = new ProjectnzntDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectnzntDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}