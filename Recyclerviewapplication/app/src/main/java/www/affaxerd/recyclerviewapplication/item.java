package www.affaxerd.recyclerviewapplication;

public class item {
    String name;
    String email;
    Integer image;

    public item(String name, String email, Integer image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
