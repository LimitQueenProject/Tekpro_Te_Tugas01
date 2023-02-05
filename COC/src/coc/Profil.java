/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coc;

/**
 *
 * @author limit
 */
import java.util.Scanner;

public class Profil {
    Scanner keyboard = new Scanner(System.in);
    
    private String nickName;
    private String idGame;
    private byte townHall;
    private String trophy;
    private Short pointTrophy;
    private String clan;
    private boolean inClan;
    
    // pleton
    // spell
    // hero
    // animal
    // machine
    
    public void setNickName(String nickName){
        this.nickName = nickName;
    }
    public String getNickName(){
        return nickName;
    }
    
    public void setIdGame(String idGame){
        this.idGame = idGame;
    }
    public String getIdGame(){
        return idGame;
    }
    
    public void setTownHall(byte townHall){
        this.townHall = townHall;
    }
    public byte getTownHall(){
        return townHall;
    }
    
    public void setTrophy(String trophy){
        this.trophy = trophy;
    }
    public String getTrophy(){
        return trophy;
    }
    
    public void setPointTrophy(Short pointTrophy){
        this.pointTrophy = pointTrophy;
    }
    public Short getPointTrophy(){
        return pointTrophy;
    }
    
    public void setClan(String clan){
        this.clan = clan;
    }
    public String getClan(){
        return clan;
    }
    
    public void setInClan(boolean inClan){
        this.inClan = inClan;
    }
    public boolean getInClan(){
        return inClan;
    }
    
    // Mehtod Display
    public void dispProfil(){
        System.out.println("=========================");
        System.out.println("Nick    : " + nickName);
        System.out.println("Id      : " + idGame);
        if(inClan){
            System.out.println("Clan    : " + clan);
        } else {
            System.out.println("Clan    : Sedang Tidak Dalam Clan");
        }
        System.out.println("Trophy  : " + trophy);
        System.out.println("Point Trophy  : " + pointTrophy);
        System.out.println("=========================");
    }
    
    // edit profil
    public void editprofil(){
        System.out.print("Nama Baru : ");
        setNickName(keyboard.nextLine());
        System.out.println("Profil berhasil diubah");
    }
   
}
