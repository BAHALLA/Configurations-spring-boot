package com.sid.web;

import com.sid.configs.TypeParams1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class ParamController {

    @Autowired
    private TypeParams1 typeParams1;

    @GetMapping("/configs")
    public Collection<String> getParames() {
        Collection<String> params = new ArrayList<>();

        params.add(typeParams1.getIp());
        params.add(String.valueOf(typeParams1.getRef()));
        params.add(typeParams1.getStatus());
        return params;
    }
}
