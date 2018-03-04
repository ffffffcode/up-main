package ex.aaronfae.entity;

public class Homework {

    private String uper;
    private String filename;

    public Homework(String uper, String filename) {
        this.uper = uper;
        this.filename = filename;
    }

    public String getUper() {
        return uper;
    }

    public void setUper(String uper) {
        this.uper = uper;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
