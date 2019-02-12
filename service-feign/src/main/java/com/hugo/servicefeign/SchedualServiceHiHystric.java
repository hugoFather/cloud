package com.hugo.servicefeign;

import org.springframework.stereotype.Component;

/**
 * created by gxh 2019-02-02
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
