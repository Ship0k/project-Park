package by.park.entity.object;

import java.util.Objects;

/*
 * This class stores in only the names of the plant and its number in the database
 */
public class Plant {
    private int id;
    private String title;

    public Plant(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return getId() == plant.getId() &&
                Objects.equals(getTitle(), plant.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle());
    }

    @Override
    public String toString() {
        return "Plant - " +
                "id=" + id +
                ", title='" + title + '\'';
    }
}
