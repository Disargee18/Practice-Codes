public class ProductMain
{
    public static void main(String[]args)
    {
        Products prod = new Products();

        prod.populate();
        prod.search();
        prod.display();
    }
}