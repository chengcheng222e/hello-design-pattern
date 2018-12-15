package helloworld.creational.abstract_factory;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * Created with hello-design-pattern
 * Description：
 * User：chenyuan
 * Date：2018/12/15
 * Time：2:22 PM
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("1. Abstract Factory: ");

        SplitHelloWorldFactory abstractFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(abstractFactory.createHelloWorldInterjection(),
                abstractFactory.createHelloWorldObject());
        System.out.println(abstractFactoryHelloWorld.helloWorld());
    }
}
