package FPGrowth;

import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instances;
import weka.associations.FPGrowth;
public class FPGrowth_with_weka {
    public static void main(String args[]) throws Exception{
        //Load data
        Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff")));
        FPGrowth FPmodel = new FPGrowth();
        
        //Building the model
        FPmodel.buildAssociations(data);
        System.out.println(FPmodel);
    }
}
