import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
int addm;
int withdraw;
        String id, pass;
        int choose, right = 3;
        int balance = 1500;


        System.out.println("Üyeliğinizi oluşturmak için size Kullanıcı Adı ve Şifre oluşturalım.");
        System.out.print("Lütfen kullanıcı adınızı giriniz :"); String newid= inp.next();
        System.out.print("Lütfen şifrenizi giriniz :"); String newpass=inp.next();
        System.out.println("Üyeliğiniz Oluşturulmuştur..\n\n");


        System.out.println("1-Oturum Aç\n2-Çıkış\n");
        choose = inp.nextInt();




        while (choose < 3) {

            if (choose == 1 && right!=0) {
                System.out.print("Kullanıcı Adı Giriniz :");
                id = inp.next();
                System.out.print("Şifre Giriniz :");
                pass = inp.next();
            } else {
                System.out.println("Çıkış Yapılmıştır");
                break;
            }
            while (choose !=4) {
                if (id.equals(newid) && pass.equals(newpass)) {
                    System.out.println("Hoşgeldiniz.. Yapmak İstediğiniz İşlemi Seçin ;");
                    System.out.println("1-Bakiye Sorgulama\n2-Para Yatırma\n3-Para Çekme\n4-Çıkış ;");
                    choose = inp.nextInt();
                    switch (choose) {
                        case 1:
                            if (choose==1){
                                System.out.println("Bakiyeniz :"+balance);
                                System.out.println("--------------------------------------");
                            }
                        case 2:
                            if (choose==2){
                                System.out.println("Yatırmak istediğiniz miktarı giriniz :"); addm=inp.nextInt();
                               balance=balance+addm;
                                System.out.println("Yeni bakiye :"+balance);

                                System.out.println("--------------------------------------");
                            }
                        case 3:
                            if (choose==3) {
                                System.out.println("Çekmek istediğiniz miktarı giriniz :");
                                withdraw = inp.nextInt();
                                balance = balance - withdraw;
                                System.out.println("Yeni bakiye :" + balance);
                                System.out.println("--------------------------------------");
                            }
                                if(balance<0){
                                    System.out.println("Bakiyeniz yetersiz");
                                   System.out.println("--------------------------------------");
                                }

                        case 4:
                            if (choose==4)
                                System.out.println("Başarıyla çıkış yapılmıştır.");
                                  break;
                    }


                } else {
                    right--;
                    System.out.println("Hatalı Giriş Yaptınız kalan hakkınız :" + right);

                        if (right==0){
                            System.out.println("Hesabınız bloke olmuştur");

                        }else {
                            System.out.println("Kalan Hakkınız :"+right);
                        }
                    break;      }
            }

            }
        }
    }


