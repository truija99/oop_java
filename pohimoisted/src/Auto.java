public class Auto {
    private String nimetus;
    private Boolean mootor;
    private Integer rattad;
    private Integer võimsus;

    public Auto(String nimetus, Integer võimsus) {
        this.nimetus = nimetus;  //panime need 2 ainult konstruktoriga
        this.võimsus = võimsus;
        this.rattad = 4;  //4 ratast
        this.mootor = true;  //ei pane kindlat parameetrit, vaid et peab olema lihtsalt
    }

    public void kaivita() { //anname talle võimaluse käivitada
        System.out.println("Auto käivitus");
    }

    public void kiirenda() { //anname talle võimaluse käivitada
        System.out.println("Auto kiirendas");
    }

    public void pidurda() { //anname talle võimaluse käivitada
        System.out.println("Auto pidurdas");
    }

    public String getNimetus() {
        return nimetus;
    }
}

