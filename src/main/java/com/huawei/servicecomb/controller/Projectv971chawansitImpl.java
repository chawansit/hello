package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-04-28T08:12:43.469Z")

@RestSchema(schemaId = "projectv971chawansit")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectv971chawansitImpl {

    @Autowired
    private Projectv971chawansitDelegate userProjectv971chawansitDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectv971chawansitDelegate.helloworld(name);
    }

}
