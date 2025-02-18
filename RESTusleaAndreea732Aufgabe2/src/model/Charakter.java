package model;
import java.util.ArrayList;
import java.util.List;

public class Charakter{

    Integer id;
    String name;
    String herkunftsort;
    List<Produkt> produkte = new ArrayList<>();

    public Charakter(Integer id, String name, String herkunftsort) {
        this.id = id;
        this.name = name;
        this.herkunftsort = herkunftsort;
    }

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
        this.name = name;
    }

    public String getHerkunftsort() {
        return herkunftsort;
    }

    public void setHerkunftsort(String herkunftsort) {
        this.herkunftsort = herkunftsort;
    }

    public List<Produkt> getMedikamenten() {
        return produkte;
    }

    public void setProdukte(List<Produkt> medikamenten) {
        this.produkte = produkte;
    }

}
