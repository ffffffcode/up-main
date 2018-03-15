package ex.aaronfae.entity;

public class Homework {

    private Integer id;
    private String uper;
    private String filename;

    public Homework() {
    }

    public Homework(Integer id, String uper, String filename) {
        this.id = id;
        this.uper = uper;
        this.filename = filename;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
