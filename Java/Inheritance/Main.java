

public class Main
{
    public  static void main(String[]args)
    {
        //fields
        String name="";
        int lines=0;

        //instantiating the classes
        Poem poem = new Poem(name, lines);
        Poem couplet = new Couplet(name, lines, "A Couplet Poem");
        Poem limerick = new Limerick(name, lines, "A 5 line Poem");
        Poem haiku = new Haiku(name, lines, "Originated in Japan. A Haiku");

        //displaying
        couplet.display();
        System.out.println();
        limerick.display();
        System.out.println();
        haiku.display();

        //written by: Argee Paquibot
        //wriiten on VSCode
    }
}