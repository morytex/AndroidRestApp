package br.com.moryta.androidrestapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by moryta on 21/06/2017.
 */

public class Android {
    @SerializedName("versao")
    private String version;

    @SerializedName("nome")
    private String name;

    @SerializedName("api")
    private String api;

    @SerializedName("urlImagem")
    private String imageUrl;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
