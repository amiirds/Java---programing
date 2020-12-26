package com.ds.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/EmployeeInformation")
public class EmployeeInfo {
    @Path("/info")
    @GET
    @Produces("text/plain")
    public String save (@QueryParam("Name") String name , @QueryParam("Gender") String gender , @QueryParam("Age") String age ,@QueryParam("Education") String education )
    {
        System.out.println("form executed in server");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", name);
        jsonObject.put("Gender",gender);
        jsonObject.put("Age", age);
        jsonObject.put("Education",education);

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject);

        return jsonArray.toJSONString();
    }

}
