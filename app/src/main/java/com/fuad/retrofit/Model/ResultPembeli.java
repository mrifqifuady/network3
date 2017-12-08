package com.fuad.retrofit.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by ASUS on 07/12/2017.
 */

public class ResultPembeli {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private List<Pembeli> result = new ArrayList<Pembeli>();
    @SerializedName("message")
    private String message;
    public ResultPembeli() {}
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Pembeli> getResult() {
        return result;
    }
    public void setResult(List<Pembeli> result) {
        this.result = result;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}