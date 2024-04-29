/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;

import java.util.Scanner;

/**
 *
 * @author 62812
 */
public class bukuteman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][]BT = new String [brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    
    public void Storedata(){
        int idx = 0;
         raktif++;
        if(raktif==brs){
            System.out.println("Data Sudah penuh");
            return;
        }
        if (raktif>0){
            idx = raktif-1;
        }
        System.out.println("Menambahkan data teman");
        System.out.println("=======================");
        System.out.print("Nama: ");
        BT[idx][0]= dtIN.nextLine();
        
        System.out.print("Alamat: ");
        BT[idx][1]= dtIN.nextLine();
        System.out.print("No telepon: ");
        BT[idx][2]= dtIN.nextLine();
        
    }
    public void Update(int idx) {
        System.out.println("Memperbarui data teman");
        System.out.println("========================");
        System.out.print("Nama teman: ");
        BT[idx][0] = dtIN.nextLine();

        System.out.print("Alamat: ");
        BT[idx][1] = dtIN.nextLine();

        System.out.print("No telepon: ");
        BT[idx][2] = dtIN.nextLine();

        System.out.println("Data teman berhasil diperbarui");
    }
     public void Destroy(int idx){
        System.out.println("Menghapus data teman");
        System.out.println("=====================");
        System.out.println("Data teman yang akan dihapus:");
        System.out.println("Nama: " + BT[idx][0]);
        System.out.println("Alamat: " + BT[idx][1]);
        System.out.println("No telepon: " + BT[idx][2]);

        for (int i = idx; i < raktif - 1; i++) {
            BT[i][0] = BT[i + 1][0];
            BT[i][1] = BT[i + 1][1];
            BT[i][2] = BT[i + 1][2];
        }

        BT[raktif - 1][0] = null;
        BT[raktif - 1][1] = null;
        BT[raktif - 1][2] = null;

        raktif--;

        System.out.println("Data teman berhasil dihapus");
    }
    public void Viewdata(){
        int posbrs = 0;
        System.out.println("Daftar teman");
        System.out.println("=====================");
        for(int i=0; i<raktif; i++){
            posbrs++;
            System.out.println(+posbrs+". "+"Nama: "+BT[i][0]);
            System.out.println("Alamat: "+BT[i][1]);
            System.out.println("No Telepon: "+BT[i][2]);
            System.out.println("record number"+1);
        }
    }
}
