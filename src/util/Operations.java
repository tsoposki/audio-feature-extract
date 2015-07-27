package util;

import preProcessing.PreProcess;

public class Operations {

    private static FormatControlConf fc = new FormatControlConf();
    private static int samplingRate = (int) fc.getRate();
    // int samplePerFrame = 256;//16ms for 8 khz
    private static int samplePerFrame = 512;// 23.22ms

    public static FeatureVector extractFeatureFromExtractedAmplitureByteArray(float[] arrAmp) {
        PreProcess prp = new PreProcess(arrAmp, samplePerFrame, samplingRate);
        FeatureExtract fExt = new FeatureExtract(prp.framedSignal, samplingRate, samplePerFrame);
        fExt.makeMfccFeatureVector();
        return fExt.getFeatureVector();
    }
}
