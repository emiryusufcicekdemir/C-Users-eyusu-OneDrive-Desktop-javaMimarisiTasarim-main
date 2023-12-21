public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Temel Bilgisayar Fiyat :" + temelBilgisayar.fiyat() + " TL");
        System.out.println("TEmel Bilgisayar Açıklama : "  + temelBilgisayar.aciklama());

        //8GB Ram ekle

        Bilgisayar ram8Bilgisayar = new RamEkleDecorator(new TemelBilgisayar() , 8);
        System.out.println("8 GB Ram eklenmiş fiyat : " + ram8Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram8Bilgisayar.aciklama());

        //16GB Ram ekle

        Bilgisayar ram16Bilgisayar = new RamEkleDecorator(new TemelBilgisayar() , 16);
        System.out.println("16 GB Ram eklenmiş fiyat : " + ram16Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram16Bilgisayar.aciklama());

        //500GB hafıza ekle

        Bilgisayar depolama500Bilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar() , 500);
        System.out.println("500 GB  eklenmiş  fiyat : " + depolama500Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + depolama500Bilgisayar.aciklama());

        //2000GB hafıza ekle

        Bilgisayar depolama2000Bilgisayar = new DepolamaBirimiEkleDecorator(new TemelBilgisayar() , 500);
        System.out.println("2000 GB  eklenmiş  fiyat : " + depolama2000Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + depolama2000Bilgisayar.aciklama());

        //8 GB ram 500 GB hafıza ekle

        Bilgisayar ram8500Bilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(),8) , 500);
        System.out.println("8 GB Ram 500 GB  eklenmiş fiyat : " + ram8500Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram8500Bilgisayar.aciklama());

        //16 GB ram 2000 GB hafıza ekle

        Bilgisayar ram162000Bilgisayar = new DepolamaBirimiEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(),8) , 500);
        System.out.println("16 GB Ram 2000 GB  eklenmiş fiyat : " + ram162000Bilgisayar.fiyat() + " TL");
        System.out.println("Açıklama : " + ram162000Bilgisayar.aciklama());







    }
}