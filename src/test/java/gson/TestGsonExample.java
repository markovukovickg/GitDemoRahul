package gson;

public class TestGsonExample {

    public static void main(String[] args) {
        Employee e1 = new Employee("Pera", "Peric", 24, 700.0, "tester");
        System.out.println(e1.getFullName());
        System.out.println(e1);

        e1.addSkill("test automation");
        e1.addSkill("performance testing");
        System.out.println();
        System.out.println(e1);
        System.out.println(e1.hasSkill("test automation"));
        System.out.println();
        System.out.println(e1.hasSkill("security testing"));
        System.out.println();

        GsonExample gsonExample = new GsonExample();
        String jsonEmployee1 = gsonExample.createEmployeeJsonObject(e1);
        String jsonEmployee3 = gsonExample.createEmployeeJsonObjectBuilder(e1);

        System.out.println();
        System.out.println(jsonEmployee1);
        System.out.println();
        System.out.println(jsonEmployee3);

        String jsonEmployee2 = "{\"firstName\":\"Mika\",\"lastName\":\"Mikic\",\"age\":32,\"salary\":1200.0,\"position\":\"developer\",\"skills\":[\"java\",\"python\"]}";
        System.out.println();
        Employee e2 = gsonExample.createEmployeeJavaObject(jsonEmployee2);
        System.out.println(e2);

        System.out.println();
        Employee e4 = gsonExample.createEmployeeJavaObjectBuilder(jsonEmployee2);
        System.out.println(e4);
    }
}
