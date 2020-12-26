package com.ds.controller;

import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/Student")

public class Student {
    @Path("/Information")
    @GET
    @Produces("text/plain")
    public String students (@QueryParam("name") String name ,@QueryParam("stId") String ID, @QueryParam("Math") String mathScore)
    {
        System.out.println("server is executed in server");
        JSONObject info = new JSONObject();
        info.put("Name", name);
        info.put("Id", ID);
        JSONObject score = new JSONObject();
        score.put("math score", mathScore);
        return " The result is  " + info.toJSONString ()+ "\t" + score.toJSONString();
    }
}
