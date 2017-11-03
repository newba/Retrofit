package br.com.darksite.tp2mobileavecretrofit;

/**
 * Created by msant on 2017-11-03.
 */

public class Product {

    private String code;
    private String name;
    private int price;
    private String description;
    private int inventoryActual;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInventoryActual() {
        return inventoryActual;
    }

    public void setInventoryActual(int inventoryActual) {
        this.inventoryActual = inventoryActual;
    }
}
