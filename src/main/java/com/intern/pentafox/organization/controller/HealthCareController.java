package com.intern.pentafox.organization.controller;

import com.intern.pentafox.organization.entity.HealthCare;
import com.intern.pentafox.organization.service.HealthCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Healthcare")
public class HealthCareController {
   @Autowired
   private HealthCareService service;
    @PostMapping("/addhealthcare")
    public  HealthCare  addhealthcare(@RequestBody HealthCare healthcares){
        return service.saveHealthCare(healthcares);
    }
    @PostMapping("/addhealthcares")
    public List<HealthCare > addhealthcares(@RequestBody List<HealthCare> healthcares){
        return service.saveHealthCares( healthcares);
    }
  @GetMapping("/HealthCare")
  public List<HealthCare>findAll(){
        return service.gethealthcares();
    }
   @GetMapping("/id/{id}")
   public HealthCare getuserId(@PathVariable int id){
        return service.getHealthCareById(id);
    }
    @GetMapping("/name/{name}")
    public HealthCare getByname(@PathVariable String name){
        return service.getHealthCareByName(name);
    }
   @PutMapping("/update")
   public HealthCare updateHealthCare(@RequestBody HealthCare healthcare){
        return service.updateHealthCare(healthcare);
    }
   @DeleteMapping("/deletehealthcare/{id}")
   public String deleteHealthCare(@PathVariable int id)
   {
      return  service.deleteHealthCare(id);
   }


}
