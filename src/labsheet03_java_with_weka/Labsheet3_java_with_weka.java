package labsheet03_java_with_weka;
//Apriori algorithm
import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.Instances;
import weka.associations.Apriori;
public class Labsheet3_java_with_weka {

   public static void main(String[] args) throws Exception{
        //Laod the dataset
        Instances data = new Instances(new BufferedReader(new FileReader("dataset/supermarket.arff")));
        Apriori model = new Apriori();
        
        //Delta value
        model.setDelta(0.05);
        
        //Number of rules
        model.setNumRules(9);
        
        //Lower bound minimum support
        model.setLowerBoundMinSupport(0.1);
        
        //Upper bound minimum support
        model.setUpperBoundMinSupport(1.0);
        //Building the model
        model.buildAssociations(data);
        System.out.println(data);
        
    }

}
