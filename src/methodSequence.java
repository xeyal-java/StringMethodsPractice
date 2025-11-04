public class methodSequence {
    public static void main(String[] args) {

        String text = "Hello Java World";

        System.out.println("1.Boşluqsuz:" + text.trim()); // orta hisselerden basqa kenar terefleri cut edir

        System.out.println("2.Böyük hərflərlə: " + text.toUpperCase()); // string in icindeki herfleri boyuk herfe cevirir

        System.out.println( "3.Kicik hərflərlə:" + text.toLowerCase());// string in icindeki herfleri kicik herfe cevirir
        
        System.out.println("4.Hello sozu bu indeksdedir: "  + text.indexOf("Hello"));// baslangicdan tapmaq isdediyimiz sozunun indeksin qaytarir

        System.out.println("5.World sozu hansi indeksdedir:" + text.lastIndexOf("World"));//tapmaq isdediyimiz sozunun indeksin qaytarir

        System.out.println( "6.Sətir bu söznən başlayırmı:" + text.startsWith("Hello") ); // burda setir bu sozle baslayirmi emri veririk

        System.out.println("7.Sətir bu söznən bitirmi:" + text.endsWith("World") );//burda setir bu sozle bitrmi emri veririk

        System.out.println("8.‘Java’ movcuddur? " + text.contains("Java"));// daxil etdiyimiz metin varmi yoxmu yoxlayir

        System.out.println("9.‘Java’nı ‘C++’ ilə əvəz et: " + text.replace("Java", "C++"));// daxil etdiyimiz adi secdiyimiz textdeki ile evez edir

        System.out.println("10.Substring : " + text.substring(6,10));// enter etdiyimiz index leri return ele bize

        System.out.println("11.herf boyuk kiciyliyin nezere alma:" + text.equalsIgnoreCase("hello java world"));// axtaris etmey istenilen metninin boyuk kicik herfini nezere almadan return edir

    }
}