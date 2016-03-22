package com.example.asus.healthprofiletest;

import android.widget.TextView;

/**
 * Created by ASUS on 29.10.2015.
 */
public class HealthProfile {
    private String name,surname,bmiProfile;
    private int day,month,year,age;
    private String targetHeartRate, maxHeartRate;
    private double weight, height,BMI;

    public HealthProfile(String rName, String rSurName,String rBmiProfile,
                         int rDay, int rMonth, int rYear,int rAge,
                         String rTargetHeartRate,String rMaxHeartRate,
                         double rWeight, double rHeight,double rBMI)
    {
        name=rName;
        surname=rSurName;
        if(rDay>0 && rDay<31)
            day=rDay;
        if(rMonth>0 && rMonth<12)
            month=rMonth;
        if(rYear>0 && rYear<2015)
            year=rYear;
        targetHeartRate=rTargetHeartRate;
        maxHeartRate=rMaxHeartRate;
        age=rAge;
        BMI=rBMI;
        weight=rWeight;
        height=rHeight;
    }

    public void setWeight(double rWeight){
        weight=rWeight;
    }
    public double getWeight(){ return weight;}

    public void setHeight(double rHeight){
        height=rHeight;
    }
    public double getHeight(){ return height;}

    public void setBMI(){
        BMI=(weight)/(height*height);
    }
    public double getBMI(){return BMI;}

    public void setBmiProfile(){
        if(BMI<18.5)
            bmiProfile="Under Weight";
        else if(BMI>18.5 && BMI<24.9)
            bmiProfile="Normal Weight";
        else if(BMI>24.9 && BMI<29.9)
            bmiProfile="Over Weight";
        else
            bmiProfile="Obese";
    }
    public String getBmiProfile(){return bmiProfile;}

    public void setName(String rName){
        name=rName;
    }
    public String getName(){return name;}

    public void setSurname(String rSurname){
        surname=rSurname;
    }
    public String getSurname(){return surname;}

    public void setDay(int rDay){
        if(rDay>0 && rDay<31)
            day=rDay;
    }
    public int getDay(){return day;}

    public void setMonth(int rMonth){
        if(rMonth>0 && rMonth<12)
            month=rMonth;
    }
    public int getMonth(){return month;}

    public void setYear(Integer rYear){
        if(rYear>0 && rYear<2015)
            year=rYear;
    }
    public int getYear(){return year;}

    public void setAge(){
        age=2015-year;
    }
    public int getAge(){return age;}


    public void setTargetHeartRate(){
        if(age>70)
            targetHeartRate="75-128 beats per minute";
        else if(age>65)
            targetHeartRate="78-132 beats per minute";
        else if(age>60)
            targetHeartRate="80-136 beats per minute";
        else if(age>55)
            targetHeartRate="83-140 beats per minute";
        else if(age>50)
            targetHeartRate="885-145 beats per minute";
        else if(age>45)
            targetHeartRate="88-149 beats per minute";
        else if(age>45)
            targetHeartRate="90-153 beats per minute";
        else if(age>40)
            targetHeartRate="93-157 beats per minute";
        else if(age>35)
            targetHeartRate="95-162 beats per minute";
        else if(age>30)
            targetHeartRate="95-162 beats per minute";
        else if(age>20)
            targetHeartRate="100-170 beats per minute";
        else
            targetHeartRate="Unknown";
    }
    public String getTargetHeartRate(){return targetHeartRate;}




}//end class HealthProfile

