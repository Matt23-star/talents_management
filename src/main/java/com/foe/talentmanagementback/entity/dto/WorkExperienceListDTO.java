package com.foe.talentmanagementback.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.foe.talentmanagementback.utils.FloatConvert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/13/10:14
 * @description:
 */
public class WorkExperienceListDTO {

    private List<String> departmentNames;

    private List<String> positions;

    private List<Float> salaries;

    private List<Integer> workingYears;

    public WorkExperienceListDTO() {
        departmentNames = new ArrayList<>();
        positions = new ArrayList<>();
        salaries = new ArrayList<>();
        workingYears = new ArrayList<>();
    }

    public List<String> getDepartmentNames() {
        return departmentNames;
    }

    public void setDepartmentNames(List<String> departmentNames) {
        this.departmentNames = departmentNames;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public List<Float> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Float> salaries) {
        this.salaries = salaries;
    }

    public List<Integer> getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(List<Integer> workingYears) {
        this.workingYears = workingYears;
    }

    @Override
    public String toString() {
        return "WorkExperienceListDTO{" +
                "departmentNames=" + departmentNames +
                ", positions=" + positions +
                ", salaries=" + salaries +
                ", workingYears=" + workingYears +
                '}';
    }
}
