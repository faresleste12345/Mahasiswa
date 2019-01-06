package com.meridianid.farizdotid.mahasiswaapp.util.api;

public class UtilsApi {


    public static final String BASE_URL_API = "http://192.168.0.122/mahasiswa/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
