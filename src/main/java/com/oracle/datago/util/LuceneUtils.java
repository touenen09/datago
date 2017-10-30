package com.oracle.datago.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

public class LuceneUtils {
	public static List<String> parseKeywords(Analyzer analyzer, String q) {

        List<String> result = new ArrayList<String>();
        TokenStream stream  = analyzer.tokenStream(null, q);
        try {
        	stream.reset();
            while(stream.incrementToken()) {
                result.add(stream.getAttribute(CharTermAttribute.class).toString());
            }
            stream.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        return result;
    }  
}
