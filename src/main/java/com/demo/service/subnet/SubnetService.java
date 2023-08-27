package com.demo.service.subnet;

import com.demo.pojo.subnet.AddSubnetReponse;
import com.demo.pojo.subnet.AddSubnetRequest;

public interface SubnetService {
    public AddSubnetReponse validateSubnet(AddSubnetRequest request) throws Exception;
}
