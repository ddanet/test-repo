package helloworld.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Invoice {
    private Integer invoiceId;
    private Integer workOrderId;
    private Integer serviceProviderId;
    private String serviceProviderWorkOrderId;
    private Integer customerId;
    private Integer assetId;
    private Integer assetTypeId;
    private String failureTypeId;
    private Integer categoryTypeId;
    private String invoiceNo;
    private Long invoiceSerial;
    private String parts;
    private String labor;
    private String material;
    private Double tax;
    private Double freight;
    private Double other;
    private String additionalNote;
    private Double totalAmount;
    private Double invoiceStatus;
    private String invoiceToken;
    private Integer flagDeActive;
    private String document;
    private Long originator;
    private String invoiceType;
    private String createdBy;
    private String glCode;
}
