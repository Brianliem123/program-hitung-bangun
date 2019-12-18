import java.util.Scanner;

public class programluas{
    public static void main(String[]args){
        boolean runApp = true;
        try{
            while(runApp==true){
                Scanner input = new Scanner(System.in);
                System.out.println("1. Menghitung Luas Segitiga");
                System.out.println("2. Menghitung Volume Persegi");
                System.out.println("3. Menghitung Volume Prisma Segitiga");
                System.out.println("4. Menghitung Volume Kerucut");
                System.out.println("5. Untuk Keluar Program");
                System.out.print("Pilihan anda: "); int x = input.nextInt();
                switch(x){
                    case 1:
                    System.out.print("Alas: ");int alas=input.nextInt();
                    System.out.print("Tinggi: ");int tinggi=input.nextInt();
                    System.out.println(HitungLuasSegitiga(alas,tinggi)) ;
                    break;

                    case 2:
                    System.out.print("sisi: ");int sisi=input.nextInt();
                    System.out.print("sisi: ");int sisi2=input.nextInt();
                    System.out.print("sisi: ");int sisi3=input.nextInt();
                    System.out.println(HitungVolumePersegi(sisi,sisi2,sisi3));
                    break;

                    case 3:
                    System.out.print("Panjang: ");int panjang2=input.nextInt();
                    System.out.print("Lebar: ");int lebar2=input.nextInt();
                    System.out.print("Tinggi: ");int tinggi3=input.nextInt();
                    System.out.println(HitungVolumePrismaSegitiga(panjang2,lebar2,tinggi3));
                    break;

                    case 4:
                    System.out.print("Jari Jari: ");int jari=input.nextInt();
                    System.out.print("Tinggi: ");int tinggi4=input.nextInt();
                    System.out.println(HitungVolumeKerucut(jari,tinggi4)) ;
                    break;
                    
                    default:
                    runApp=false;
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Data Harus Integer");
        }        
    }

    public static double HitungLuasSegitiga(int alas, int tinggi){
        double luas = alas*tinggi*0.5;
        return luas;   
    }

    public static double HitungVolumePersegi(int sisi, int sisi2, int sisi3){
        double volume = sisi*sisi*sisi;
        return volume;
    }

    public static double HitungVolumePrismaSegitiga(int panjang, int lebar, int tinggi){
        double volume = panjang*lebar*tinggi*0.5;
        return volume;
    }

    public static double HitungVolumeKerucut(int jari, int tinggi){
        double phi = 3.14;
        double volume = (phi*jari*tinggi)/3;
        return volume;
    }    
}