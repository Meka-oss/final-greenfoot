import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class square extends Actor
{
    /**
     * Act - do whatever the square wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage rectangle = new GreenfootImage(100, 100);
    
    public square(String c)
    {
   
        if(c=="green")
        {
            rectangle.setColor(greenfoot.Color(118,150,86));
        }
        if(c=="white")
        {
            rectangle.setColor(greenfoot.Color.GRAY);
        }
        rectangle.fill();
        setImage(rectangle);
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
