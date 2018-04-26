package cn.opencil.po;

public class ResourceType {
    private Integer id;

    private String name;

    private String description;

    private Byte disposable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getDisposable() {
        return disposable;
    }

    public void setDisposable(Byte disposable) {
        this.disposable = disposable;
    }
}