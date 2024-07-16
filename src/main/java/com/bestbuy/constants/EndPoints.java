package com.bestbuy.constants;

/**
 * Created by Jay
 */
public class EndPoints {

    /**
     * This is Endpoints of student api
     */
    public static final String GET_ALL_PRODUCT = "/products";
    public static final String CREATE_PRODUCT = "/products";
    public static final String GET_PRODUCT_BY_ID = "/products/{productID}";
    public static final String PATCH_PRODUCT_BY_ID = "/products/{productID}";
    public static final String DELETE_PRODUCT_BY_ID = "/products/{productID}";


    /**
     * This is Endpoints of Store Api
     */

    public static final String GET_ALL_STORE = "/stores";
    public static final String CREATE_STORE = "/stores";
    public static final String GET_STORE_BY_ID = "/stores/{storeID}";
    public static final String PATCH_STORE_BY_ID = "/stores/{storeID}";
    public static final String DELETE_STORE_BY_ID = "/stores/{storeID}";

}