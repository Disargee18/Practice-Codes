public class Haiku extends Poem
{
    private String title;

    public Haiku(String name, int lines, String title)
    {
        super("Haiku",3);
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
