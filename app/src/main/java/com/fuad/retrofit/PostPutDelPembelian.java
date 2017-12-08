package com.fuad.retrofit;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 20/11/2017.
 */

public class PostPutDelPembelian {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Pembelian mPembelian;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Pembelian getPembelian() {
        return mPembelian;
    }
    public void setPembelian(Pembelian pembelian) {
        mPembelian = pembelian;
    }
}
