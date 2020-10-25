package com.ds.usc;

public class CarFactory  {
    public Cars get(String car_company) throws Exception {
        if (car_company.equals("saipa")){
            return new Saipa();
        }
        else if (car_company.equals("irankhodro"))
            return  new Ikco();
        else throw new Exception ("dont know");
    }
}
