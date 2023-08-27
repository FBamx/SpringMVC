package com.demo.service.subnet;

import com.demo.pojo.subnet.AddSubnetReponse;
import com.demo.pojo.subnet.AddSubnetRequest;
import com.demo.utils.SubnetValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubnetServiceImpl implements SubnetService {
    @Autowired
    private SubnetValidator subnetValidator;

    @Override
    public AddSubnetReponse validateSubnet(AddSubnetRequest request) throws Exception {
        AddSubnetReponse resp = new AddSubnetReponse();
        try {
            subnetValidator.validateIpv4Cidr(request.getIpv4Cidr());
            resp.setStatus("ok");
        } catch (Exception e) {
            resp.setStatus("ipv4Cidr format error");
        }
        return resp;
    }
}
