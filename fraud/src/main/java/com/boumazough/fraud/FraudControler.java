package com.boumazough.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudControler {


    private  final FraudCheckService fraudCheckService;



    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId) {
       boolean isFraudulenCustomer = fraudCheckService.
               isFraudulentCustomer(customerId);
       log.info("fraud check request for customer {}", customerId);

       return  new FraudCheckResponse(isFraudulenCustomer);
    }
}
