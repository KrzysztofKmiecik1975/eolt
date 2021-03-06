package com.java26.eolt.dto;

import com.java26.eolt.myEnum.Eolt;
import com.java26.eolt.myEnum.SupplierName;
import com.java26.eolt.myEnum.SystemVersion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EoltDto extends Eolt {
    private String eoltName;
    private String location;
    private String assetNumber;
    private String AR;
    private String netName;
    private String macAdress;
    private Integer productionYear;
    private SupplierName supplierName;
    private SystemVersion systemVersion;
    private String documentationLink;

}
