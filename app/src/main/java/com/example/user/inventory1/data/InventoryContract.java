package com.example.user.inventory1.data;

import android.provider.BaseColumns;

/**
 * Created by User on 25/12/2016.
 */

public class InventoryContract {
    private InventoryContract(){}

    public static final class InventoryEntry implements BaseColumns{

        public static final String TABLE_NAME = "Inventory";
        public static final String _ID = BaseColumns._ID;
        public static final String STOCK_NAME = "stock";
        public static final String STOCK_TYPE = "type";
        public static final String STOCK_COST = "cost";
        public static final String STOCK_DATE = "recordDate";



    }



}
