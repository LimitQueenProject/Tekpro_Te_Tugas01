/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coc;

/**
 *
 * @author limit
 */

import java.util.Scanner;
public class COC {

    /**
     * @param args the command line arguments
     */
    
    public void dispMenu(){
        System.out.println("1. Lihat Profil");
        System.out.println("2. Ubah Profil");
//        System.out.println("3. Tambahkan Teman");
//        System.out.println("4. Daftar Teman");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        // Membuat profil game COC sendiri interaksi class COC dan Profil
        COC menu = new COC();
        Scanner keyboard = new Scanner(System.in);
        Profil myProfile = new Profil();
                
        byte pilihanMenu;
        boolean exit = false;
        
        // Set myPforil
        myProfile.setNickName("Roy Aziz Barera");
        myProfile.setIdGame("9VRGYURL");
        myProfile.setInClan(true);
        myProfile.setClan("SQUADRON");
        myProfile.setTownHall((byte)10);
        myProfile.setPointTrophy((short)2181);
        myProfile.setTrophy("Cristal");
        
        while(!exit){
            menu.dispMenu();
            System.out.print("Masukan Pilihan Anda : ");
            pilihanMenu = keyboard.nextByte();
            if(pilihanMenu == 1){
                myProfile.dispProfil();
            } else if(pilihanMenu == 2){
                myProfile.editprofil();
            } else if(pilihanMenu == 0){
                System.out.println("thanks bye!");
            }
        }
        keyboard.close();
        
        
        
        
    }
    
}
