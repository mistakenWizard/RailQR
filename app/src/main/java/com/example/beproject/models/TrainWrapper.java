
package com.example.beproject.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrainWrapper {

    @SerializedName("response_code")
    @Expose
    private Integer responseCode;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("debit")
    @Expose
    private Integer debit;
    @SerializedName("trains")
    @Expose
    private List<Train> trains = null;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

}
