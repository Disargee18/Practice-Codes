
public class Poem
{
    //fields
    private String name;
    private int lines;

    //constructor
    public Poem(String name, int lines)
    {
        this.name = name;
        this.lines = lines;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public int getLines()
    {
        return lines;
    }

    public void display()
    {
        System.out.println("The name of the Poem: "+getName());
        // System.out.println("Title of the Poem: "+getName());
        System.out.println("Number of lines in "+getName()+ ": "+getLines());

    }

    //written by: Argee Paquibot
    //wriiten on VSCode
}