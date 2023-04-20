package behavioral.strategy.implementation.filters;

import behavioral.strategy.implementation.Filter;

public class BlackAndWhiteFilter implements Filter {
    
    @Override
    public void apply(String fileName)
    {
        System.out.println("Applying B&W filter");
    }
}
    

