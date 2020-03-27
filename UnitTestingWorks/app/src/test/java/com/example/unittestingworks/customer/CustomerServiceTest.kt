package com.example.unittestingworks.customer

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.verify

class CustomerServiceTest {

    lateinit var customerService : CustomerService
    lateinit var customerRepo: CustomerRepo
    lateinit var infoService: InfoService

    @Before
    fun setUp() {
        customerService = Mockito.mock(CustomerService::class.java)
        customerRepo = Mockito.mock(CustomerRepo::class.java)
        infoService = Mockito.mock(InfoService::class.java)
        customerService.customerRepo = customerRepo
        customerService.infoService = infoService
    }

    @Test
    fun testSaveCustomer (){
       val customer = Mockito.mock(Customer::class.java)
       customerService.saveCustomer(customer)

        //check
        verify(customerService.customerRepo).saveCustomer(customer)
        verify(customerService.infoService).sendEMail(customer)

    }

}