package com.sachin.health_plan_management.service.impl;

import com.sachin.health_plan_management.exception.ResourceNotFoundException;
import com.sachin.health_plan_management.model.HealthPlan;
import com.sachin.health_plan_management.repository.HealthPlanRepository;
import com.sachin.health_plan_management.service.HealthPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthPlanImpl implements HealthPlanService {

    @Autowired
    private HealthPlanRepository healthPlanRepository;

    @Override
    public HealthPlan addPlan(HealthPlan plan) {
        return healthPlanRepository.save (plan);
    }

    //  Fixed typo here
    @Override
    public HealthPlan getPlanById(int id) {
        return healthPlanRepository.findById (id)
                .orElseThrow ();
    }


    @Override
    public List<HealthPlan> getAllPlans() {
        return healthPlanRepository.findAll();
    }


    @Override
    public HealthPlan updatePlan(int id, HealthPlan plan) {
        HealthPlan existing = getPlanById (id);
        existing.setPlanName (plan.getPlanName ());
        existing.setCoverageDetails (plan.getCoverageDetails ());
        existing.setPremium (plan.getPremium ());
        existing.setDurationInMonth(plan.getDurationInMonth());
        existing.setProviderName (plan.getProviderName ());
        return healthPlanRepository.save (existing);
    }

    @Override
    public void deletePlan(int id) {
        HealthPlan existing = getPlanById (id);
        healthPlanRepository.delete (existing);
    }



}
