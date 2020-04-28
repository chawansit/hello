package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectv971chawansit {

        Projectv971chawansitDelegate projectv971chawansitDelegate = new Projectv971chawansitDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectv971chawansitDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}