package ai.mspbots.poc.generate;

import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import java.io.File;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Word2Vec wordVectors = WordVectorSerializer.readWord2VecModel(new File("C:\\Users\\jeffery\\Downloads\\glove.twitter.27B\\glove.twitter.27B.200d.txt"));
        WordVectorSerializer.writeWord2VecModel(wordVectors, new File("D:\\download\\glove.6B\\glove.twitter.bin"));
    }
}
