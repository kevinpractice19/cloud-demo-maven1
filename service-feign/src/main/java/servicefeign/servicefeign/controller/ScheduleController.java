package servicefeign.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import servicefeign.servicefeign.service.SchedualServiceHiHystric;
import servicefeign.servicefeign.service.ScheduleService;

@RestController
public class ScheduleController {

    @Autowired
    private SchedualServiceHiHystric scheduleService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return scheduleService.sayHiFromClientOne(name);
    }


}
