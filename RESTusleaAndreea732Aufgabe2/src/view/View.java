package view;
import java.util.List;
import java.util.Scanner;
import controller.Controller;
import model.Charakter;
import model.Produkt;

public class View {

    public Controller controller = new Controller();

    public void home() {
        // a
        System.out.println("1. Produkt hinzufugen");
        System.out.println("2. Produkt loschen");
        System.out.println("3. Produkt bearbeiten");
        System.out.println("4. Produktt suchen");
        /**
        if(input.equals("1"))
            produktHinzufugen();
        else if(input.equals("2"))
            produktLoschen();
        else if(input.equals("3"))
            produktBearbeiten();
        else if(input.equals("4"))
            produktSuchen();

        public void produktHinzufugen() {
            Scanner scanner = new Scanner(System.in);

            // primim ca input un nume, pret si boala

            System.out.println("Produktname = ");
            String name = scanner.nextLine();

            System.out.println("Produkt Preis = ");
            Integer preis = Integer.parseInt(scanner.nextLine());

            System.out.println("Produkt Herkunft = ");
            String herkunft = scanner.nextLine();

            // salvam rezultatul adaugarii in variabila asta
            boolean success = controller.addProdukt(name, preis, herkunft);

            // scriem mesajul daca a avut succes sau nu
            if(success)
                System.out.println(" erfolgreich hinzugefugt!");
            else
                System.out.println("Man konnte nicht hinzufugen.");

            // mergem inapoi la pagina principala
            home();
        }

        public void produktLoschen() {
            Scanner scanner = new Scanner(System.in);

            // primim ca input un nume

            System.out.println("Name = ");
            String name = scanner.nextLine();

            // salvam rezultatul adaugarii in variabila asta
            boolean success = controller.removeMedikament(name);

            // scriem mesajul daca a avut succes sau nu
            if(success)
                System.out.println(" erfolgreich geloscht!");
            else
                System.out.println("Man konnte nicht loschen.");

            // mergem inapoi la pagina principala
            home();
        }

        public void prooduktBearbeiten() {
            Scanner scanner = new Scanner(System.in);

            // primim ca input un nume

            System.out.println("Name der bearbeitete Produkt = ");
            String name = scanner.nextLine();

            // apoi primim datele cu care vrem sa inlocuim (nume, pret,

            System.out.println("Produktenname = ");
            String newName = scanner.nextLine();

            System.out.println("Produk Preis = ");
            Integer newPreis = Integer.parseInt(scanner.nextLine());

            System.out.println("Produkt herk = ");
            String newHerkunft = scanner.nextLine();

            // salvam rezultatul adaugarii in variabila asta
            boolean success = controller.updateProdukt(name, newName, newPreis, newHerkunft);

            // scriem mesajul daca a avut succes sau nu
            if(success)
                System.out.println(" erfolgreich bearbeitet!");
            else
                System.out.println("Man konnte nicht bearbeiten.");

            // mergem inapoi la pagina principala
            home();
        }

        public void produktSuchen() {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Name = ");
            String name = scanner.nextLine();

            Produkt produkt = controller.findProdukt(name);

            if(produkt == null) {
                System.out.println("Man konnte nicht finden");
            }
            else {
                System.out.println("Name = " + produkt.getName());
                System.out.println("Preis = " + produkt.getPreis());
                System.out.println("Herkunft = " + produkt.getHerkunftsregion());
            }

            home();
            */
        }




    }