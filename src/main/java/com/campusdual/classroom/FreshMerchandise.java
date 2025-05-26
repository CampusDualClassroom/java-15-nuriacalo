package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    private final SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        return "The location of the Merchandise is : " + getLocation() + ". The expiration date is : " + getFormattedDate(getExpirationDate());
    }

    public String printSpecificData() {
        return getSpecificData().toString();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date date) {
        return format.format(date);
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
