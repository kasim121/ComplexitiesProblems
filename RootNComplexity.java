class RootNComplexity{

    
    public static void main(String[] args)
    {
        RootNComplexity rc = new RootNComplexity();
        rc.Function(100);

    }
    public void Function(int n)
        {
                int i = 1, s = 1;
                while(s <= n)
                {
                    i++;
                    s = s + i;
                    System.out.print(" *");
                    
                }
        }
}