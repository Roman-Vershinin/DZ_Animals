package data;

public enum Commands {
    ADD("add"),
    LIST("list"),
    EXIT("exit");


    private String value;



    Commands(String value) {
        this.value = value;
    }


}