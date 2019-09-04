class sec_lar_sec_small{
    public static void main(String[] args) 
    {
        int[] elements  = {0 , 2 , 10 , 3, -3 }; 
        int temp;

        for(int i = 0; i<elements.length; i++ )
        {
            for(int j = i+1; j<elements.length; j++)
            {
                if(elements[i]>elements[j])
                {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
        System.out.println("The second smallest number is: " + elements[1]);
        System.out.println("The second largest number is: " + elements[elements.length-2]);
   
    }
}