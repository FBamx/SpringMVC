package com.demo.utils;

import org.springframework.stereotype.Component;

import java.net.Inet4Address;
import java.net.InetAddress;

@Component
public class SubnetValidator {
    public void validateIpv4Cidr(String ipv4Cidr) throws Exception {
        InetAddress subnet = Inet4Address.getByName(ipv4Cidr);
        System.out.println(subnet);
    }

    void validateSubnet() {
        validateCidr();
        validateGateway();
        validateExcludeIps();
        validateVlan();
        checkIfSubnetOverlap();
    }


    void validateCidr() {

    }

    void validateGateway() {

    }

    void validateExcludeIps() {

    }

    private void validateVlan() {
    }

    void checkIfSubnetOverlap() {
        // check if vpc exist
        // compare with subnets belong to vpc
    }
}
