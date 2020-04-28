package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-04-28T09:02:34.780Z")

@RestSchema(schemaId = "projectmsfu")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class ProjectmsfuImpl {

    @Autowired
    private ProjectmsfuDelegate userProjectmsfuDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectmsfuDelegate.helloworld(name);
    }

}
