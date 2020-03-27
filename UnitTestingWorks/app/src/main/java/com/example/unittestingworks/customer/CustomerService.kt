package com.example.unittestingworks.customer


open class CustomerService {

    var customerRepo = CustomerRepo()
    var infoService = InfoService()

    fun saveCustomer (customer: Customer){
        customerRepo.saveCustomer(customer)
        infoService.sendEMail(customer)
    }

}