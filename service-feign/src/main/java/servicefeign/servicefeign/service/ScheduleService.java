package servicefeign.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-service", fallback = SchedualServiceHiHystric.class)
public interface ScheduleService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
