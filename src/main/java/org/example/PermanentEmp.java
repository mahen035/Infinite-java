package org.example;

public class PermanentEmp extends Emp{

    private float pfPercent;

    public float getPfPercent() {
        return pfPercent;
    }

    public void setPfPercent(float pfPercent) {
        this.pfPercent = pfPercent;
    }

    public void calNetSalary(){
       setNetSalary(getSalary() - (getSalary() * (pfPercent/100)));
    }
}
