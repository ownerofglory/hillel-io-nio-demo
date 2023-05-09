package ua.ithillel.iodemo.adapter;

public class Information {
    private String info;

    public Information(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Information{" +
                "info='" + info + '\'' +
                '}';
    }
}
