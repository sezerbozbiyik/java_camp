public class Main {
    public static void main(String[] args) throws Exception {

        String internetSubeButou = "İnternet Şubesiye Gir";
        double dolarDun = 8.15;
        double dolarBugun = 8.15;
        //int vade = 36;
        //boolean dustuMu = false;

        System.out.println(internetSubeButou);

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar Düştü.");
        } else if (dolarBugun > dolarDun) {
            System.out.println("Dolar Yükseldi.");
        } else {
            System.out.println("Dolar Eşittir.");
        }

        System.out.println("-------------------");

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Mutlu emeklilik kredisi";
        String kredi3 = "Konut kredisi";
        String kredi4 = "Çiftçi kredisi";
        String kredi5 = "Msb kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);

        System.out.println("-------------------");
        String[] krediler = { kredi1, kredi2, kredi3, kredi4, kredi5 };

        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);

        }
    }
}
