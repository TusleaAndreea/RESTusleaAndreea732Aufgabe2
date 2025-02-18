package model;

public class Produkt {

        private String name;
        private Integer preis;
        private String herkunftsregion;

        public Produkt(String name, Integer preis, String herkunftsregion) {
            this.name = name;
            this.preis = preis;
            this.herkunftsregion = herkunftsregion;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPreis() {
            return preis;
        }

        public void setPreis(Integer preis) {
            this.preis = preis;
        }

        public String getHerkunftsregion() {
            return herkunftsregion;
        }

        public void setHerkunftsregion(String herkunftsregion) {
            this.herkunftsregion = herkunftsregion;
        }


}
