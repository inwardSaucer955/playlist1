/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playlist;

/**
 *
 * @author tamal
 */
public class Musicas {
    String title;
    String album;
    String date;
    int time;
    
    //metodos
    
    //primera forma
    //public void Musicas (String _title, String _album, String _date, int _time ){
        //title=_title;
        //album=_album;        
        //date=_date;
        //time=_time;   
   // }
    
    //segunda forma
    public Musicas (String title, String album, String date, int time ){
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;
        
    }
    
    public void Showplaylist(){
        System.out.println("Title" + title);
        System.out.println("album" + album);
        System.out.println("date" + date);
        System.out.println("time" + time);
    }
    
    
    
    
  
}
