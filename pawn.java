import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pawn extends pieces
{
    /**
     * Act - do whatever the pawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage p = new GreenfootImage("\\images\\pawn_white.png");
    
    public pawn(String locationx,String locationy)
    {
        super();
        p.scale(100,100);
        setImage(p);
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
