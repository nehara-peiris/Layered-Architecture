package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBoImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBoImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getBoFactory(){
        return boFactory==null ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMER, ITEM, PLACEORDER
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return new CustomerBoImpl();
            case ITEM:
                return new ItemBoImpl();
            case PLACEORDER:
                return new PurchaseOrderBoImpl();
        }
    }
}
