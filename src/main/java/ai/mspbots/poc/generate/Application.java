package ai.mspbots.poc.generate;

import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import java.io.File;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Word2Vec wordVectors = WordVectorSerializer.readWord2VecModel(new File("/data/poc/build/glove.6B.300d.txt"));
        WordVectorSerializer.writeWord2VecModel(wordVectors, new File("/data/poc/build/glove.bin"));
    }
}