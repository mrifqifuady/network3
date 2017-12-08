package com.fuad.retrofit;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by ASUS on 20/11/2017.
 */

public class GetPembelian {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    List<Pembelian> listDataPembelian;
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
    public List<Pembelian> getListDataPembelian() {
        return listDataPembelian;
    }
    public void setListDataPembelian(List<Pembelian> listDataPembelian) {
        this.listDataPembelian = listDataPembelian;
    }
}
