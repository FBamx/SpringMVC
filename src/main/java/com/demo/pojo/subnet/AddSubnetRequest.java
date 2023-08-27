package com.demo.pojo.subnet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddSubnetRequest {
    private String subnetName;

    private Long vpcId;

    private String cidrProtocol;

    private String ipv4Cidr;

    private String ipv6Cidr;

    private String gatewayType;

    private String ipv4Gateway;

    private String ipv6Gateway;
}
