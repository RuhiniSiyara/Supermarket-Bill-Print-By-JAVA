import java.util.*;
class OR25117180_Ruhini_siyara_Coursework_03_BillPrint_II{
	public static void main (String args[]){
		System.out.println("=================================================================================");

	System.out.println("__          __  _                            _          _ __  __            _    ");
	System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |   ");
	System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_  ");
	System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|  ");
	System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |   ");
	System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__| ");
	System.out.println();
	
	System.out.println("=================================================================================");
	System.out.print("\n");
	

		Scanner input=new Scanner(System.in);

		System.out.print("Enter Customer Phone Number - ");
		String phone=input.nextLine();
		System.out.print("\n");

		System.out.print("Enter Customer Name\t    - ");
		String name=input.nextLine();
		System.out.print("\n");
		System.out.print("\n");
	
	System.out.println("=================================================================================");
		System.out.print("\n");
	
	
	System.out.print("Basmathi Qty(kg)- ");
	int a=input.nextInt();
	System.out.print("\n");
	
	System.out.print("Dhal Qty(kg)\t - ");
	int b=input.nextInt();
	System.out.print("\n");

	System.out.print("Sugar Qty(kg)\t - ");
	int c=input.nextInt();
	System.out.print("\n");
	
	System.out.print("Highland Qty\t - ");
	int d=input.nextInt();
	System.out.print("\n");
		
	System.out.print("Youghurt Qty\t - ");
	int e=input.nextInt();
	System.out.print("\n");
	
	System.out.print("Flour Qty(kg)\t - ");
	int f=input.nextInt();
	System.out.print("\n");
	
	System.out.print("Soap Qty\t - ");
	int g=input.nextInt();
	System.out.print("\n");
	
	
	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|                _   __  __          _____ _______              |");
	System.out.println("|               (_) |  \\/  |   /\\   |  __ \\__   __|             |");
	System.out.println("|                _  | \\  / |  /  \\  | |__) | | |                |");
	System.out.println("|               | | | |\\/| | / /\\ \\ |  _  /  | |                |");
	System.out.println("|               | | | |  | |/ ____ \\| | \\ \\  | |                |");
	System.out.println("|               |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                |");
	System.out.println("|\t\t   225,Galle Road,Panadura.\t\t\t|");
	System.out.println("|\t\t\t\t\t\t\t\t|");
	System.out.println("+---------------------------------------------------------------+");
	System.out.println("|                     #Tel  : "+phone+"\t\t\t|");
	phone=input.nextLine();
	
	System.out.println("|                     #Name : "+name+"\t\t\t        |");
	System.out.println("|\t\t\t\t\t\t\t\t|");
	System.out.println("+-----------------+-------------+---------------+---------------+");
	
	System.out.printf("| %-15s |     %5s   |   %-10s  |    %7s    |%n","               ","Qty","Unit Price","Price");
        System.out.println("+-----------------+-------------+---------------+---------------+");
	
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Basmathi", a, 250.0, a * 250.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Dhal", b, 180.0, b * 180.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Sugar", c, 150.0, c * 150.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Highland", d, 1200.0, d * 1200.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Yoghurt", e, 50.0, e * 50.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# flour", f, 120.0, f * 120.0);
	System.out.println("|                 |             |               |               |");
        System.out.printf("| %-15s |     %3d     |    %7.1f    |    %7.1f    |%n", "# Soap", g, 160.0, g * 160.0);
	System.out.println("|                 |             |               |               |");
        System.out.println("+-----------------+-------------+---------------+---------------+");

        double total = (a * 250.0) + (b * 180.0) + (c * 150.0) + (d * 1200.0) + (e * 50.0) + (f * 120.0) + (g * 160.0);
        double discount = total * 0.10; 
        double Price = total - discount;
        System.out.printf("| %-29s |     %5s     |    %7.1f    |%n", " ", "Total", total);
        System.out.println("+                               +---------------+---------------+");
		System.out.printf("| %-29s |  %13s|    %7.1f    |%n", " ", "Discount(10%)", discount);
		System.out.println("+                               +---------------+---------------+");
		System.out.printf("| %-29s |     %5s     |    %7.1f    |%n", " ", "Price", Price);
	
		System.out.println("+-------------------------------+---------------+---------------+");
	
	System.out.print("Enter Customer Given Value (Rs.) - ");
	int cash=input.nextInt();
	System.out.print("\n");
	
	double change=cash-Price;
	System.out.println("\n");
	System.out.println("+-----------------+-------------------+");
	System.out.printf("| %11s   |     %9.1f     |%n", "   Net Amount",(double) Price);
	System.out.println("+-----------------+-------------------+");
	System.out.printf("|    %5s      |     %9.1f     |%n","   Cash", (double)cash);
	System.out.println("+-----------------+-------------------+");
	System.out.printf("|   %7s     |     %9.1f     |%n","   Change", (double)change);
	System.out.println("+-----------------+-------------------+");
	System.out.println("\n");
	    calculateChange(change);
    }

    public static void calculateChange(double amount) {
        int[] denominations = {5000, 2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] changeDistribution = new int[denominations.length];
        int totalNotes = 0;
        int totalCoins = 0;

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                changeDistribution[i] = (int) (amount / denominations[i]);
                amount %= denominations[i];
                if (denominations[i] >= 10) {
                    totalNotes += changeDistribution[i];
                } else {
                    totalCoins += changeDistribution[i];
		}
	}
}

        System.out.println("+-----------------+-----------+");
        System.out.println("|   Value         |   No      |");
        System.out.println("+-----------------+-----------+");
        for (int i = 0; i < denominations.length; i++) {
            System.out.printf("|  Rs.%-6d      |   %-5d   |%n", denominations[i], changeDistribution[i]);
		        System.out.println("+-----------------+-----------+");
        }
       
        System.out.printf("| No of Notes     |   %-5d   |%n", totalNotes);
        System.out.println("+-----------------+-----------+");
        System.out.printf("| No of Coins     |   %-5d   |%n", totalCoins);
        System.out.println("+-----------------+-----------+");

	System.out.println("---------------------------------------------------");
        System.out.println("\n\tTHANK YOU FOR SHOPPING WITH US");
	System.out.println("---------------------------------------------------");
    }
}

