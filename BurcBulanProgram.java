import java.util.Scanner;

public class BurcBulanProgram {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        byte day, month;
        boolean isEroor = false;
        String burc = "";

        System.out.print("Doğduğunuz ay :");
        month = inp.nextByte();

        System.out.print("Doğdunuz gün :");
        day = inp.nextByte();

        if (month == 1){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 2){
            if (day >= 1 && day <= 28){
                if (day <= 19){
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 3){
            if (day >= 1 && day <= 31){
                if (day <= 20){
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 4){
            if (day >= 1 && day <= 30){
                if (day <= 20){
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isEroor = true ;
            }
        }
        if (month == 5){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 6){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 7){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 8){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Aslan;";
                } else {
                    burc = "Başak";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 9){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 10){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 11){
            if (day >=1 && day <= 30){
                if (day <= 21){
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isEroor = true;
            }
        }
        if (month == 12){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isEroor = true;
            }
        } else if (month >12 || month < 1){
            System.out.println("Hatalı giriş yaptınız !");
        } if (isEroor){
            System.out.println("Hatalı giriş yaptınız !");
        } else {
            System.out.println("Burcunuz :" + burc);
        }
        }
        }



