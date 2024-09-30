public class Limerick extends Poem
{
    private String title;

    public Limerick(String name, int lines, String title)
    {
        super("Limerick",5);
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
