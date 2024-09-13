

public class Couplet extends Poem 
{
    //fields
    private String title;

    //constructor
    public Couplet(String name, int lines, String title)
    {
        super("Couplet",2);
        this.title = title;
    }    

    @Override
    public void display()
    {
        super.display();
        System.out.println("The title of the poem is: "+this.title);
    }

    //written by: Argee Paquibot
    //wriiten on VSCode
}
