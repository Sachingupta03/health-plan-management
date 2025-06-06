package com.sachin.health_plan_management.service;

import com.sachin.health_plan_management.model.HealthPlan;
import java.util.List;

public interface HealthPlanService {

    HealthPlan addPlan(HealthPlan plan);

    //  Fixed typo here
    HealthPlan getPlanById(int id);

    List<HealthPlan> getAllPlans();

    HealthPlan updatePlan(int id, HealthPlan plan);

    void deletePlan(int id);



}
