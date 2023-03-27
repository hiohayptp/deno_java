package org.example.Java8Function;

interface sayHello{
    void say(String hello);
}
interface number {

}
public class ExampleLambda {
    public static void main(String[] args) {
        sayHello s = hello -> System.out.println(hello);
        s.say("Hello");
    }
}
