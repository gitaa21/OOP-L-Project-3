/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan5;

/**
 *
 * @author taa
 * TGL : 2024-04-29
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           bukuteman BTeman = new bukuteman();
//      BTeman.Storedata();
//      BTeman.Viewdata();
        String ul = "YA";
        do{
            System.out.println("==================");
            System.out.println("A.View Data");
            System.out.println("B.Add Data");
            System.out.println("C.Edit Data");
            System.out.println("D.Delete Data");
            System.out.println("E.Exit");
            System.out.println("==================");
            System.out.print("Choose Option (A/B/C/D/E): ");
            String mPIL = BTeman.dtIN.nextLine();
            switch (mPIL) {
                case "A":
                    BTeman.Viewdata();
                    break;
                case "B":
                    BTeman.Storedata();
                    break;
                case "C":
                    BTeman.Update(0);
                    break;
                case "D":
                    BTeman.Destroy(0);
                    break;
                case "E":
                    ul = "tidak";
                    break;
                default:
                    System.out.println("type A/B/C/D/E");
                    break;
            }
        }while (ul.equals("YA"));
    }
    
}
