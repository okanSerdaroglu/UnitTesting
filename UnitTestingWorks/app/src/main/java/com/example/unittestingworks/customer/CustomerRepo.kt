package com.example.unittestingworks.customer

import android.util.Log
import com.example.unittestingworks.customer.Customer

open class CustomerRepo {

    fun saveCustomer (customer: Customer){
        println("customer saved")
    }

}