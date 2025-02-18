package controller;
import model.Charakter;
import model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Produkt> produktList = new ArrayList<>();

    List<Charakter> charakterList= new ArrayList<>();

    //--------------------------------------------------------------------
    // a)

    public Produkt findProdukt(String name) {
        for (Produkt produkt : produktList) {
            if (produkt.getName().equals(name))
                return produkt;
        }

        return null;
    }

    /**
     * O metoda care adauga un medicament nou
     *
     * @param name      Numele produsului
     * @param preis     Pretul produsului
     * @param herkunftsregion
     * @return true, daca a fost adaugat cu succes, sau false, daca nu.
     */
    public boolean addProdukt(String name, Integer preis, String herkunftsregion) {
        if (produktList.stream()
                .filter((produkt) -> produkt.getName().equals(name))
                .count() != 0) {
            return false;
        }

        Produkt produkt = new Produkt(name, preis, herkunftsregion);

        return produktList.add(produkt);
    }


    public boolean updateProdukt(String oldName, String newName, Integer newPreis, String newHerkunftsregion) {

        Produkt produkt = findProdukt(oldName);

        if (produkt == null)
            return false;
        if (newName != null)
            produkt.setName(newName);

        if (newPreis != null)
            produkt.setPreis(newPreis);

        // daca utilizatorul a dat o boala noua, o punem
        if (newHerkunftsregion != null)
            produkt.setHerkunftsregion(newHerkunftsregion);

        return true;
    }

    public boolean removeMedikament(String name) {
        Produkt medikament = findProdukt(name);

        return produktList.remove(medikament);
    }


}