// Ana Hayvan sınıfı
public class Hayvan {
    private String turAdi;
    private double agirlik;
    private int yas;

    public Hayvan(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    public void getDosage() {
        System.out.println("Standart dozaj hesaplandı.");
    }

    public void getFeedSchedule() {
        System.out.println("Standart yem verme programı hesaplandı.");
    }
}

// Atlar sınıfı, Hayvan sınıfından türetilmiştir
public class Atlar extends Hayvan {
    public Atlar(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    // Atlar için özel dozaj hesaplama metodu
    @Override
    public void getDosage() {
        System.out.println("Atlar için özel dozaj hesaplandı.");
    }

    // Atlar için özel yem verme programı hesaplama metodu
    @Override
    public void getFeedSchedule() {
        System.out.println("Atlar için özel yem verme programı hesaplandı.");
    }
}

// Kedigiller sınıfı, Hayvan sınıfından türetilmiştir
public class Kedigiller extends Hayvan {
    public Kedigiller(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    // Kedigiller için özel dozaj hesaplama metodu
    @Override
    public void getDosage() {
        System.out.println("Kedigiller için özel dozaj hesaplandı.");
    }

    // Kedigiller için özel yem verme programı hesaplama metodu
    @Override
    public void getFeedSchedule() {
        System.out.println("Kedigiller için özel yem verme programı hesaplandı.");
    }
}

// Kemirgenler sınıfı, Hayvan sınıfından türetilmiştir
public class Kemirgenler extends Hayvan {
    public Kemirgenler(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    // Kemirgenler için özel dozaj hesaplama metodu
    @Override
    public void getDosage() {
        System.out.println("Kemirgenler için özel dozaj hesaplandı.");
    }

    // Kemirgenler için özel yem verme programı hesaplama metodu
    @Override
    public void getFeedSchedule() {
        System.out.println("Kemirgenler için özel yem verme programı hesaplandı.");
    }
}
