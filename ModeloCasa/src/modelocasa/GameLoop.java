/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelocasa;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author USUARIO
 */
public class GameLoop extends AnimationTimer {

    private GraphicsContext gc; //Vista
    private Image fondo;
    private Image wallpaper;
    private int cont=0;
    private int camb=1;
    private int bajar=1;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
        this.fondo=new Image("Images/silveira_neto_gpl_pixelart_tilese_version_2.png");
        this.wallpaper= new Image ("Images/house.png");
    }
    
    
    
    @Override
    public void handle(long l) {
        gc.clearRect(0, 0, 416, 384); //borrando el tablero
        
        //gc.drawImage(wallpaper, 0, 0);
        gc.drawImage(fondo,325.2,177, 32, 32, 0,0,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,32,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,64,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,96,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,128,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,160,32,32);
        gc.drawImage(fondo,243,2, 32, 32, 0,192,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,224,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,256,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,288,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 0,320,32,32);
        gc.drawImage(fondo,325.2,215, 32, 32, 0,352,32,32);
        gc.drawImage(fondo,325,109, 32, 64, 32,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 64,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 96,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 128,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 160,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 192,0,32,64);
        gc.drawImage(fondo,289,81, 32, 32, 224,0,32,32);
        gc.drawImage(fondo,325,109, 32, 64, 256,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 288,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 320,0,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 352,0,32,64);
        gc.drawImage(fondo,365,176, 32, 32, 384,0,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 224,32,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 224,64,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 224,96,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 224,128,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 224,160,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,32,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,64,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,96,32,32);
        gc.drawImage(fondo,289,118, 32, 32, 384,128,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,160,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,192,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,224,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,256,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,288,32,32);
        gc.drawImage(fondo,365,250, 32, 32, 384,320,32,32);
        gc.drawImage(fondo,365,214, 32, 32, 384,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 352,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 320,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 288,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 256,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 32,352,32,32);
        gc.drawImage(fondo,326,250, 32, 32, 64,352,32,32);
        gc.drawImage(fondo,289,2, 32, 32, 96,352,32,32);
        gc.drawImage(fondo,325,74, 32, 32, 224,352,32,32);
        gc.drawImage(fondo,289,44, 32, 32, 192,352,32,32);
        gc.drawImage(fondo,365,141, 32, 32, 224,320,32,32);
        gc.drawImage(fondo,289,118, 32, 32, 224,192,32,32);
        gc.drawImage(fondo,325,2, 32, 64, 224,224,32,64);
        gc.drawImage(fondo,203,15, 32, 32, 224,288,32,32); // baldosa cafe
        gc.drawImage(fondo,203,15, 32, 32, 128,352,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 160,352,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 256,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 256,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 256,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 256,224,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 256,192,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 288,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 288,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 288,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 288,224,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 288,192,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 320,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 320,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 320,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 352,256,32,32);
        //gc.drawImage(fondo,203,15, 32, 32, 352,288,32,32);
        gc.drawImage(fondo,103,171, 32, 64, 352,288,32,64); // armario
        gc.drawImage(fondo,130,15, 32, 32, 256,64,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 256,96,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 256,128,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 288,64,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 288,96,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 320,64,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 320,96,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 352,64,32,32);
        gc.drawImage(fondo,130,15, 32, 32, 352,96,32,32);
        gc.drawImage(fondo,248,41, 32, 32, 256,160,32,32); // baldosa blanca
        gc.drawImage(fondo,364,2, 32, 64, 288,128,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 320,128,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 352,128,32,64);
        gc.drawImage(fondo,252,180, 64, 96, 320,160,64,96); // cama
        gc.drawImage(fondo,325,109, 32, 64, 32,192,32,64);
        gc.drawImage(fondo,325,109, 32, 64, 64,192,32,64);
        gc.drawImage(fondo,365,73, 32, 64, 96,192,32,64);
        gc.drawImage(fondo,364,2, 32, 64, 192,192,32,64);
        gc.drawImage(fondo,166,15, 32, 32, 160,192,32,32); // baldosa de cocina
        gc.drawImage(fondo,166,15, 32, 32, 128,192,32,32); // baldosa de cocina
        gc.drawImage(fondo,166,15, 32, 32, 192,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 160,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 128,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 96,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 64,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 32,160,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 192,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 160,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 128,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 96,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 64,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 32,128,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 192,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 160,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 128,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 96,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 64,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 32,96,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 192,64,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 160,64,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 128,64,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 96,64,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 64,64,32,32);
        gc.drawImage(fondo,166,15, 32, 32, 32,64,32,32);
        gc.drawImage(fondo,248,41, 32, 32, 128,224,32,32); // baldosa blanca
        gc.drawImage(fondo,248,41, 32, 32, 160,224,32,32); // baldosa blanca
        gc.drawImage(fondo,203,15, 32, 32, 32,256,32,32); // baldosa cafe
        gc.drawImage(fondo,203,15, 32, 32, 64,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 96,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 128,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 160,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 192,256,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 32,288,32,32); // baldosa cafe
        gc.drawImage(fondo,203,15, 32, 32, 64,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 96,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 128,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 160,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 192,288,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 32,320,32,32); // baldosa cafe
        gc.drawImage(fondo,203,15, 32, 32, 64,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 96,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 128,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 160,320,32,32);
        gc.drawImage(fondo,203,15, 32, 32, 192,320,32,32);
        
        //gc.drawImage(fondo,5,10, 32, 40, 192,320,32,40); //inodoro
        //gc.drawImage(fondo,39,8, 32, 43, 192,320,32,43); // lavamanos
        //gc.drawImage(fondo,82,8, 15, 22, 192,320,15,22); // toallas
        //gc.drawImage(fondo,105,8, 15, 12, 192,320,15,12); // cifon
        //gc.drawImage(fondo,5,53, 64, 47, 192,320,64,47); // lavaplatos
        //gc.drawImage(fondo,73,44, 32, 60, 192,320,32,60); // nevera
        //gc.drawImage(fondo,108,63, 64, 30, 192,320,64,30); // comedor
        //gc.drawImage(fondo,175,60, 32, 43, 192,320,32,43); // estufa
        //gc.drawImage(fondo,12,120, 32, 43, 192,320,32,43); // radio
        //gc.drawImage(fondo,60,133, 64, 31, 192,320,64,31); // mueble
        //gc.drawImage(fondo,217,112, 64, 65, 192,320,64,65); // biblioteca
        //gc.drawImage(fondo,8,180, 87, 58, 192,320,87,58); // alfombra
        //gc.drawImage(fondo,144,189, 28, 43, 192,320,28,43); // mata
        //gc.drawImage(fondo,184,185, 17, 15, 192,320,17,15); // comida de perro
        //gc.drawImage(fondo,184,210, 17, 27, 192,320,17,27); // telefono
        //gc.drawImage(fondo,212,184, 28, 20, 192,320,28,20); // tapete pequenio
        
        /*Shape alienRectangulo=new Rectangle(20+camb, 350, 132, 80);
        Shape naveRectangulo=new Rectangle(600,380,30,39);
        Shape interseccion=SVGPath.intersect(alienRectangulo, naveRectangulo);
        
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
          stop();
        }
        
        camb++;
        bajar++;
        
        if(bajar==128){
            bajar=0;
        }
        
        if(camb%10==0){
            cont++;
        }
        if(cont==6){
            cont=0;
        }*/
        
    }
    
    
}


