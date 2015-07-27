import util.FeatureVector;
import util.Operations;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        FeatureVector featureVector;
        File speechFile = new File("D://timska_trajche//converted_new//5_0_1_1.wav"); // change with source of your speech file
        float[] arrAmp = null; // there should be Ampliture Byte Array of the wav file

        featureVector = Operations.extractFeatureFromExtractedAmplitureByteArray(arrAmp);
        System.out.println(featureVector.toString());
    }
}
