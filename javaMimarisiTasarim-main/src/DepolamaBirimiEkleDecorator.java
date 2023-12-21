public class DepolamaBirimiEkleDecorator extends BilgisayarDecorator{

    int depolamaBüyüklügü;
    double fiyat;

    public DepolamaBirimiEkleDecorator(Bilgisayar bilgisayar, int depolamaBüyüklügü) {
        super(bilgisayar);
        this.depolamaBüyüklügü = depolamaBüyüklügü;
    }

    @Override
    public double fiyat() {
        if (depolamaBüyüklügü == 500 ){
            //500 GB ekle
            fiyat = super.fiyat() + 3500;
        } else if (depolamaBüyüklügü == 1000) {
            //1000 GB ekle
            fiyat = super.fiyat() + 5000;
        }else if (depolamaBüyüklügü == 2000){
            //2000 GB ekle
            fiyat = super.fiyat() + 8000;
        }else {
            System.out.println("Yalnızca 500 - 1000 - 2000 GB hafıza seçilebilir");
        }
        return fiyat;
    }

    @Override
    public String aciklama() {
        return super.aciklama() +" " + depolamaBüyüklügü + " GB hafıza eklendi... \n";
    }
}
