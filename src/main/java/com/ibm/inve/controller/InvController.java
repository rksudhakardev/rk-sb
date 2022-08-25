package com.ibm.inve.controller;


@RestController
public class InvController {
    
    @GetMapping(value="/inv-list", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List itemlst(){
        return new ArrayList();
    }
}
