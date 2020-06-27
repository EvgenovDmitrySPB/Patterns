package test.design.patterns.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        System.out.println("******** pattern Singleton ****************");
        Singleton singleton = Singleton.getSingleton();
        singleton.setLogFile("log 1");
        singleton.setLogFile("log 2");
        singleton.setLogFile("log 3");
        singleton.getLogFile();
        System.out.println("******** end of pattern Singleton ****************");
    }
}
