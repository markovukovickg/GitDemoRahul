package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GsonExample {
    // Java Object -> Json String
    public String createEmployeeJsonObject(Employee employee){
        Gson gson = new Gson();
        String json = gson.toJson(employee,Employee.class);
        return json;
    }

    public String createEmployeeJsonObjectBuilder(Employee employee){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(employee,Employee.class);
        return json;
    }

    public Employee createEmployeeJavaObject(String json){
        Gson gson = new Gson();
        Employee employee = gson.fromJson(json,Employee.class);
        return employee;
    }

    public Employee createEmployeeJavaObjectBuilder(String json){
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Employee employee = gson.fromJson(json,Employee.class);
        return employee;
    }
}
