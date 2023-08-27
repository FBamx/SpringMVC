package com.demo.controller;

import com.demo.pojo.subnet.AddSubnetReponse;
import com.demo.pojo.subnet.AddSubnetRequest;
import com.demo.service.subnet.SubnetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SubnetController {
    @Autowired
    private SubnetServiceImpl subnetService;

    @PostMapping("/subnet")
    @ResponseBody
    public AddSubnetReponse createSubnet(@RequestBody AddSubnetRequest request) throws Exception {
        return subnetService.validateSubnet(request);
    }
}
