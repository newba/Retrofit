package br.com.darksite.tp2mobileavecretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by msant on 2017-11-03.
 */

public interface IProducts {

    @POST("/products/add")
    Call<Void> insertProduct(@Body Product product);

    @GET("/products")
    Call<List<Product>> getProducts();

    @PUT("/products/update/{id}")
    Call<Void> updateProduct(@Path("id") String id, @Body Product product);

    @DELETE("products/remove/{id}")
    Call<Void> removeProduct(@Path("id") String id);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3033/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
