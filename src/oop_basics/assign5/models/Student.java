package oop_basics.assign5.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name,String education) {
        super(id, name);
        this.education = education;
        this.gradeReport = new ArrayList<>();
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return this.education;
    }

    public double getAvgGrade() {
       List<Integer> allAvgResult = new ArrayList<>();

        for (GradeInfo info : gradeReport){
            if(!allAvgResult.contains(getGrade(info.getSubject()))){
                allAvgResult.add(getGrade(info.getSubject()));
            }
        }
        double totalSum = 0;
        int mean = 0;
        for (Integer integer : allAvgResult) {
            totalSum += integer;
        }
        mean = (int)totalSum / allAvgResult.size();
        return mean;
    }
    public int getGrade(String subject){
        for (GradeInfo info : gradeReport){
            if(info.getSubject().contains(subject)) {
                return info.getGrade();
            }
        }
        return 0;
    }
    public void addGrade(GradeInfo gradeInfo){
        gradeReport.add(gradeInfo);
    }
    @Override
    public String toString(){
        return getId() + " " + getName() + " " + getEmail() + " " + getEducation() + " " + getAvgGrade();
    }
}