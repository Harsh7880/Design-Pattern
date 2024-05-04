package designPattern.builderDesign;

public class Demo {
    public static void main(String[] args) {

        URLBuilder builder = new URLBuilder.Builder()
        .protocol("https:/")
        .hostName("harshKumar")
        .port(":3000/")
        .pathParams("random")
        .build();

        System.out.print(builder.protocol);
        System.out.print(builder.hostName);
        System.out.print(builder.port);
        System.out.print(builder.pathParams);


    }
}
