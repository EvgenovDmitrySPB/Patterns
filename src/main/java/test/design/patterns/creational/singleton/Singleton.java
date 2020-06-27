package test.design.patterns.creational.singleton;

public class Singleton {

    private static Singleton INSTANCE;
    private String logFile = "This is log file. \n";

    public static Singleton getSingleton(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void getLogFile() {
        System.out.println("Singleton logfile: \n" + this.logFile);
        System.out.println("End singleton logfile: ");
    }

    public void setLogFile(String logText) {
        this.logFile = this.logFile + logText + "\n";
    }
}
