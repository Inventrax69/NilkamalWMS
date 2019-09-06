package com.inventrax.athome.pojos;

import com.google.gson.annotations.SerializedName;

public class EcomPackingDTO {

    @SerializedName("UserID")
    private String userID;
    @SerializedName("VlpdID")
    private String VlpdID;
    @SerializedName("Barcode")
    private String Barcode;
    @SerializedName("BarcodeType")
    private String BarcodeType;
    @SerializedName("RSNPrinter")
    private String RSNPrinter;
    @SerializedName("NIlkamalInvoicePrinter")
    private String NIlkamalInvoicePrinter;
    @SerializedName("MarketPlaceInvoicePrinter")
    private String MarketPlaceInvoicePrinter;
    @SerializedName("FlipcartBulkOrderPrinter")
    private String FlipcartBulkOrderPrinter;
    @SerializedName("AmazonBulkOrderPrinter")
    private String AmazonBulkOrderPrinter;
    @SerializedName("IsPrintRSNWithMRPRequired")
    private Boolean IsPrintRSNWithMRPRequired;
    @SerializedName("ISPrintRSNWithoutMRPRequired")
    private Boolean ISPrintRSNWithoutMRPRequired;
    @SerializedName("ISPrintMarketPlaceShippingLableRequired")
    private Boolean ISPrintMarketPlaceShippingLableRequired;
    @SerializedName("ISPrintNilkamalInvoiceRequired")
    private Boolean ISPrintNilkamalInvoiceRequired;
    @SerializedName("ISPrintBulkOrderShippingLableRequired")
    private Boolean ISPrintBulkOrderShippingLableRequired;
    @SerializedName("ISPrintAmazonAsinStickerRequired")
    private Boolean ISPrintAmazonAsinStickerRequired;
    @SerializedName("VlpdNumber")
    private String VlpdNumber;
    @SerializedName("SoNumber")
    private String SoNumber;
    @SerializedName("LoadRef")
    private String LoadRef;
    @SerializedName("ResourceType")
    private String ResourceType;


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getVlpdID() {
        return VlpdID;
    }

    public void setVlpdID(String vlpdID) {
        VlpdID = vlpdID;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getBarcodeType() {
        return BarcodeType;
    }

    public void setBarcodeType(String barcodeType) {
        BarcodeType = barcodeType;
    }

    public String getRSNPrinter() {
        return RSNPrinter;
    }

    public void setRSNPrinter(String RSNPrinter) {
        this.RSNPrinter = RSNPrinter;
    }

    public String getNIlkamalInvoicePrinter() {
        return NIlkamalInvoicePrinter;
    }

    public void setNIlkamalInvoicePrinter(String NIlkamalInvoicePrinter) {
        this.NIlkamalInvoicePrinter = NIlkamalInvoicePrinter;
    }

    public String getMarketPlaceInvoicePrinter() {
        return MarketPlaceInvoicePrinter;
    }

    public void setMarketPlaceInvoicePrinter(String marketPlaceInvoicePrinter) {
        MarketPlaceInvoicePrinter = marketPlaceInvoicePrinter;
    }

    public String getFlipcartBulkOrderPrinter() {
        return FlipcartBulkOrderPrinter;
    }

    public void setFlipcartBulkOrderPrinter(String flipcartBulkOrderPrinter) {
        FlipcartBulkOrderPrinter = flipcartBulkOrderPrinter;
    }

    public String getAmazonBulkOrderPrinter() {
        return AmazonBulkOrderPrinter;
    }

    public void setAmazonBulkOrderPrinter(String amazonBulkOrderPrinter) {
        AmazonBulkOrderPrinter = amazonBulkOrderPrinter;
    }

    public Boolean getPrintRSNWithMRPRequired() {
        return IsPrintRSNWithMRPRequired;
    }

    public void setPrintRSNWithMRPRequired(Boolean printRSNWithMRPRequired) {
        IsPrintRSNWithMRPRequired = printRSNWithMRPRequired;
    }

    public Boolean getISPrintRSNWithoutMRPRequired() {
        return ISPrintRSNWithoutMRPRequired;
    }

    public void setISPrintRSNWithoutMRPRequired(Boolean ISPrintRSNWithoutMRPRequired) {
        this.ISPrintRSNWithoutMRPRequired = ISPrintRSNWithoutMRPRequired;
    }

    public Boolean getISPrintMarketPlaceShippingLableRequired() {
        return ISPrintMarketPlaceShippingLableRequired;
    }

    public void setISPrintMarketPlaceShippingLableRequired(Boolean ISPrintMarketPlaceShippingLableRequired) {
        this.ISPrintMarketPlaceShippingLableRequired = ISPrintMarketPlaceShippingLableRequired;
    }

    public Boolean getISPrintNilkamalInvoiceRequired() {
        return ISPrintNilkamalInvoiceRequired;
    }

    public void setISPrintNilkamalInvoiceRequired(Boolean ISPrintNilkamalInvoiceRequired) {
        this.ISPrintNilkamalInvoiceRequired = ISPrintNilkamalInvoiceRequired;
    }

    public Boolean getISPrintBulkOrderShippingLableRequired() {
        return ISPrintBulkOrderShippingLableRequired;
    }

    public void setISPrintBulkOrderShippingLableRequired(Boolean ISPrintBulkOrderShippingLableRequired) {
        this.ISPrintBulkOrderShippingLableRequired = ISPrintBulkOrderShippingLableRequired;
    }

    public Boolean getISPrintAmazonAsinStickerRequired() {
        return ISPrintAmazonAsinStickerRequired;
    }

    public void setISPrintAmazonAsinStickerRequired(Boolean ISPrintAmazonAsinStickerRequired) {
        this.ISPrintAmazonAsinStickerRequired = ISPrintAmazonAsinStickerRequired;
    }

    public String getVlpdNumber() {
        return VlpdNumber;
    }

    public void setVlpdNumber(String vlpdNumber) {
        VlpdNumber = vlpdNumber;
    }

    public String getSoNumber() {
        return SoNumber;
    }

    public void setSoNumber(String soNumber) {
        SoNumber = soNumber;
    }

    public String getLoadRef() {
        return LoadRef;
    }

    public void setLoadRef(String loadRef) {
        LoadRef = loadRef;
    }

    public String getResourceType() {
        return ResourceType;
    }

    public void setResourceType(String resourceType) {
        ResourceType = resourceType;
    }
}

