import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    
    int xDirection = 1;
    int yDirection = 1;
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
    
        setLocation(x + 5 * xDirection, y+5 * yDirection);
        
        if(x > 578){
            xDirection = -1; 
        }else if(x < 22){
            xDirection = 1;
        }
        
        if(y > 378){
            yDirection = -1;
        }else if(y < 23){
            yDirection = 1;
        } 
    }
}
