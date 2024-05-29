package testingPackage;
import java.util.*;
import java.io.*;
import java.time.*;

class drinks {
    private String name;
    private int wet;
    private int price;
    private double taxPercent;
    private int refund;

    public drinks (String name, int wet, int price, double taxPercent, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.taxPercent = taxPercent;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getTaxPercent() {
        return taxPercent;
    }

    public double getRefund() {
        return refund;
    }
}

class juice {
    private String name;
    private int wet;
    private int price;
    private double taxPercent;
    private int refund;

    public juice (String name, int wet, int price, double taxPercent, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.taxPercent = taxPercent;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getTaxPercent() {
        return taxPercent;
    }

    public int getRefund() {
        return refund;
    }
}

class Chips {
    private String name;
    private int wet;
    private int price;
    private double taxPercent;
    private int refund;

    public Chips (String name, int wet, int price, double taxPercent, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.taxPercent = taxPercent;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getTaxPercent() {
        return taxPercent;
    }

    public int getRefund() {
        return refund;
    }
}

class Cakes {
    private String name;
    private int wet;
    private int price;
    private double taxPercent;
    private int refund;

    public Cakes (String name, int wet, int price, double taxPercent, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.taxPercent = taxPercent;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getTaxPercent() {
        return taxPercent;
    }

    public int getRefund() {
        return refund;
    }
}

class Cookies {
    private String name;
    private int wet;
    private int price;
    private double taxPercent;
    private int refund;

    public Cookies (String name, int wet, int price, double taxPercent, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.taxPercent = taxPercent;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getTaxPercent() {
        return taxPercent;
    }

    public int getRefund() {
        return refund;
    }
}

class Tea {
    private String name;
    private int wet;
    private int price;
    private int refund;

    public Tea (String name, int wet, int price, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getRefund() {
        return refund;
    }
}

class Coffee {
    private String name;
    private int wet;
    private int price;
    private int refund;

    public Coffee (String name, int wet, int price, int refund) {
        this.name = name;
        this.wet = wet;
        this.price = price;
        this.refund = refund;
    }

    
    public String getName() {
        return name;
    }

    public int getWet() {
        return wet;
    }

    public int getPrice() {
        return price;
    }


    public double getRefund() {
        return refund;
    }
}

public class App {

    private static final String FILE_NAME = "userData.txt";
    private static ArrayList<String> dataList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        drinks dr1 = new drinks("Seven Up", 250, 30, 24.4, 5);
        drinks dr2 = new drinks("Sprite", 250, 30, 24.4, 5);
        drinks dr3 = new drinks("Mojo", 250, 25, 24.4, 5);
        drinks dr4 = new drinks("Speed", 250, 35, 24.4, 5);
        drinks dr5 = new drinks("MUM-Drinking Water", 250, 20, 24.4, 5);
        juice juice1 = new juice("Sejan-Juice", 250, 25, 24.4, 5);
        juice juice2 = new juice("Pran Juice", 250, 25, 24.4, 5);
        juice juice3 = new juice("Frutika", 250, 30, 24.4, 5);
        Chips chips1 = new Chips("Bombay-Potato Chips",25, 15, 24.4, 5);
        Chips chips2 = new Chips("Kur-Kurey", 25, 20, 24.4, 5);
        Chips chips3 = new Chips("Alooz", 35, 25, 24.4, 5);
        Cakes cake1 = new Cakes("Chiffon-Cake", 15, 7, 24.4, 5);
        Cakes cake2 = new Cakes("All-Time Cake", 15, 7, 24.4, 5);
        Cakes cake3 = new Cakes("Fun Cake", 15, 7, 24.4, 5);
        Cookies cookie1 = new Cookies("Tip Biskut", 30, 20, 24.4, 5);
        Cookies cookie2 = new Cookies("Nutty", 30, 20, 24.4, 5);
        Cookies cookie3 = new Cookies("Creamy Fun", 30, 20, 24.4, 5);
        Tea tea1 = new Tea("Green Tea", 60, 15, 5);
        Tea tea2 = new Tea("Naturel Tea", 60, 15, 5);
        Tea tea3 = new Tea("Reguler Tea", 35, 20, 5);
        Coffee coffee1 = new Coffee("Coffee Black", 150, 35, 5);
        Coffee coffee2 = new Coffee("Coffee Hot", 150, 35, 5);
        Coffee coffee3 = new Coffee("Coffee Cold", 200, 65, 5);
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        

        System.out.println("------------------\nWelcome To Our system!\n------------------");
        System.out.println();
        System.out.println("------------------\n"+currentDate+"          "+currentTime+"\n------------------");
        System.out.println();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int $ = 0;
        int deposite = 0;
        int whatToViewOpt = 0;
        int quantity = 0;
        int moneyLeft = 0;
        int spentAmount = 0;
        int length = 4;
        String tokenNumber = generateToken(4);

         
        mainMenu($);
        int getOpt = enteredOptions();
        if (getOpt == 1)
        {
            deposite = enteredAmount();
        }
        else if (getOpt == 2)
        {
            whatToViewOpt = whatToView();
            if (whatToViewOpt == 1)
            {
                colddr(dr1, dr2, dr3, dr4, dr5, $);
            }
            else if (whatToViewOpt == 2)
            {
                juiceItems(juice1, juice2, juice3, $);
            }
            else if (whatToViewOpt == 3)
            {
                chipsItems(chips1, chips2, chips3, $);
            }
            else if (whatToViewOpt == 4)
            {
                cakesItem(cake1, cake2, cake3, $);
            }
            else if (whatToViewOpt == 5)
            {
                cookiesItems(cookie1, cookie2, cookie3, $);
            }
            else if (whatToViewOpt == 6)
            {
                otherItems(tea1, tea2, tea3, coffee1, coffee2, coffee3, $);
            }
            else 
            {
                System.err.println("Enter Vaid Option..");
                System.out.println("Returning to Main Menu");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main(null);
            }
        }
        else if ( getOpt == 3) {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    dataList.add(line);
                }
            } catch (IOException e) {
                System.out.println("No previous data found or error reading file.");
            }
            while (true) {
                System.out.println("Enter Password.");
                String detect = input.nextLine();
                if (detect.equals("oop")) {
                  viewData();
                  return;
                }
                else {
                    System.out.println("Wrong password..");
                }
            }
            

        }
        else 
                {
                    System.err.println("System has Over Turned..");
                    System.out.println("Invalid Option Selected..");
                    System.out.println();
                    System.out.println("Your Deposited Amount: " +deposite);
                    System.out.println("Returned Amount: " +deposite);
                    System.out.println("Collect Your Money..");
                    System.out.println();
                    System.out.println("Redirecting New Window..");
                    try {
                    Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
 
                    main(null);
                }
    
        
    
        
        Long paymentNo = MobileNo();

        int paymentChannel = paymentOpt();

        if (paymentChannel == 1)
        {
            cash(deposite);
        }
        else if (paymentChannel == 2)
        {
            Bkash(deposite);
        }
        else if (paymentChannel == 3)
        {
            Nagad(deposite);
        }
        else if (paymentChannel == 4)
        {
            Rocket(deposite);
        }
        else if (paymentChannel == 5)
        {
            upay(deposite);
        }
        else if (paymentChannel == 6)
        {
            card(deposite);
        }
        

        int userSelect = whatToDo(deposite);
          if(userSelect == 1)
          {
            int coldDrinksSelect = buyColdDrinks(dr1, dr2, dr3, dr4, dr5);
            {
                if (coldDrinksSelect == 1)
                {
                    quantity = selectedDr1(dr1, deposite);
                    moneyLeft = moneyLeft1d(dr1, deposite, quantity);
                    spentAmount += dr1.getPrice() * quantity;
                    fileWriter1(dr1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 2)
                {
                    quantity = selectedDr2(dr2, deposite);
                    moneyLeft = moneyLeft2d(dr2, deposite, quantity);
                    spentAmount += dr2.getPrice() * quantity;
                    fileWriter2(dr2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 3)
                {
                    quantity = selectedDr3(dr3, deposite);
                    moneyLeft = moneyLeft3d(dr3, deposite, quantity);
                    spentAmount += dr3.getPrice() * quantity;
                    fileWriter3(dr3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 4)
                {
                    quantity = selectedDr4(dr4, deposite);
                    moneyLeft = moneyLeft4d(dr4, deposite, quantity);
                    spentAmount += dr4.getPrice() * quantity;
                    fileWriter4(dr4, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 5)
                {
                    quantity = selectedDr5(dr5, deposite);
                    moneyLeft = moneyLeft5d(dr5, deposite, quantity);
                    spentAmount += dr5.getPrice() * quantity;
                    fileWriter5(dr5, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else 
                {
                    System.err.println("System has Over Turned..");
                    System.out.println("Invalid Option Selected..");
                    System.out.println();
                    System.out.println("Your Deposited Amount: " +deposite);
                    System.out.println("Returned Amount: " +deposite);
                    System.out.println("Collect Your Money..");
                    System.out.println();
                    System.out.println("Redirecting New Window..");
                    try {
                    Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
 
                    main(null);
                }
            }
          }
          else if(userSelect == 2)
          {
            int juiceSelect = buyJuices(juice1, juice2, juice3);
               if (juiceSelect == 1)
               {
                   quantity = selectedJuice1(juice1, deposite);
                   moneyLeft = moneyLeft1j(juice1, deposite, quantity);
                   spentAmount += juice1.getPrice() * quantity;
                   fileWriter6(juice1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                   
               }
               else if (juiceSelect == 2)
               {
                   quantity = selectedJuice2(juice2, deposite);
                   moneyLeft = moneyLeft2j(juice2, deposite, quantity);
                   spentAmount += juice2.getPrice() * quantity;
                   fileWriter7(juice2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (juiceSelect == 3)
               {
                   quantity = selectedJuice3(juice3, deposite);
                   moneyLeft = moneyLeft3j(juice3, deposite, quantity);
                   spentAmount += juice3.getPrice() * quantity;
                   fileWriter8(juice3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else 
               {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else if(userSelect == 3)
          {
            int chipsSelect = buyChips(chips1, chips2, chips3);
                if (chipsSelect == 1)
                {
                    quantity = selectedChips1(chips1, deposite);
                    moneyLeft = moneyLeft1ch(chips1, deposite, quantity);
                    spentAmount += chips1.getPrice() * quantity;
                    fileWriter9(chips1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(chipsSelect == 2)
                {
                    quantity = selectedChips2(chips2, deposite);
                    moneyLeft = moneyLeft2ch(chips2, deposite, quantity);
                    spentAmount += chips2.getPrice() * quantity;
                    fileWriter10(chips2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(chipsSelect == 3)
                {
                    quantity = selectedChips3(chips3, deposite);
                    moneyLeft = moneyLeft3ch(chips3, deposite, quantity);
                    spentAmount += chips3.getPrice() * quantity;
                    fileWriter11(chips3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else
                {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else if(userSelect == 4)
          {
            int cakeSelect = buyCakes(cake1, cake2, cake3);
                if (cakeSelect == 1)
                {
                    quantity = selectedCake1(cake1, deposite);
                    moneyLeft = moneyLeft1cake(cake1, deposite, quantity);
                    spentAmount += cake1.getPrice() * quantity;
                    fileWriter12(cake1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(cakeSelect == 2)
                {
                    quantity = selectedCake2(cake2, deposite);
                    moneyLeft = moneyLeft2cake(cake2, deposite, quantity);
                    spentAmount += cake2.getPrice() * quantity;
                    fileWriter13(cake2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(cakeSelect == 3)
                {
                    quantity = selectedCake3(cake3, deposite);
                    moneyLeft = moneyLeft3cake(cake3, deposite, quantity);
                    spentAmount += cake3.getPrice() * quantity;
                    fileWriter14(cake3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else
                {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else if (userSelect == 5)
          {
            int cookieSelect = buyCookies(cookie1, cookie2, cookie3);
               if (cookieSelect == 1)
               {
                  quantity = selectedCookie1(cookie1, deposite);
                  moneyLeft = moneyLeft1cookies(cookie1, deposite, quantity);
                  spentAmount += cookie1.getPrice() * quantity;
                  fileWriter15(cookie1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (cookieSelect == 2)
               {
                  quantity = selectedCookie2(cookie2, deposite);
                  moneyLeft = moneyLeft2cookies(cookie2, deposite, quantity);
                  spentAmount += cookie2.getPrice() * quantity;
                  fileWriter16(cookie2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (cookieSelect == 3)
               {
                  quantity = selectedCookie3(cookie3, deposite);
                  moneyLeft = moneyLeft3cookies(cookie3, deposite, quantity);
                  spentAmount += cookie3.getPrice() * quantity;
                  fileWriter17(cookie3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else if (userSelect == 6)
          {
            int teaSelect = buyTea(tea1, tea2, tea3);
               if (teaSelect == 1)
               {
                  quantity = selectedTea1(tea1, deposite);
                  moneyLeft = moneyLeft1tea(tea1, deposite, quantity);
                  spentAmount += tea1.getPrice() * quantity;
                  fileWriter18(tea1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (teaSelect == 2)
               {
                  quantity = selectedTea2(tea2, deposite);
                  moneyLeft = moneyLeft2tea(tea2, deposite, quantity);
                  spentAmount += tea2.getPrice() * quantity;
                  fileWriter19(tea2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (teaSelect == 3)
               {
                  quantity = selectedTea3(tea3, deposite);
                  moneyLeft = moneyLeft3tea(tea3, deposite, quantity);
                  spentAmount += tea3.getPrice() * quantity;
                  fileWriter20(tea3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else if (userSelect == 7)
          {
            int coffeeSelect = buyCoffee(coffee1, coffee2, coffee3);
               if (coffeeSelect == 1)
               {
                  quantity = selectedCoffee1(coffee1, deposite);
                  moneyLeft = moneyLeft1coffee(coffee1, deposite, quantity);
                  spentAmount += coffee1.getPrice() * quantity;
                  fileWriter21(coffee1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (coffeeSelect == 2)
               {
                  quantity = selectedCoffee2(coffee2, deposite);
                  moneyLeft = moneyLeft2coffee(coffee2, deposite, quantity);
                  spentAmount += coffee2.getPrice() * quantity;
                  fileWriter22(coffee2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (coffeeSelect == 3)
               {
                  quantity = selectedCoffee3(coffee3, deposite);
                  moneyLeft = moneyLeft3coffee(coffee3, deposite, quantity);
                  spentAmount += coffee3.getPrice() * quantity;
                  fileWriter23(coffee3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                   System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
                }
          }
          else 
          {
            System.err.println("System has Over Turned..");
            System.out.println("Invalid Option Selected..");
            System.out.println();
            System.out.println("Your Deposited Amount: " +deposite);
            System.out.println("Returned Amount: " +deposite);
            System.out.println("Collect Your Money..");
            System.out.println();
            System.out.println("Redirecting New Window..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            main(null);
          }


        while (true) {
            System.out.print("Do You Like To Buy Another Product: ");
            System.out.print(".(01). Yes.                .(02). Exit.");

          
            int select = input.nextInt();
            if (select == 1 && moneyLeft >= 30){
                int newSelection = whatToDo(moneyLeft);
                if(newSelection == 1)
          {
            int coldDrinksSelect = buyColdDrinks(dr1, dr2, dr3, dr4, dr5);
            {
                if (coldDrinksSelect == 1)
                {
                    quantity = selectedDr1(dr1, moneyLeft);
                    moneyLeft = moneyLeft1d(dr1, moneyLeft, quantity);
                    spentAmount += dr1.getPrice() * quantity;
                    newfileWriter1(dr1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 2)
                {
                    quantity = selectedDr2(dr2, moneyLeft);
                    moneyLeft = moneyLeft2d(dr2, moneyLeft, quantity);
                    spentAmount += dr2.getPrice() * quantity;
                    newfileWriter2(dr2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 3)
                {
                    quantity = selectedDr3(dr3, moneyLeft);
                    moneyLeft = moneyLeft3d(dr3, moneyLeft, quantity);
                    spentAmount += dr3.getPrice() * quantity;
                    newfileWriter3(dr3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 4)
                {
                    quantity = selectedDr4(dr4, moneyLeft);
                    moneyLeft = moneyLeft4d(dr4, moneyLeft, quantity);
                    spentAmount += dr4.getPrice() * quantity;
                    newfileWriter4(dr4, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if (coldDrinksSelect == 5)
                {
                    quantity = selectedDr5(dr5, moneyLeft);
                    moneyLeft = moneyLeft5d(dr5, moneyLeft, quantity);
                    spentAmount += dr5.getPrice() * quantity;
                    newfileWriter5(dr5, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else 
                {
                    System.out.println("Invalid Option Selected..");
                }
            }
          }
          else if(newSelection == 2)
          {
            int juiceSelect = buyJuices(juice1, juice2, juice3);
               if (juiceSelect == 1)
               {
                   quantity = selectedJuice1(juice1, moneyLeft);
                   moneyLeft = moneyLeft1j(juice1, moneyLeft, quantity);
                   spentAmount += juice1.getPrice() * quantity;
                   newfileWriter6(juice1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                   
               }
               else if (juiceSelect == 2)
               {
                   quantity = selectedJuice2(juice2, moneyLeft);
                   moneyLeft = moneyLeft2j(juice2, moneyLeft, quantity);
                   spentAmount += juice2.getPrice() * quantity;
                   newfileWriter7(juice2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (juiceSelect == 3)
               {
                   quantity = selectedJuice3(juice3, moneyLeft);
                   moneyLeft = moneyLeft3j(juice3, moneyLeft, quantity);
                   spentAmount += juice3.getPrice() * quantity;
                   newfileWriter8(juice3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else 
               {
                   System.out.println("Invalid Option Selected..");
               }
          }
          else if(newSelection == 3)
          {
            int chipsSelect = buyChips(chips1, chips2, chips3);
                if (chipsSelect == 1)
                {
                    quantity = selectedChips1(chips1, moneyLeft);
                    moneyLeft = moneyLeft1ch(chips1, moneyLeft, quantity);
                    spentAmount += chips1.getPrice() * quantity;
                    newfileWriter9(chips1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(chipsSelect == 2)
                {
                    quantity = selectedChips2(chips2, moneyLeft);
                    moneyLeft = moneyLeft2ch(chips2, moneyLeft, quantity);
                    spentAmount += chips2.getPrice() * quantity;
                    newfileWriter10(chips2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(chipsSelect == 3)
                {
                    quantity = selectedChips3(chips3, moneyLeft);
                    moneyLeft = moneyLeft3ch(chips3, moneyLeft, quantity);
                    spentAmount += chips3.getPrice() * quantity;
                    newfileWriter11(chips3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else
                {
                   
                   System.out.println("Invalid Option Selected..");
                }
          }
          else if(newSelection == 4)
          {
            int cakeSelect = buyCakes(cake1, cake2, cake3);
                if (cakeSelect == 1)
                {
                    quantity = selectedCake1(cake1, moneyLeft);
                    moneyLeft = moneyLeft1cake(cake1, moneyLeft, quantity);
                    spentAmount += cake1.getPrice() * quantity;
                    newfileWriter12(cake1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(cakeSelect == 2)
                {
                    quantity = selectedCake2(cake2, moneyLeft);
                    moneyLeft = moneyLeft2cake(cake2, moneyLeft, quantity);
                    spentAmount += cake2.getPrice() * quantity;
                    newfileWriter13(cake2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else if(cakeSelect == 3)
                {
                    quantity = selectedCake3(cake3, moneyLeft);
                    moneyLeft = moneyLeft3cake(cake3, moneyLeft, quantity);
                    spentAmount += cake3.getPrice() * quantity;
                    newfileWriter14(cake3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
                }
                else
                {
                   
                   System.out.println("Invalid Option Selected..");
                
                }
          }
          else if (newSelection == 5)
          {
            int cookieSelect = buyCookies(cookie1, cookie2, cookie3);
               if (cookieSelect == 1)
               {
                  quantity = selectedCookie1(cookie1, moneyLeft);
                  moneyLeft = moneyLeft1cookies(cookie1, moneyLeft, quantity);
                  spentAmount += cookie1.getPrice() * quantity;
                  newfileWriter15(cookie1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (cookieSelect == 2)
               {
                  quantity = selectedCookie2(cookie2, moneyLeft);
                  moneyLeft = moneyLeft2cookies(cookie2, moneyLeft, quantity);
                  spentAmount += cookie2.getPrice() * quantity;
                  newfileWriter16(cookie2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (cookieSelect == 3)
               {
                  quantity = selectedCookie3(cookie3, moneyLeft);
                  moneyLeft = moneyLeft3cookies(cookie3, moneyLeft, quantity);
                  spentAmount += cookie3.getPrice() * quantity;
                  newfileWriter17(cookie3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                 
                   System.out.println("Invalid Option Selected..");
                   
                }
          }
          else if (newSelection == 6)
          {
            int teaSelect = buyTea(tea1, tea2, tea3);
               if (teaSelect == 1)
               {
                  quantity = selectedTea1(tea1, moneyLeft);
                  moneyLeft = moneyLeft1tea(tea1, moneyLeft, quantity);
                  spentAmount += tea1.getPrice() * quantity;
                  newfileWriter18(tea1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (teaSelect == 2)
               {
                  quantity = selectedTea2(tea2, moneyLeft);
                  moneyLeft = moneyLeft2tea(tea2, moneyLeft, quantity);
                  spentAmount += tea2.getPrice() * quantity;
                  newfileWriter19(tea2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (teaSelect == 3)
               {
                  quantity = selectedTea3(tea3, moneyLeft);
                  moneyLeft = moneyLeft3tea(tea3, moneyLeft, quantity);
                  spentAmount += tea3.getPrice() * quantity;
                  newfileWriter20(tea3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                   System.out.println("Invalid Option Selected..");
                }
          }
          else if (newSelection == 7)
          {
            int coffeeSelect = buyCoffee(coffee1, coffee2, coffee3);
               if (coffeeSelect == 1)
               {
                  quantity = selectedCoffee1(coffee1, moneyLeft);
                  moneyLeft = moneyLeft1coffee(coffee1, moneyLeft, quantity);
                  spentAmount += coffee1.getPrice() * quantity;
                  newfileWriter21(coffee1, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (coffeeSelect == 2)
               {
                  quantity = selectedCoffee2(coffee2, moneyLeft);
                  moneyLeft = moneyLeft2coffee(coffee2, moneyLeft, quantity);
                  spentAmount += coffee2.getPrice() * quantity;
                  newfileWriter22(coffee2, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else if (coffeeSelect == 3)
               {
                  quantity = selectedCoffee3(coffee3, moneyLeft);
                  moneyLeft = moneyLeft3coffee(coffee3, moneyLeft, quantity);
                  spentAmount += coffee3.getPrice() * quantity;
                  newfileWriter23(coffee3, deposite, quantity, spentAmount, paymentNo, tokenNumber);
               }
               else
                {
                   System.out.println("Invalid Option Selected..");
                }
          }
          else
          {
            System.out.println("Invalid Option Selected..");
            
          }

            }
            else if (select == 2)
            {
                System.out.println("Your Token Number: " + tokenNumber);
                mainMenu(moneyLeft);
                return;
            }
            else if (moneyLeft <= 29) {
                System.out.println("Not Enough Money, Purchase Limit Reached.");
                System.out.println("Your Token Number: " + tokenNumber);
                mainMenu(moneyLeft);
                return;
                
            }
            else {
                System.out.println("Select Valid Option...");
            }
            
        }
       


   }
            
   


            
        
      
          

    private static void mainMenu(int $) {
        Scanner input = new Scanner(System.in);
        int opt;

        if ($ == 0) {
        System.out.println("Select Option TO Continue Buying:\n------------------");
        System.out.println(".(1)  Insert Money.");
        System.out.println(".(2)  View Items.");
        System.out.println(".(3)  Check  Information. [For Security Purposes]");
        System.out.println("\n      You have: " +$+ " BDT");
        System.out.println("[Note: Do not Enter Wrong Option to Avoid Penalty]");
        System.out.println();
        }
        else 
        {
            System.out.println("Select Option TO Continue Buying:\n------------------");
        System.out.println(".(1)  Recover Wastage and Get Refund.");
        System.out.println(".(2)  Check  Information. [For Security Purposes]");
        System.out.println("\n      You have: " +$+ " BDT");
        System.out.println("[Note: Do not Enter Wrong Option to Avoid Penalty]");
        System.out.println();
        opt = input.nextInt();
          if (opt == 1)
          {
            System.out.println("Balance Left: " +$);
            System.out.println("Put the Wastages into the Box and get Refund...");
            System.out.println("..(01).. Done      ...(02).. No");
            int useropt = input.nextInt();
            if (useropt == 1 ) {
               System.out.println("Collect Your Money" +($+5));
               System.out.println("Thanks For Purchasing..");
               return;
           }
           else if (useropt == 2) {
            System.out.println("You've Got a panalty..");
            System.out.println("Collect Your Money" +($/2));
            System.out.println("Thanks For Purchasing..");
            return;
           }
           else 
           {
            System.out.println("You've Got a panalty..");
            System.out.println("Collect Your Money" +($/2));
            System.out.println("Thanks For Purchasing..");
            return;
           }
          }
          else if (opt == 2) {
            System.out.println("Enter Password: ");
            String pass = input.nextLine();
            if (pass.equals("oop")) {
            viewData();
            mainMenu($);
            }
            else {
                System.out.println("Wrong Password: ");
                mainMenu($);
            }
          }
        else {
            System.out.println("Error Option: You've got a panalty..");
            System.out.println("Collect Your Money: " +($/2));
        }
        }
       
    }
    
    private static int enteredOptions() {
            int userCmd;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter An Option To Continue..");
            userCmd = input.nextInt();
           
           
            return (userCmd);
            
        }


    private static int enteredAmount() {
            int userInputAmount;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount to deposite (available deposite From 30 BDT to 15000 BDT):");
            userInputAmount = input.nextInt();
            if (userInputAmount <= 29 || userInputAmount > 15000) 
            {
                System.err.println("..Amount is not Applicable..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main(null);
            }
            System.out.println("Your Balance: " + userInputAmount);
            return (userInputAmount);

        }

        private static Long MobileNo() {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Mobile Number:");
           System.out.print("+880-");
           return (long) (input.nextInt());
        
        }

    private static int paymentOpt() {
        int opt;
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a Payment Option:\n.(1). Cash:\n.(2). Bkash:\n.(3). Nagad:\n.(04). Rocket:\n.(05). Upay:\n.(06). Bank Card:");
            opt = input.nextInt();
            if (opt <= 0 || opt >= 7)
            {
               System.out.println("Enter Valid option..");
               opt = input.nextInt();
               if (opt <= 0 || opt >= 7)
               {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
               }
               else 
               {
                return (opt);
               }
            }
            return (opt);

    }

    private static void cash(int deposite) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("Put your following amount of Money in the Drop Box..");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            cash(deposite);
        }
        

    }

    private static void Bkash(int deposite) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("#: Marchants Account Number: +8801xxxxxxxxx\n..Pay to Bkash Payment...");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            Bkash(deposite);
        }
    }

    private static void Nagad(int deposite) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("#: Marchants Account Number: +8801xxxxxxxxx\n..Pay to Nagad Payment...");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            Nagad(deposite);
        }

    }

    private static void Rocket(int deposite) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("#: Marchants Account Number: +8801xxxxxxxxx\n..Pay to Rocket Payment...");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            Rocket(deposite);
        }

    }

    private static void upay(int deposite){
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("#: Marchants Account Number: +8801xxxxxxxxx\n..Pay to Upay Payment...");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            upay(deposite);
        }
    }

    private static void card(int deposite) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Payment Amount: "+deposite);
        System.out.println("Card Number: xxxx-xxxx-xxxx-xxxx\n..pay to: ac-no: xxxx-xxxx-xxxx-xxxx");
        System.out.println("Options: ");
        System.out.println(".(1). Done"+"                                  "+" .(2). Exit");
        opt = input.nextInt();

        if (opt == 1) 
        {
            System.out.println("Your Transection is Processing,, Please wait...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Your Deposite is Completed Succesfully");
            
        }
       
        else if (opt == 2)
        {
            main(null);
        }
        else
        {
            System.out.println("Select Valid Options");
            Bkash(deposite);
        }

    }

    private static int whatToDo(int deposite){
        int opt;
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to buy?");
        System.out.println(".(1)- Cold-Drinks.\n.(2)- Juice.\n.(3)- Chips.\n.(4)- Cakes.\n.(5)- Cookies.\n.(6)- Tea.\n.(7)- Coffee.\nOptions:\n.(8)- Main Menu!");
        System.out.println("Enter item:");
        opt = input.nextInt();

        return (opt);
       
    }

    public static String generateToken(int length) 
    {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = upperCaseLetters.toLowerCase();
        String numbers = "0123456789";

        String allChars = upperCaseLetters + lowerCaseLetters + numbers;

        Random random = new Random();
        char[] token = new char[length];
        Set<Character> usedChars = new HashSet<>();

        for (int i = 0; i < length; i++) {
            char randomChar;
            do {
                randomChar = allChars.charAt(random.nextInt(allChars.length()));
            } while (usedChars.contains(randomChar));
            token[i] = randomChar;
            usedChars.add(randomChar);
        }

        return new String(token);
    }

    private static int whatToView ()
    {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Select Item To View Product:");
        System.out.println();
        System.out.println(".(01). Cold Drink-");
        System.out.println(".(02). Juice Items-");
        System.out.println(".(03). Chips-");
        System.out.println(".(04). Cakes-");
        System.out.println(".(05). Cookies-");
        System.out.println(".(06). Other Item-");
        System.out.println("Please Enter:-");
        opt = input.nextInt();

        return (opt);
    }

    private static void colddr(drinks dr1, drinks dr2, drinks dr3, drinks dr4, drinks dr5, int $) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "                         wet      " + "       price    " + "      Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+dr1.getName()+"                        |"+dr1.getWet()+" ml|         |"+dr1.getPrice()+" BDT|           |"+dr1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+dr2.getName()+"                          |"+dr2.getWet()+" ml|         |"+dr2.getPrice()+" BDT|           |"+dr2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+dr3.getName()+"                            |"+dr3.getWet()+" ml|         |"+dr3.getPrice()+" BDT|           |"+dr3.getRefund()+" BDT| ");
        System.out.println("  "+".(04). "+dr4.getName()+"                           |"+dr4.getWet()+" ml|         |"+dr4.getPrice()+" BDT|           |"+dr4.getRefund()+" BDT| ");
        System.out.println("  "+".(05). "+dr5.getName()+"              |"+dr5.getWet()+" ml|         |"+dr5.getPrice()+" BDT|           |"+dr5.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
        }
    
        else
        {
            main(null);
        }
    }

    private static void juiceItems(juice juice1, juice juice2, juice juice3, int $) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "           wet      " + "      price    " + "     Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+juice1.getName()+"      |"+juice1.getWet()+" ml|         |"+juice1.getPrice()+" BDT|           |"+juice1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+juice2.getName()+"       |"+juice2.getWet()+" ml|         |"+juice2.getPrice()+" BDT|           |"+juice2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+juice3.getName()+"          |"+juice3.getWet()+" ml|         |"+juice3.getPrice()+" BDT|           |"+juice3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
        }
    
        else
        {
            main(null);
        }
    }

    private static void chipsItems(Chips chips1, Chips chips2, Chips chips3, int $){
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "                   wet      " + "         price    " + "    Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+chips1.getName()+"       |"+chips1.getWet()+" ml|           |"+chips1.getPrice()+" BDT|           |"+chips1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+chips2.getName()+"                 |"+chips2.getWet()+" ml|           |"+chips2.getPrice()+" BDT|           |"+chips2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+chips3.getName()+"                     |"+chips3.getWet()+" ml|           |"+chips3.getPrice()+" BDT|           |"+chips3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();  
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {                  
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
            if (opt <= 0 || opt >= 2)
            {
                System.out.println("Enter Valid Option...");
                opt = input.nextInt();
                if (opt >= 0)
                {
                    main(null);
                }
            }
            else 
            {
                main(null);
            }
        }
    
        else
        {
            main(null);
        }
    }

    private static void cakesItem (Cakes Cake1, Cakes Cake2, Cakes Cake3, int $) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "            wet      " + "            price    " + "       Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+Cake1.getName()+"       |"+Cake1.getWet()+" ml|               |"+Cake1.getPrice()+" BDT|             |"+Cake1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+Cake2.getName()+"      |"+Cake2.getWet()+" ml|               |"+Cake2.getPrice()+" BDT|             |"+Cake2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+Cake3.getName()+"           |"+Cake3.getWet()+" ml|               |"+Cake3.getPrice()+" BDT|             |"+Cake3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
        }
    
        else
        {
            main(null);
        }
    }

    private static void cookiesItems(Cookies cookie1, Cookies cookie2, Cookies cookie3, int $) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "            wet      " + "        price    " + "      Available Refund    ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+cookie1.getName()+"         |"+cookie1.getWet()+" ml|           |"+cookie1.getPrice()+" BDT|           |"+cookie1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+cookie2.getName()+"              |"+cookie2.getWet()+" ml|           |"+cookie2.getPrice()+" BDT|           |"+cookie2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+cookie3.getName()+"         |"+cookie3.getWet()+" ml|           |"+cookie3.getPrice()+" BDT|           |"+cookie3.getRefund()+" BDT| ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
        }
    
        else
        {
            main(null);
        }
    }

    private static void otherItems(Tea tea1, Tea tea2, Tea tea3, Coffee coffee1, Coffee coffee2, Coffee coffee3, int $) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("          Name:   " + "            wet      " + "         price    " + "     Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+tea1.getName()+"          |"+tea1.getWet()+" ml|           |"+tea1.getPrice()+" BDT|           |"+tea1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+tea2.getName()+"        |"+tea2.getWet()+" ml|           |"+tea2.getPrice()+" BDT|           |"+tea2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+tea3.getName()+"        |"+tea3.getWet()+" ml|           |"+tea3.getPrice()+" BDT|           |"+tea3.getRefund()+" BDT| ");
        System.out.println("  "+".(04). "+coffee1.getName()+"       |"+coffee1.getWet()+" ml|          |"+coffee1.getPrice()+" BDT|           |"+coffee1.getRefund()+" BDT| ");
        System.out.println("  "+".(05). "+coffee2.getName()+"         |"+coffee2.getWet()+" ml|          |"+coffee2.getPrice()+" BDT|           |"+coffee2.getRefund()+" BDT| ");
        System.out.println("  "+".(06). "+coffee3.getName()+"        |"+coffee3.getWet()+" ml|          |"+coffee3.getPrice()+" BDT|           |"+coffee3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("..Enter Option To Continue..");
        System.out.println(" .(01). Main Menu- ");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 2)
        {
            System.out.println("Enter Valid Option...");
            opt = input.nextInt();
        }
       
        else
        {
            main(null);
        }
    }

    private static int buyColdDrinks(drinks dr1, drinks dr2, drinks dr3, drinks dr4, drinks dr5) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("..Cold Drinks Item..");
        System.out.println("          Name:   " + "                         wet      " + "       price    " + "      Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+dr1.getName()+"                        |"+dr1.getWet()+" ml|         |"+dr1.getPrice()+" BDT|           |"+dr1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+dr2.getName()+"                          |"+dr2.getWet()+" ml|         |"+dr2.getPrice()+" BDT|           |"+dr2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+dr3.getName()+"                            |"+dr3.getWet()+" ml|         |"+dr3.getPrice()+" BDT|           |"+dr3.getRefund()+" BDT| ");
        System.out.println("  "+".(04). "+dr4.getName()+"                           |"+dr4.getWet()+" ml|         |"+dr4.getPrice()+" BDT|           |"+dr4.getRefund()+" BDT| ");
        System.out.println("  "+".(05). "+dr5.getName()+"              |"+dr5.getWet()+" ml|         |"+dr5.getPrice()+" BDT|           |"+dr5.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();

        if (opt <= 0 || opt >= 6)
        {
            System.out.println("Select Valid Item To Buy");
            buyColdDrinks(dr1, dr2, dr3, dr4, dr5);
        }

        return (opt);
    }

    private static int buyJuices(juice juice1, juice juice2, juice juice3){
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println("..Juice Item..");
        System.out.println();
        System.out.println("          Name:   " + "           wet      " + "      price    " + "     Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+juice1.getName()+"      |"+juice1.getWet()+" ml|         |"+juice1.getPrice()+" BDT|           |"+juice1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+juice2.getName()+"       |"+juice2.getWet()+" ml|         |"+juice2.getPrice()+" BDT|           |"+juice2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+juice3.getName()+"          |"+juice3.getWet()+" ml|         |"+juice3.getPrice()+" BDT|           |"+juice3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();

        return (opt);
    }

    private static int buyChips(Chips chips1, Chips chips2, Chips chips3) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("          Name:   " + "                   wet      " + "         price    " + "    Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+chips1.getName()+"       |"+chips1.getWet()+" ml|           |"+chips1.getPrice()+" BDT|           |"+chips1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+chips2.getName()+"                 |"+chips2.getWet()+" ml|           |"+chips2.getPrice()+" BDT|           |"+chips2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+chips3.getName()+"                     |"+chips3.getWet()+" ml|           |"+chips3.getPrice()+" BDT|           |"+chips3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();
        return (opt);
    }

    private static int buyCakes(Cakes Cake1, Cakes Cake2, Cakes Cake3) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("          Name:   " + "            wet      " + "            price    " + "       Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+Cake1.getName()+"       |"+Cake1.getWet()+" ml|               |"+Cake1.getPrice()+" BDT|             |"+Cake1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+Cake2.getName()+"      |"+Cake2.getWet()+" ml|               |"+Cake2.getPrice()+" BDT|             |"+Cake2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+Cake3.getName()+"           |"+Cake3.getWet()+" ml|               |"+Cake3.getPrice()+" BDT|             |"+Cake3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();
        
        return (opt);
    }

    private static int buyCookies(Cookies cookie1, Cookies cookie2, Cookies cookie3) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("          Name:   " + "            wet      " + "        price    " + "      Available Refund    ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+cookie1.getName()+"         |"+cookie1.getWet()+" ml|           |"+cookie1.getPrice()+" BDT|           |"+cookie1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+cookie2.getName()+"              |"+cookie2.getWet()+" ml|           |"+cookie2.getPrice()+" BDT|           |"+cookie2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+cookie3.getName()+"         |"+cookie3.getWet()+" ml|           |"+cookie3.getPrice()+" BDT|           |"+cookie3.getRefund()+" BDT| ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item TO Buy");
        opt = input.nextInt();

        return opt;
    }

    private static int buyTea(Tea tea1, Tea tea2, Tea tea3) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("          Name:   " + "            wet      " + "         price    " + "     Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(01). "+tea1.getName()+"          |"+tea1.getWet()+" ml|           |"+tea1.getPrice()+" BDT|           |"+tea1.getRefund()+" BDT| ");
        System.out.println("  "+".(02). "+tea2.getName()+"        |"+tea2.getWet()+" ml|           |"+tea2.getPrice()+" BDT|           |"+tea2.getRefund()+" BDT| ");
        System.out.println("  "+".(03). "+tea3.getName()+"        |"+tea3.getWet()+" ml|           |"+tea3.getPrice()+" BDT|           |"+tea3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();

        return (opt);
    }

    private static int buyCoffee(Coffee coffee1, Coffee coffee2, Coffee coffee3) {
        int opt;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("          Name:   " + "            wet      " + "         price    " + "     Available Refund    ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("  "+".(04). "+coffee1.getName()+"       |"+coffee1.getWet()+" ml|          |"+coffee1.getPrice()+" BDT|           |"+coffee1.getRefund()+" BDT| ");
        System.out.println("  "+".(05). "+coffee2.getName()+"         |"+coffee2.getWet()+" ml|          |"+coffee2.getPrice()+" BDT|           |"+coffee2.getRefund()+" BDT| ");
        System.out.println("  "+".(06). "+coffee3.getName()+"        |"+coffee3.getWet()+" ml|          |"+coffee3.getPrice()+" BDT|           |"+coffee3.getRefund()+" BDT| ");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Select Item To Buy");
        opt = input.nextInt();

        return (opt);

    }

    private static int selectedDr1(drinks dr1, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("You Have: "+deposite+" BDT");
        System.out.println("------------------------------");
        System.out.println("Selected Item..");
        System.out.println("Name: "+dr1.getName());
        System.out.println("Wet: "+dr1.getWet());
        System.out.println("Price: "+dr1.getPrice());
        System.out.println("Tax: "+dr1.getTaxPercent());
        System.out.println("Available Refund: "+dr1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();
        if ((quantity * dr1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(dr1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * dr1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * dr1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1d(drinks dr1, int deposite, int quantity) {
        int money = deposite - (dr1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }
    

    private static int selectedDr2(drinks dr2, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("You Have: "+deposite+" BDT");
        System.out.println("------------------------------");
        System.out.println("Selected Item..");
        System.out.println("Name: "+dr2.getName());
        System.out.println("Wet: "+dr2.getWet());
        System.out.println("Price: "+dr2.getPrice());
        System.out.println("Tax: "+dr2.getTaxPercent());
        System.out.println("Available Refund: "+dr2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * dr2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(dr2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * dr2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * dr2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2d(drinks dr2, int deposite, int quantity) {
        int money = deposite - (dr2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedDr3(drinks dr3, int deposite) {
        int quantity;
        System.out.println("------------------------------");
        System.out.println("You Have: "+deposite+" BDT");
        System.out.println("------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+dr3.getName());
        System.out.println("Wet: "+dr3.getWet());
        System.out.println("Price: "+dr3.getPrice());
        System.out.println("Tax: "+dr3.getTaxPercent());
        System.out.println("Available Refund: "+dr3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * dr3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(dr3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * dr3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * dr3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3d(drinks dr3, int deposite, int quantity) {
        int money = deposite - (dr3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedDr4(drinks dr4, int deposite) {
        int quantity;
        System.out.println("------------------------------");
        System.out.println("You Have: "+deposite+" BDT");
        System.out.println("------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+dr4.getName());
        System.out.println("Wet: "+dr4.getWet());
        System.out.println("Price: "+dr4.getPrice());
        System.out.println("Tax: "+dr4.getTaxPercent());
        System.out.println("Available Refund: "+dr4.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * dr4.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(dr4.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * dr4.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * dr4.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft4d(drinks dr4, int deposite, int quantity) {
        int money = deposite - (dr4.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedDr5(drinks dr5, int deposite) {
        int quantity;
        System.out.println("------------------------------");
        System.out.println("You Have: "+deposite+" BDT");
        System.out.println("------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+dr5.getName());
        System.out.println("Wet: "+dr5.getWet());
        System.out.println("Price: "+dr5.getPrice());
        System.out.println("Tax: "+dr5.getTaxPercent());
        System.out.println("Available Refund: "+dr5.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * dr5.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(dr5.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * dr5.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * dr5.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft5d(drinks dr5, int deposite, int quantity) {
        int money = deposite - (dr5.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedJuice1(juice juice1, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+juice1.getName());
        System.out.println("Wet: "+juice1.getWet());
        System.out.println("Price: "+juice1.getPrice());
        System.out.println("Tax: "+juice1.getTaxPercent());
        System.out.println("Available Refund: "+juice1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * juice1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(juice1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * juice1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * juice1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1j(juice juice1, int deposite, int quantity) {
        int money = deposite - (juice1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedJuice2(juice juice2, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+juice2.getName());
        System.out.println("Wet: "+juice2.getWet());
        System.out.println("Price: "+juice2.getPrice());
        System.out.println("Tax: "+juice2.getTaxPercent());
        System.out.println("Available Refund: "+juice2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * juice2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(juice2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * juice2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * juice2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2j(juice juice2, int deposite, int quantity) {
        int money = deposite - (juice2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedJuice3(juice juice3, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+juice3.getName());
        System.out.println("Wet: "+juice3.getWet());
        System.out.println("Price: "+juice3.getPrice());
        System.out.println("Tax: "+juice3.getTaxPercent());
        System.out.println("Available Refund: "+juice3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * juice3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(juice3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * juice3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * juice3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3j(juice juice3, int deposite, int quantity) {
        int money = deposite - (juice3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedChips1(Chips chips1, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+chips1.getName());
        System.out.println("Wet: "+chips1.getWet());
        System.out.println("Price: "+chips1.getPrice());
        System.out.println("Tax: "+chips1.getTaxPercent());
        System.out.println("Available Refund: "+chips1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * chips1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(chips1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * chips1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * chips1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1ch(Chips chips1, int deposite, int quantity) {
        int money = deposite - (chips1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }


    private static int selectedChips2(Chips chips2, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+chips2.getName());
        System.out.println("Wet: "+chips2.getWet());
        System.out.println("Price: "+chips2.getPrice());
        System.out.println("Tax: "+chips2.getTaxPercent());
        System.out.println("Available Refund: "+chips2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * chips2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(chips2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * chips2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * chips2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2ch(Chips chips2, int deposite, int quantity) {
        int money = deposite - (chips2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedChips3(Chips chips3, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+chips3.getName());
        System.out.println("Wet: "+chips3.getWet());
        System.out.println("Price: "+chips3.getPrice());
        System.out.println("Tax: "+chips3.getTaxPercent());
        System.out.println("Available Refund: "+chips3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * chips3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(chips3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * chips3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * chips3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3ch(Chips chips3, int deposite, int quantity) {
        int money = deposite - (chips3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }


    private static int selectedCake1(Cakes cake1, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cake1.getName());
        System.out.println("Wet: "+cake1.getWet());
        System.out.println("Price: "+cake1.getPrice());
        System.out.println("Tax: "+cake1.getTaxPercent());
        System.out.println("Available Refund: "+cake1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cake1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cake1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cake1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cake1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1cake(Cakes cake1, int deposite, int quantity) {
        int money = deposite - (cake1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCake2(Cakes cake2, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cake2.getName());
        System.out.println("Wet: "+cake2.getWet());
        System.out.println("Price: "+cake2.getPrice());
        System.out.println("Tax: "+cake2.getTaxPercent());
        System.out.println("Available Refund: "+cake2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cake2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cake2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cake2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cake2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2cake(Cakes cake2, int deposite, int quantity) {
        int money = deposite - (cake2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCake3(Cakes cake3, int deposite) {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cake3.getName());
        System.out.println("Wet: "+cake3.getWet());
        System.out.println("Price: "+cake3.getPrice());
        System.out.println("Tax: "+cake3.getTaxPercent());
        System.out.println("Available Refund: "+cake3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cake3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cake3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cake3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cake3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3cake(Cakes cake3, int deposite, int quantity) {
        int money = deposite - (cake3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCookie1(Cookies cookie1, int deposite)
    {
        int quantity;
        Scanner input= new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cookie1.getName());
        System.out.println("Wet: "+cookie1.getWet());
        System.out.println("Price: "+cookie1.getPrice());
        System.out.println("Tax: "+cookie1.getTaxPercent());
        System.out.println("Available Refund: "+cookie1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cookie1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cookie1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cookie1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cookie1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1cookies(Cookies cookie1, int deposite, int quantity) {
        int money = deposite - (cookie1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCookie2(Cookies cookie2, int deposite)
    {
        int quantity;
        Scanner input= new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cookie2.getName());
        System.out.println("Wet: "+cookie2.getWet());
        System.out.println("Price: "+cookie2.getPrice());
        System.out.println("Tax: "+cookie2.getTaxPercent());
        System.out.println("Available Refund: "+cookie2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cookie2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cookie2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cookie2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cookie2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2cookies(Cookies cookie2, int deposite, int quantity) {
        int money = deposite - (cookie2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCookie3(Cookies cookie3, int deposite)
    {
        int quantity;
        Scanner input= new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+cookie3.getName());
        System.out.println("Wet: "+cookie3.getWet());
        System.out.println("Price: "+cookie3.getPrice());
        System.out.println("Tax: "+cookie3.getTaxPercent());
        System.out.println("Available Refund: "+cookie3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * cookie3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(cookie3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * cookie3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * cookie3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3cookies(Cookies cookie3, int deposite, int quantity) {
        int money = deposite - (cookie3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedTea1(Tea tea1, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+tea1.getName());
        System.out.println("Wet: "+tea1.getWet());
        System.out.println("Price: "+tea1.getPrice());
        System.out.println("Available Refund: "+tea1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * tea1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(tea1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * tea1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * tea1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1tea(Tea tea1, int deposite, int quantity) {
        int money = deposite - (tea1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedTea2(Tea tea2, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+tea2.getName());
        System.out.println("Wet: "+tea2.getWet());
        System.out.println("Price: "+tea2.getPrice());
        System.out.println("Available Refund: "+tea2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * tea2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(tea2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * tea2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * tea2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2tea(Tea tea2, int deposite, int quantity) {
        int money = deposite - (tea2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedTea3(Tea tea3, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+tea3.getName());
        System.out.println("Wet: "+tea3.getWet());
        System.out.println("Price: "+tea3.getPrice());
        System.out.println("Available Refund: "+tea3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * tea3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(tea3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * tea3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * tea3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3tea(Tea tea3, int deposite, int quantity) {
        int money = deposite - (tea3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCoffee1(Coffee coffee1, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+coffee1.getName());
        System.out.println("Wet: "+coffee1.getWet());
        System.out.println("Price: "+coffee1.getPrice());
        System.out.println("Available Refund: "+coffee1.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * coffee1.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(coffee1.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * coffee1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * coffee1.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft1coffee(Coffee coffee1, int deposite, int quantity) {
        int money = deposite - (coffee1.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCoffee2(Coffee coffee2, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+coffee2.getName());
        System.out.println("Wet: "+coffee2.getWet());
        System.out.println("Price: "+coffee2.getPrice());
        System.out.println("Available Refund: "+coffee2.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * coffee2.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(coffee2.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * coffee2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * coffee2.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft2coffee(Coffee coffee2, int deposite, int quantity) {
        int money = deposite - (coffee2.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static int selectedCoffee3(Coffee coffee3, int deposite)
    {
        int quantity;
        Scanner input = new Scanner(System.in);
        System.out.println("Selected Item..");
        System.out.println("Name: "+coffee3.getName());
        System.out.println("Wet: "+coffee3.getWet());
        System.out.println("Price: "+coffee3.getPrice());
        System.out.println("Available Refund: "+coffee3.getRefund());
        System.out.println();
        System.out.println("Enter Quantity: ");
        quantity = input.nextInt();

        if ((quantity * coffee3.getPrice()) > deposite)
        {
            System.out.println("Out of Money.. You can select Quantity up to: " +(coffee3.getPrice()/deposite));
            quantity = input.nextInt();
              if ((quantity * coffee3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }
              else 
              {
                return (quantity);
              }
              
        }
        else if (quantity == 0)
        {
            System.out.println("Invaid Command..");
            quantity = input.nextInt();
             if (quantity == 0)
             {
                System.err.println("System has Over Turned..");
                   System.out.println("Invalid Option Selected..");
                   System.out.println();
                   System.out.println("Your Deposited Amount: " +deposite);
                   System.out.println("Returned Amount: " +deposite);
                   System.out.println("Collect Your Money..");
                   System.out.println();
                   System.out.println("Redirecting New Window..");
                   try {
                   Thread.sleep(3000);
                   } catch (InterruptedException e) {
                   e.printStackTrace();
                   }

                   main(null);
             }
             if ((quantity * coffee3.getPrice()) > deposite)
              {
                System.err.println("System has Over Turned..");
                System.out.println("Invalid Option Selected..");
                System.out.println();
                System.out.println("Your Deposited Amount: " +deposite);
                System.out.println("Returned Amount: " +deposite);
                System.out.println("Collect Your Money..");
                System.out.println();
                System.out.println("Redirecting New Window..");
                try {
                Thread.sleep(3000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }

                main(null);
              }    
             else 
             {
                return (quantity);
             }
        }
        return quantity;
    }

    private static int moneyLeft3coffee(Coffee coffee3, int deposite, int quantity) {
        int money = deposite - (coffee3.getPrice()*quantity);
        System.out.println("You Have: " +money+ " BDT");
        
        return money;
    }

    private static void viewData() {
        if (dataList.isEmpty()) {
            System.out.println("No data available.");
        } else {
            System.out.println("Stored Data:");
            for (String data : dataList) {
                System.out.println(data);
            }
        }

        
    }

    

    private static void fileWriter1(drinks dr1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = dr1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = dr1.getPrice();
            
            double tax = ((dr1.getPrice()*100)/100);
            double refund = dr1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter2(drinks dr2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = dr2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = dr2.getPrice();
            
            double tax = ((dr2.getPrice()*100)/100);
            double refund = dr2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter3(drinks dr3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = dr3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = dr3.getPrice();
            
            double tax = ((dr3.getPrice()*100)/100);
            double refund = dr3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter4(drinks dr4, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = dr4.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = dr4.getPrice();
            
            double tax = ((dr4.getPrice()*100)/100);
            double refund = dr4.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter5(drinks dr5, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = dr5.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = dr5.getPrice();
            
            double tax = ((dr5.getPrice()*100)/100);
            double refund = dr5.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter6(juice juice1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = juice1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = juice1.getPrice();
            
            double tax = ((juice1.getPrice()*100)/100);
            double refund = juice1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter7(juice juice2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = juice2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = juice2.getPrice();
            
            double tax = ((juice2.getPrice()*100)/100);
            double refund = juice2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter8(juice juice3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = juice3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = juice3.getPrice();
            
            double tax = ((juice3.getPrice()*100)/100);
            double refund = juice3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter9(Chips chips1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = chips1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = chips1.getPrice();
            
            double tax = ((chips1.getPrice()*100)/100);
            double refund = chips1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter10(Chips chips2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = chips2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = chips2.getPrice();
            
            double tax = ((chips2.getPrice()*100)/100);
            double refund = chips2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter11(Chips chips3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = chips3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = chips3.getPrice();
            
            double tax = ((chips3.getPrice()*100)/100);
            double refund = chips3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter12(Cakes cake1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cake1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cake1.getPrice();
            
            double tax = ((cake1.getPrice()*100)/100);
            double refund = cake1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter13(Cakes cake2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cake2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cake2.getPrice();
            
            double tax = ((cake2.getPrice()*100)/100);
            double refund = cake2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void fileWriter14(Cakes cake3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cake3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cake3.getPrice();
            
            double tax = ((cake3.getPrice()*100)/100);
            double refund = cake3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter15(Cookies cookie1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cookie1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cookie1.getPrice();
            
            double tax = ((cookie1.getPrice()*100)/100);
            double refund = cookie1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter16(Cookies cookie2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cookie2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cookie2.getPrice();
            
            double tax = ((cookie2.getPrice()*100)/100);
            double refund = cookie2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter17(Cookies cookie3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = cookie3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = cookie3.getPrice();
            
            double tax = ((cookie3.getPrice()*100)/100);
            double refund = cookie3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter18(Tea tea1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = tea1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = tea1.getPrice();
            
            double tax = ((tea1.getPrice()*100)/100);
            double refund = tea1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter19(Tea tea2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = tea2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = tea2.getPrice();
            
            double tax = ((tea2.getPrice()*100)/100);
            double refund = tea2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileWriter20(Tea tea3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = tea3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = tea3.getPrice();
            
            double tax = ((tea3.getPrice()*100)/100);
            double refund = tea3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        
        private static void fileWriter21(Coffee coffee1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
            try {
                String itemName = coffee1.getName();
                Long number = paymentNo;
                String Token = tokenNumber;
                
                
                int price = coffee1.getPrice();
                
                double tax = ((coffee1.getPrice()*100)/100);
                double refund = coffee1.getRefund();
                FileWriter fw = new FileWriter("userData.txt");
                BufferedWriter bw = new BufferedWriter(fw);
    
                dataList.add("..[Product-First]\n"+itemName+ ".");
                dataList.add("..Mobile Number: " +number);
                dataList.add("..Token: " +Token);
               
                dataList.add("..Price: " +price);
                dataList.add("..Tax: " +tax);
                dataList.add("..Available Refund: " +refund);
                dataList.add("\n"); 
    
                bw.close();
                fw.close();
    
                //Unreal-Studio
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }

        private static void fileWriter22(Coffee coffee2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
            try {
                String itemName = coffee2.getName();
                Long number = paymentNo;
                String Token = tokenNumber;
                
                
                int price = coffee2.getPrice();
                
                double tax = ((coffee2.getPrice()*100)/100);
                double refund = coffee2.getRefund();
                FileWriter fw = new FileWriter("userData.txt");
                BufferedWriter bw = new BufferedWriter(fw);
    
                dataList.add("..[Product-First]\n"+itemName+ ".");
                dataList.add("..Mobile Number: " +number);
                dataList.add("..Token: " +Token);
               
                dataList.add("..Price: " +price);
                dataList.add("..Tax: " +tax);
                dataList.add("..Available Refund: " +refund);
                dataList.add("\n"); 
    
                bw.close();
                fw.close();
    
                //Unreal-Studio
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    
    private static void fileWriter23(Coffee coffee3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = coffee3.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = coffee3.getPrice();
            
            double tax = ((coffee3.getPrice()*100)/100);
            double refund = coffee3.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-First]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }
}

private static void newfileWriter1(drinks dr1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = dr1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = dr1.getPrice();
        
        double tax = ((dr1.getPrice()*100)/100);
        double refund = dr1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter2(drinks dr2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = dr2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = dr2.getPrice();
        
        double tax = ((dr2.getPrice()*100)/100);
        double refund = dr2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter3(drinks dr3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = dr3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = dr3.getPrice();
        
        double tax = ((dr3.getPrice()*100)/100);
        double refund = dr3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter4(drinks dr4, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = dr4.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = dr4.getPrice();
        
        double tax = ((dr4.getPrice()*100)/100);
        double refund = dr4.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter5(drinks dr5, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = dr5.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = dr5.getPrice();
        
        double tax = ((dr5.getPrice()*100)/100);
        double refund = dr5.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter6(juice juice1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = juice1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = juice1.getPrice();
        
        double tax = ((juice1.getPrice()*100)/100);
        double refund = juice1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter7(juice juice2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = juice2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = juice2.getPrice();
        
        double tax = ((juice2.getPrice()*100)/100);
        double refund = juice2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter8(juice juice3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = juice3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = juice3.getPrice();
        
        double tax = ((juice3.getPrice()*100)/100);
        double refund = juice3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter9(Chips chips1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = chips1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = chips1.getPrice();
        
        double tax = ((chips1.getPrice()*100)/100);
        double refund = chips1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter10(Chips chips2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = chips2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = chips2.getPrice();
        
        double tax = ((chips2.getPrice()*100)/100);
        double refund = chips2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter11(Chips chips3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = chips3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = chips3.getPrice();
        
        double tax = ((chips3.getPrice()*100)/100);
        double refund = chips3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter12(Cakes cake1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cake1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cake1.getPrice();
        
        double tax = ((cake1.getPrice()*100)/100);
        double refund = cake1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter13(Cakes cake2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cake2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cake2.getPrice();
        
        double tax = ((cake2.getPrice()*100)/100);
        double refund = cake2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}
private static void newfileWriter14(Cakes cake3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cake3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cake3.getPrice();
        
        double tax = ((cake3.getPrice()*100)/100);
        double refund = cake3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter15(Cookies cookie1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cookie1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cookie1.getPrice();
        
        double tax = ((cookie1.getPrice()*100)/100);
        double refund = cookie1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter16(Cookies cookie2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cookie2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cookie2.getPrice();
        
        double tax = ((cookie2.getPrice()*100)/100);
        double refund = cookie2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter17(Cookies cookie3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = cookie3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = cookie3.getPrice();
        
        double tax = ((cookie3.getPrice()*100)/100);
        double refund = cookie3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter18(Tea tea1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = tea1.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = tea1.getPrice();
        
        double tax = ((tea1.getPrice()*100)/100);
        double refund = tea1.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter19(Tea tea2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = tea2.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = tea2.getPrice();
        
        double tax = ((tea2.getPrice()*100)/100);
        double refund = tea2.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static void newfileWriter20(Tea tea3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = tea3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = tea3.getPrice();
        
        double tax = ((tea3.getPrice()*100)/100);
        double refund = tea3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
    private static void newfileWriter21(Coffee coffee1, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = coffee1.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = coffee1.getPrice();
            
            double tax = ((coffee1.getPrice()*100)/100);
            double refund = coffee1.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-after]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void newfileWriter22(Coffee coffee2, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
        try {
            String itemName = coffee2.getName();
            Long number = paymentNo;
            String Token = tokenNumber;
            
            
            int price = coffee2.getPrice();
            
            double tax = ((coffee2.getPrice()*100)/100);
            double refund = coffee2.getRefund();
            FileWriter fw = new FileWriter("userData.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            dataList.add("..[Product-after]\n"+itemName+ ".");
            dataList.add("..Mobile Number: " +number);
            dataList.add("..Token: " +Token);
           
            dataList.add("..Price: " +price);
            dataList.add("..Tax: " +tax);
            dataList.add("..Available Refund: " +refund);
            dataList.add("\n"); 

            bw.close();
            fw.close();

            //Unreal-Studio
        } catch (IOException e) {
            e.printStackTrace();
        }
}


private static void newfileWriter23(Coffee coffee3, int deposite, int quantity, int spentAmount, Long paymentNo, String tokenNumber) {
    try {
        String itemName = coffee3.getName();
        Long number = paymentNo;
        String Token = tokenNumber;
        
        
        int price = coffee3.getPrice();
        
        double tax = ((coffee3.getPrice()*100)/100);
        double refund = coffee3.getRefund();
        FileWriter fw = new FileWriter("userData.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        dataList.add("..[Product-after]\n"+itemName+ ".");
        dataList.add("..Mobile Number: " +number);
        dataList.add("..Token: " +Token);
       
        dataList.add("..Price: " +price);
        dataList.add("..Tax: " +tax);
        dataList.add("..Available Refund: " +refund);
        dataList.add("\n"); 

        bw.close();
        fw.close();

        //Unreal-Studio
    } catch (IOException e) {
        e.printStackTrace();
    }
}


}

