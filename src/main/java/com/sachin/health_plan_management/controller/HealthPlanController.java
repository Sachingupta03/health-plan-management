package com.sachin.health_plan_management.controller;


import com.sachin.health_plan_management.model.HealthPlan;
import com.sachin.health_plan_management.service.HealthPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plans")
public class HealthPlanController {

    @Autowired
    private HealthPlanService healthPlanService;

    @PostMapping
    public ResponseEntity<HealthPlan> addPlan(@RequestBody HealthPlan plan) {
        return ResponseEntity.ok(healthPlanService.addPlan(plan));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HealthPlan> getPlan(@PathVariable int id) {
        return ResponseEntity.ok(healthPlanService.getPlanById(id));
    }

    @GetMapping
    public ResponseEntity<List<HealthPlan>> getAll() {
        return ResponseEntity.ok(healthPlanService.getAllPlans());
    }

    @PutMapping("/{id}")
    public ResponseEntity<HealthPlan> updatePlan(@PathVariable int id, @RequestBody HealthPlan plan) {
        return ResponseEntity.ok (healthPlanService.updatePlan (id, plan));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlan(@PathVariable int id){
        healthPlanService.deletePlan(id);
        return ResponseEntity.ok("Plan deleted successfully.");
    }

}