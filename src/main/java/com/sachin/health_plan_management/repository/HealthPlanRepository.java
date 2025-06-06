package com.sachin.health_plan_management.repository;

import com.sachin.health_plan_management.model.HealthPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthPlanRepository extends JpaRepository<HealthPlan, Integer> {
    // No need to implement methods - Spring Data JPA handles this automatically
}